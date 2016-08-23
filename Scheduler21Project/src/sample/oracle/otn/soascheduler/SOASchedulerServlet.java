package sample.oracle.otn.soascheduler;

import sample.oracle.otn.soascheduler.job.HelloWorldJob;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.Date;
import java.util.Calendar;

import java.util.GregorianCalendar;

import java.util.List;

//import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.AnnualCalendar;
import static org.quartz.impl.matchers.GroupMatcher.*;
import static org.quartz.impl.matchers.KeyMatcher.*;
import static org.quartz.impl.matchers.AndMatcher.*;
import static org.quartz.impl.matchers.OrMatcher.*;
import static org.quartz.impl.matchers.EverythingMatcher.*;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.CronScheduleBuilder.*;
import static org.quartz.TriggerKey.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SOASchedulerServlet extends HttpServlet {
  StdSchedulerFactory schedFact;
  Scheduler sched;
  Logger logger;

  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    logger = LoggerFactory.getLogger(this.getClass().getName());
    try {
      schedFact = new StdSchedulerFactory("soa_quartz.properties");
      sched = schedFact.getScheduler();
      //System.out.println(this.getClass().getName() + " started");
      logger.warn("starting");

      /* 
      // Add the holiday calendar to the schedule
      AnnualCalendar holidays = new AnnualCalendar();

      // fourth of July (July 4)
      Calendar fourthOfJuly = new GregorianCalendar(2011, 7, 4);
      holidays.setDayExcluded(fourthOfJuly, true);
      // halloween (Oct 31)
      Calendar halloween = new GregorianCalendar(2011, 9, 31);
      holidays.setDayExcluded(halloween, true);
      // christmas (Dec 25)
      Calendar christmas = new GregorianCalendar(2011, 11, 25);
      holidays.setDayExcluded(christmas, true);

      // tell the schedule about our holiday calendar
      sched.addCalendar("holidays", holidays, false, false);
      */
      
      sched.start();

      JobDetail jd = newJob(HelloWorldJob.class)
        .withIdentity(JOB_NAME, GROUP_NAME)
        .build();

      String cronExpr = null;
      // Get the cron Expression as an Init parameter
      cronExpr = getInitParameter("cronExpr");
      logger.warn("Cron Expression for " + JOB_NAME + ":" + cronExpr);
      logger.warn("Scheduling Job " + JOB_NAME);

      CronTrigger cronTrigger = newTrigger()
        .withIdentity(TRIGGER_NAME, GROUP_NAME)
        .withSchedule(cronSchedule(cronExpr))
        .build();

      sched.scheduleJob(jd, cronTrigger);
      logger.warn("Job " + JOB_NAME + " scheduled.");

    } catch (Exception e) {
      logger.warn(e.getLocalizedMessage());
      e.printStackTrace();
    }
  }

  public void destroy() {
    try {
      if (sched != null) {
        sched.unscheduleJob(triggerKey(TRIGGER_NAME, JOB_NAME));
        sched.shutdown();
      }
    } catch (Exception e) {
      logger.warn("failed to shutdown: " + e.toString());
      e.printStackTrace();
    }
    //System.out.println(this.getClass().getName() + " stopped");
    logger.warn("stopped");
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) throws ServletException, IOException {
    PrintWriter ajax = new PrintWriter(response.getOutputStream());
    // logger.warning("get");

    String action = request.getParameter("action");
    if ("single".equals(action)) {
      if (sched != null) {
        try {

          SimpleTrigger trigger = (SimpleTrigger)newTrigger()
            .withIdentity("SOASingleTrigger", GROUP_NAME)
            .startAt(new Date()) // some Date
            .forJob(JOB_NAME, GROUP_NAME) // identify job with name, group strings
            .build();

          // Schedule the trigger
          sched.scheduleJob(trigger);
        } catch (Exception e) {
          logger.warn(e.getLocalizedMessage());
          e.printStackTrace();
        }
      }
    } else if ("start".equals(action)) {
      if (sched != null) {
        try {
          JobDetail jd = newJob(HelloWorldJob.class)
            .withIdentity(JOB_NAME, GROUP_NAME)
            .build();

          // Get the cron Expression as an Init parameter
          String cronExpr = getInitParameter("cronExpr");
          logger.warn("Cron Expression for " + JOB_NAME + ":" + cronExpr);
          logger.warn("Scheduling Job " + JOB_NAME);

          CronTrigger cronTrigger = newTrigger()
            .withIdentity(TRIGGER_NAME, GROUP_NAME)
            .withSchedule(cronSchedule(cronExpr))
            .build();

          sched.scheduleJob(jd, cronTrigger);
          logger.warn("Job " + JOB_NAME + " scheduled.");
        } catch (Exception e) {
          logger.warn(e.getLocalizedMessage());
          e.printStackTrace();
        }
      }
    } else if ("stop".equals(action)) {
      if (sched != null) {
        try {
          sched.unscheduleJob(triggerKey(TRIGGER_NAME, GROUP_NAME));
          logger.warn("stopped");
        } catch (Exception e) {
          logger.warn("failed to shutdown: " + e.getLocalizedMessage());
          e.printStackTrace();
        }
      }
    }

    ajax.println("<html>");
    ajax.println("  <head>");
    ajax.println("    <title>SOAScheduler - Web Interface</title>");
    ajax.println("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle.css\"></link>");
    ajax.println("  </head>");
    ajax.println("  <body onload='startAjaxPeriodicalUpdater()'>");
    ajax.println("    <h2>");
    ajax.println("      SOAScheduler @");
    ajax.println("      <span class=\"server\">" + System.getProperty("weblogic.Name") + "</span>");
    ajax.println("    </h2>");

    ajax.println("<table id=\"events_table\" class=\"events_table\" width=\"100%\">");
    ajax.println("<tbody>");

    AnnualCalendar calen;
    CronTrigger cronTrigger;

    try {

      for (String calendar : sched.getCalendarNames()) {
        //logger.info("Calendar: " + calendar);
        calen = (AnnualCalendar)sched.getCalendar(calendar);
        ajax.printf("Calendar: " + calendar);
      }

      for (String group : sched.getJobGroupNames()) {
        //logger.info("Group: " + group + " contains the following jobs");

        for (JobKey jobKey : sched.getJobKeys(jobGroupEquals(group))) {
          //logger.info("- " + jobKey);

          for (TriggerKey triggerKey : sched.getTriggerKeys(triggerGroupEquals(group))) {
            //logger.info("- " + triggerKey);
            Trigger trigger = sched.getTrigger(triggerKey);
            if ("org.quartz.impl.triggers.CronTriggerImpl".equals(trigger.getClass().getName())) {
              cronTrigger = (CronTrigger)trigger;
              ajax.printf("<tr class=\"%s\"><td align=\"left\">Trigger: %s</td><td>Next: %s</td><td>Last: %s</td><td>Cron: %s </td></tr>",
                          "events", triggerKey.getName(),
                          trigger.getNextFireTime(),
                          trigger.getPreviousFireTime(),
                          cronTrigger.getCronExpression());

            } else {
              ajax.printf("<tr class=\"%s\"><td align=\"left\">Trigger: %s</td><td>Next: %s</td></tr>",
                          "events", triggerKey.getName(),
                          trigger.getNextFireTime());
            }
          }
        }
      }

    } catch (Exception e) {
      logger.warn("SOASchdulerServlet failed: " + e.getLocalizedMessage());
      e.printStackTrace();
    }

    ajax.println("</tbody>");
    ajax.println("</table>");
    ajax.flush();
  }

  static final String GROUP_NAME = "SOAGroup";
  static final String TRIGGER_NAME = "SOATrigger";
  static final String JOB_NAME = "SOAJob";
  static final String TARGET_PAGE = "index.jsp";

}
