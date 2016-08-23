
package org.bank.payments;

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
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finTechID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="customerAsset" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
         "paymentID", "customerID", "finTechID", "loanAmount", "customerAsset", "paymentValidationStatus" })
@XmlRootElement(name = "paymentValidationResponse")
public class PaymentValidationResponse {

    protected int paymentID;
    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected String finTechID;
    protected float loanAmount;
    protected float customerAsset;
    @XmlElement(required = true)
    protected String paymentValidationStatus;

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
     * Gets the value of the customerID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the finTechID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinTechID() {
        return finTechID;
    }

    /**
     * Sets the value of the finTechID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinTechID(String value) {
        this.finTechID = value;
    }

    /**
     * Gets the value of the loanAmount property.
     *
     */
    public float getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     *
     */
    public void setLoanAmount(float value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the customerAsset property.
     *
     */
    public float getCustomerAsset() {
        return customerAsset;
    }

    /**
     * Sets the value of the customerAsset property.
     *
     */
    public void setCustomerAsset(float value) {
        this.customerAsset = value;
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
