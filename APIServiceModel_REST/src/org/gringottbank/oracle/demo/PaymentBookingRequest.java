
package org.gringottbank.oracle.demo;

import java.math.BigInteger;

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
 *         &lt;element name="FintechPaymentRequestId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CustomerToken">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([0-9A-F])+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="creditAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cashAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="finTechID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicalChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         "fintechPaymentRequestId", "customerToken", "creditAmount", "cashAmount", "finTechID", "paymentCategory",
         "salesChannel", "technicalChannel", "region"
    })
@XmlRootElement(name = "paymentBookingRequest")
@Generated("run|43846db7-f59b-48fe-a65a-b8472cd190f8")
public class PaymentBookingRequest {

    @XmlElement(name = "FintechPaymentRequestId", required = true)
    protected BigInteger fintechPaymentRequestId;
    @XmlElement(name = "CustomerToken", required = true)
    protected String customerToken;
    protected float creditAmount;
    protected float cashAmount;
    @XmlElement(required = true)
    protected String finTechID;
    @XmlElement(name = "PaymentCategory", required = true)
    protected String paymentCategory;
    @XmlElement(name = "SalesChannel", defaultValue = "FinTech")
    protected String salesChannel;
    @XmlElement(name = "TechnicalChannel", defaultValue = "API")
    protected String technicalChannel;
    @XmlElement(name = "Region", required = true)
    protected String region;

    /**
     * Gets the value of the fintechPaymentRequestId property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getFintechPaymentRequestId() {
        return fintechPaymentRequestId;
    }

    /**
     * Sets the value of the fintechPaymentRequestId property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setFintechPaymentRequestId(BigInteger value) {
        this.fintechPaymentRequestId = value;
    }

    /**
     * Gets the value of the customerToken property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerToken() {
        return customerToken;
    }

    /**
     * Sets the value of the customerToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerToken(String value) {
        this.customerToken = value;
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
