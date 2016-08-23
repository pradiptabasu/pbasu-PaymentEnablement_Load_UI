package model;

import javax.annotation.Generated;

import javax.ws.rs.client.Client;

@Generated({ "Oracle JDeveloper", "run|43846db7-f59b-48fe-a65a-b8472cd190f8" })
public class PaymentProcessingAPIClient {
    public static void main(String[] args) {
        Client client = PaymentProcessingAPI.createClient();

        PaymentProcessingAPI.Root paymentprocessingapiroot = PaymentProcessingAPI.root(client);

        // add your code here
    }
}
