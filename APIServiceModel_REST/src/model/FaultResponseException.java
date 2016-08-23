
package model;

import javax.annotation.Generated;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.gringottbank.oracle.demo.FaultResponse;

@Generated("run|43846db7-f59b-48fe-a65a-b8472cd190f8")
public class FaultResponseException extends WebApplicationException {

    private FaultResponse m_faultInfo;

    public FaultResponseException(Response response, FaultResponse faultInfo) {
        super(response);
        m_faultInfo = faultInfo;
    }

    public FaultResponse getFaultInfo() {
        return m_faultInfo;
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

}
