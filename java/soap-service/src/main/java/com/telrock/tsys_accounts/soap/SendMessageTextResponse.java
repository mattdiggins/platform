//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.06 at 12:19:48 PM GMT 
//


package com.telrock.tsys_accounts.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendMessageTextResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendMessageTextResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sendMessageResponse" type="{http://soap.tsys_accounts.telrock.com/}sendMessageResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMessageTextResponse", propOrder = {
    "sendMessageResponse"
})
public class SendMessageTextResponse {

    @XmlElement(required = true)
    protected SendMessageResponse sendMessageResponse;

    /**
     * Gets the value of the sendMessageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SendMessageResponse }
     *     
     */
    public SendMessageResponse getSendMessageResponse() {
        return sendMessageResponse;
    }

    /**
     * Sets the value of the sendMessageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendMessageResponse }
     *     
     */
    public void setSendMessageResponse(SendMessageResponse value) {
        this.sendMessageResponse = value;
    }

}
