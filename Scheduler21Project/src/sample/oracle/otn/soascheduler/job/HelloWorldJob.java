package sample.oracle.otn.soascheduler.job;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import sample.oracle.otn.soascheduler.proxy.Helloworldprocess_client_ep;
import sample.oracle.otn.soascheduler.proxy.HelloWorldProcess;

import javax.xml.ws.WebServiceRef;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class HelloWorldJob implements Job{
    @WebServiceRef
    private static Helloworldprocess_client_ep helloworldprocess_client;

    public HelloWorldJob() {
        helloworldprocess_client = new Helloworldprocess_client_ep();
    }

    public void execute(JobExecutionContext jobExecutionContext) {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("HelloWorldJob started");
        try {
          helloworldprocess_client = new Helloworldprocess_client_ep();
          HelloWorldProcess helloWorldProcess = helloworldprocess_client.getHelloWorldProcess_pt();
          // Add your code to call the desired methods.
          System.out.println("HelloWorld Response: " + helloWorldProcess.process("SOAScheduler@" + df.format(date)));
 
        } catch (Exception e) {
          System.out.println("HelloWorld Process failed: " + e.toString());
            e.printStackTrace();
        }
    }
}
