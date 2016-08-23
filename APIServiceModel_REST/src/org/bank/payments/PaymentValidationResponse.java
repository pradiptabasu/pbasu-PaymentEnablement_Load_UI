
package org.bank.payments;

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
 *         &lt;element name="FintechPaymentRequestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fundsAvailable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cashAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="paymentValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
         "fintechPaymentRequestId", "fundsAvailable", "creditAmount", "cashAmount", "paymentValidationStatus" })
@XmlRootElement(name = "paymentValidationResponse")
@Generated("run|3a41e926-6f62-43f1-a489-f2bf7cdfd5d2")
public class PaymentValidationResponse {

    @XmlElement(name = "FintechPaymentRequestId")
    protected int fintechPaymentRequestId;
    @XmlElement(required = true)
    protected String fundsAvailable;
    protected float creditAmount;
    protected float cashAmount;
    @XmlElement(required = true)
    protected String paymentValidationStatus;

    /**
     * Gets the value of the fintechPaymentRequestId property.
     *
     */
    public int getFintechPaymentRequestId() {
        return fintechPaymentRequestId;
    }

    /**
     * Sets the value of the fintechPaymentRequestId property.
     *
     */
    public void setFintechPaymentRequestId(int value) {
        this.fintechPaymentRequestId = value;
    }

    /**
     * Gets the value of the fundsAvailable property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFundsAvailable() {
        return fundsAvailable;
    }

    /**
     * Sets the value of the fundsAvailable property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFundsAvailable(String value) {
        this.fundsAvailable = value;
    }

    /**
     * Gets the value of the creditAmount property.
     *
     */
    public float getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     *
     */
    public void setCreditAmount(float value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the cashAmount property.
     *
     */
    public float getCashAmount() {
        return cashAmount;
    }

    /**
     * Sets the value of the cashAmount property.
     *
     */
    public void setCashAmount(float value) {
        this.cashAmount = value;
    }

    /**
     * Gets the value of the paymentValidationStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentValidationStatus() {
        return paymentValidationStatus;
    }

    /**
     * Sets the value of the paymentValidationStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentValidationStatus(String value) {
        this.paymentValidationStatus = value;
    }

}
