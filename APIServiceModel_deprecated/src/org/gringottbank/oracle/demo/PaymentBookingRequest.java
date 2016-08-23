
package org.gringottbank.oracle.demo;

import java.math.BigInteger;

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
 *         &lt;element name="paymentID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="customerAsset" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="finTechID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TechnicalChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         "paymentID", "customerID", "loanAmount", "customerAsset", "finTechID", "paymentCategory", "salesChannel",
         "technicalChannel", "region"
    })
@XmlRootElement(name = "paymentBookingRequest")
public class PaymentBookingRequest {

    @XmlElement(required = true)
    protected BigInteger paymentID;
    @XmlElement(required = true)
    protected String customerID;
    protected float loanAmount;
    protected float customerAsset;
    @XmlElement(required = true)
    protected String finTechID;
    @XmlElement(name = "PaymentCategory", required = true)
    protected String paymentCategory;
    @XmlElement(name = "SalesChannel", required = true)
    protected String salesChannel;
    @XmlElement(name = "TechnicalChannel", required = true)
    protected String technicalChannel;
    @XmlElement(name = "Region", required = true)
    protected String region;

    /**
     * Gets the value of the paymentID property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setPaymentID(BigInteger value) {
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
     * Gets the value of the paymentCategory property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentCategory() {
        return paymentCategory;
    }

    /**
     * Sets the value of the paymentCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentCategory(String value) {
        this.paymentCategory = value;
    }

    /**
     * Gets the value of the salesChannel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesChannel(String value) {
        this.salesChannel = value;
    }

    /**
     * Gets the value of the technicalChannel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTechnicalChannel() {
        return technicalChannel;
    }

    /**
     * Sets the value of the technicalChannel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTechnicalChannel(String value) {
        this.technicalChannel = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
