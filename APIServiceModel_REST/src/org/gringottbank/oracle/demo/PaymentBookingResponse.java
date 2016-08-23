
package org.gringottbank.oracle.demo;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paymentBookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "paymentID", "paymentBookingStatus" })
@XmlRootElement(name = "paymentBookingResponse")
@Generated("run|43846db7-f59b-48fe-a65a-b8472cd190f8")
public class PaymentBookingResponse {

    protected int paymentID;
    @XmlElement(required = true)
    protected String paymentBookingStatus;

    /**
     * Gets the value of the paymentID property.
     *
     */
    public int getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     *
     */
    public void setPaymentID(int value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the paymentBookingStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentBookingStatus() {
        return paymentBookingStatus;
    }

    /**
     * Sets the value of the paymentBookingStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentBookingStatus(String value) {
        this.paymentBookingStatus = value;
    }

}
