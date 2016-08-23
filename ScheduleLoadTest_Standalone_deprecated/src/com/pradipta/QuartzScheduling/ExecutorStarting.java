package com.pradipta.QuartzScheduling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.math.BigInteger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SuppressWarnings("oracle.jdeveloper.java.nested-assignment")
public class ExecutorStarting {
    
    private int MYTHREADS = configurationParameters.threadPoolSize;
    private String csvFile = "";


    public void callServicefromFilePayload() throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);

        if (configurationParameters.loadGenerationCategory ==
            configurationParameters.loadGenerationCategoryEnumeration.DEFAULT) {
            csvFile = configurationParameters.csvFileDefaultPayloadFullFilePath;
        //    System.out.println("@@@@@@@ : " + configurationParameters.csvFileDefaultPayloadFullFilePath);
        }
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        BigInteger paymentRequestId;
        String customerID;
        float paymentAmount;
        String finTechID;
        String paymentCategory;
        String salesChannel;
        String technicalChannel;
        String region;

        try {
            br = new BufferedReader(new FileReader(csvFile));

            //skips the line with header columns
            if ((line = br.readLine()) != null) {
            }

            while ((line = br.readLine()) != null) {
                int counter = 0;

                for (; counter < MYTHREADS; counter++) {
                    String[] payload = line.split(cvsSplitBy);

                    paymentRequestId = BigInteger.valueOf(Long.parseLong(payload[0]));
                    customerID = payload[1];
                    paymentAmount = Float.parseFloat(payload[2]);
                    finTechID = payload[3];
                    paymentCategory = payload[4];
                    salesChannel = payload[5];
                    technicalChannel = payload[6];
                    region = payload[7];

                    Runnable worker =
                        new com.pradipta.QuartzScheduling.LoadTestConsole(paymentRequestId, customerID, paymentAmount,
                                                                          finTechID, paymentCategory, salesChannel,
                                                                          technicalChannel, region);
                    executor.execute(worker);

                    Thread.sleep(configurationParameters.threadSleepTime);

                    if (counter < MYTHREADS - 1) {
                        if ((line = br.readLine()) != null) {
                        }
                    }
                }

                executor.shutdown();
                // Wait until all threads are finish
                while (!executor.isTerminated()) {

                }
                executor = Executors.newFixedThreadPool(MYTHREADS);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
