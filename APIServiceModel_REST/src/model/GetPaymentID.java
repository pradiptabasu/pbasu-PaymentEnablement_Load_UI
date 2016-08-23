
package model;

import java.net.URI;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.paymentid.grigottbank.PaymentIdResponse;

@Generated(value = {
           "wadl|http://oa8104.us.oracle.com:7003/soa-infra/resources/default/GetPaymentID!1.1/GetPaymentID/application.wadl",
           "run|67a325e0-d537-46d2-9131-eba107f445ea"
    }, comments = "wadl2java, http://wadl.java.net", date = "2016-05-25T19:19:12.204+05:30")
public class GetPaymentID {

    /**
     * The base URI for the resource represented by this proxy
     *
     */
    public final static URI BASE_URI;

    static {
        URI originalURI =
            URI.create("http://oa8104.us.oracle.com:7003/soa-infra/resources/default/GetPaymentID!1.1/GetPaymentID");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = GetPaymentID.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is != null) {
            try {
                // Ignore the namespace in the catalog, can't use wildcard until
                // we are sure we have XPath 2.0
                String found =
                    javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate("/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" +
                                                                                   originalURI + "']/@uri",
                                                                                   new org.xml.sax.InputSource(is));
                if (found != null && found.length() > 0) {
                    originalURI = java.net.URI.create(found);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (java.io.IOException e) {
                }
            }
        }
        BASE_URI = originalURI;
    }

    public static GetPaymentID.Root root(javax.ws.rs.client.Client client, URI baseURI) {
        return new GetPaymentID.Root(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     *
     */
    private static void customizeClientConfiguration(Configurable cc) {
    }

    /**
     * Template method to allow tooling to override Client factory
     *
     */
    private static javax.ws.rs.client.Client createClientInstance() {
        return ClientBuilder.newClient();
    }

    /**
     * Create a new Client instance
     *
     */
    public static javax.ws.rs.client.Client createClient() {
        javax.ws.rs.client.Client client = createClientInstance();
        customizeClientConfiguration(client);
        return client;
    }

    public static GetPaymentID.Root root() {
        return root(createClient(), BASE_URI);
    }

    public static GetPaymentID.Root root(javax.ws.rs.client.Client client) {
        return root(client, BASE_URI);
    }

    public static class Root {

        private javax.ws.rs.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Root(javax.ws.rs.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         *
         */
        public Root(javax.ws.rs.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("/");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public PaymentIdResponse getAsPaymentIdResponse() {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            javax.ws.rs.client.WebTarget resource =
                _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus() >= 400) {
                throw new GetPaymentID.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(PaymentIdResponse.class);
        }

        public <T> T getAsJson(GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            javax.ws.rs.client.WebTarget resource =
                _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (response.getStatus() >= 400) {
                throw new GetPaymentID.WebApplicationExceptionMessage(response);
            }
            return response.readEntity(returnType);
        }

        public <T> T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            javax.ws.rs.client.WebTarget resource =
                _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
            Response response;
            response = resourceBuilder.build("GET").invoke();
            if (!Response.class.isAssignableFrom(returnType)) {
                if (response.getStatus() >= 400) {
                    throw new GetPaymentID.WebApplicationExceptionMessage(response);
                }
            }
            if (!Response.class.isAssignableFrom(returnType)) {
                return response.readEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }


    /**
     * Workaround for JAX_RS_SPEC-312
     *
     */
    private static class WebApplicationExceptionMessage extends WebApplicationException {


        private WebApplicationExceptionMessage(Response response) {
            super(response);
        }

        /**
         * Workaround for JAX_RS_SPEC-312
         *
         */
        public String getMessage() {
            Response response = getResponse();
            Response.Status status = Response.Status.fromStatusCode(response.getStatus());
            if (status != null) {
                return (response.getStatus() + (" " + status.getReasonPhrase()));
            } else {
                return Integer.toString(response.getStatus());
            }
        }

        public String toString() {
            String s = "javax.ws.rs.WebApplicationException";
            String message = getLocalizedMessage();
            return (s + (": " + message));
        }

    }

}
