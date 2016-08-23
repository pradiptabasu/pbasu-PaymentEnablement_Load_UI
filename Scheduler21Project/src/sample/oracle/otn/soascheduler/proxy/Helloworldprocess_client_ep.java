package sample.oracle.otn.soascheduler.proxy;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 100408.1504.05443)

@WebServiceClient(wsdlLocation="http://rbaumgar-at.at.oracle.com:7001/soa-infra/services/default/bpel-101-HelloWorld/helloworldprocess_client_ep?WSDL",
  targetNamespace="http://xmlns.oracle.com/bpel_101_HelloWorld_jws/bpel_101_HelloWorld/HelloWorldProcess",
  name="helloworldprocess_client_ep")
public class Helloworldprocess_client_ep
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("sample.oracle.otn.soascheduler.proxy.Helloworldprocess_client_ep");
      URL baseUrl = Helloworldprocess_client_ep.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            Helloworldprocess_client_ep.class.getResource("http://rbaumgar-at.at.oracle.com:7001/soa-infra/services/default/bpel-101-HelloWorld/helloworldprocess_client_ep?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://rbaumgar-at.at.oracle.com:7001/soa-infra/services/default/bpel-101-HelloWorld/helloworldprocess_client_ep?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://rbaumgar-at.at.oracle.com:7001/soa-infra/services/default/bpel-101-HelloWorld/helloworldprocess_client_ep?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://rbaumgar-at.at.oracle.com:7001/soa-infra/services/default/bpel-101-HelloWorld/helloworldprocess_client_ep?WSDL",
          e);
    }
  }

  public Helloworldprocess_client_ep()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/bpel_101_HelloWorld_jws/bpel_101_HelloWorld/HelloWorldProcess",
                    "helloworldprocess_client_ep"));
  }

  public Helloworldprocess_client_ep(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="HelloWorldProcess_pt")
  public sample.oracle.otn.soascheduler.proxy.HelloWorldProcess getHelloWorldProcess_pt()
  {
    return (sample.oracle.otn.soascheduler.proxy.HelloWorldProcess) super.getPort(new QName("http://xmlns.oracle.com/bpel_101_HelloWorld_jws/bpel_101_HelloWorld/HelloWorldProcess",
                                                                                            "HelloWorldProcess_pt"),
                                                                                  sample.oracle.otn.soascheduler.proxy.HelloWorldProcess.class);
  }

  @WebEndpoint(name="HelloWorldProcess_pt")
  public sample.oracle.otn.soascheduler.proxy.HelloWorldProcess getHelloWorldProcess_pt(WebServiceFeature... features)
  {
    return (sample.oracle.otn.soascheduler.proxy.HelloWorldProcess) super.getPort(new QName("http://xmlns.oracle.com/bpel_101_HelloWorld_jws/bpel_101_HelloWorld/HelloWorldProcess",
                                                                                            "HelloWorldProcess_pt"),
                                                                                  sample.oracle.otn.soascheduler.proxy.HelloWorldProcess.class,
                                                                                  features);
  }
}