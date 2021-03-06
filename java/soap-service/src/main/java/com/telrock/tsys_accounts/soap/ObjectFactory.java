//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.06 at 12:19:48 PM GMT 
//


package com.telrock.tsys_accounts.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telrock.tsys_accounts.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendMessageTemplate_QNAME = new QName("http://soap.tsys_accounts.telrock.com/", "sendMessageTemplate");
    private final static QName _SendMessageTemplateResponse_QNAME = new QName("http://soap.tsys_accounts.telrock.com/", "sendMessageTemplateResponse");
    private final static QName _SendMessageText_QNAME = new QName("http://soap.tsys_accounts.telrock.com/", "sendMessageText");
    private final static QName _SendMessageTextResponse_QNAME = new QName("http://soap.tsys_accounts.telrock.com/", "sendMessageTextResponse");
    private final static QName _ValidateContactAddress_QNAME = new QName("http://soap.tsys_accounts.telrock.com/", "validateContactAddress");
    private final static QName _ValidateContactAddressResponse_QNAME = new QName("http://soap.tsys_accounts.telrock.com/", "validateContactAddressResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telrock.tsys_accounts.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateContactAddress }
     * 
     */
    public ValidateContactAddress createValidateContactAddress() {
        return new ValidateContactAddress();
    }

    /**
     * Create an instance of {@link ValidateContactAddress.ContactAddressList }
     * 
     */
    public ValidateContactAddress.ContactAddressList createValidateContactAddressContactAddressList() {
        return new ValidateContactAddress.ContactAddressList();
    }

    /**
     * Create an instance of {@link SendMessageTemplate }
     * 
     */
    public SendMessageTemplate createSendMessageTemplate() {
        return new SendMessageTemplate();
    }

    /**
     * Create an instance of {@link SendMessageTemplate.DynamicValues }
     * 
     */
    public SendMessageTemplate.DynamicValues createSendMessageTemplateDynamicValues() {
        return new SendMessageTemplate.DynamicValues();
    }

    /**
     * Create an instance of {@link SendMessageTemplateResponse }
     * 
     */
    public SendMessageTemplateResponse createSendMessageTemplateResponse() {
        return new SendMessageTemplateResponse();
    }

    /**
     * Create an instance of {@link SendMessageText }
     * 
     */
    public SendMessageText createSendMessageText() {
        return new SendMessageText();
    }

    /**
     * Create an instance of {@link SendMessageTextResponse }
     * 
     */
    public SendMessageTextResponse createSendMessageTextResponse() {
        return new SendMessageTextResponse();
    }

    /**
     * Create an instance of {@link ValidateContactAddressResponse }
     * 
     */
    public ValidateContactAddressResponse createValidateContactAddressResponse() {
        return new ValidateContactAddressResponse();
    }

    /**
     * Create an instance of {@link MessageProperties }
     * 
     */
    public MessageProperties createMessageProperties() {
        return new MessageProperties();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link ValidateContactAddress.ContactAddressList.ContactAddress }
     * 
     */
    public ValidateContactAddress.ContactAddressList.ContactAddress createValidateContactAddressContactAddressListContactAddress() {
        return new ValidateContactAddress.ContactAddressList.ContactAddress();
    }

    /**
     * Create an instance of {@link SendMessageTemplate.DynamicValues.Entry }
     * 
     */
    public SendMessageTemplate.DynamicValues.Entry createSendMessageTemplateDynamicValuesEntry() {
        return new SendMessageTemplate.DynamicValues.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tsys_accounts.telrock.com/", name = "sendMessageTemplate")
    public JAXBElement<SendMessageTemplate> createSendMessageTemplate(SendMessageTemplate value) {
        return new JAXBElement<SendMessageTemplate>(_SendMessageTemplate_QNAME, SendMessageTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageTemplateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tsys_accounts.telrock.com/", name = "sendMessageTemplateResponse")
    public JAXBElement<SendMessageTemplateResponse> createSendMessageTemplateResponse(SendMessageTemplateResponse value) {
        return new JAXBElement<SendMessageTemplateResponse>(_SendMessageTemplateResponse_QNAME, SendMessageTemplateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tsys_accounts.telrock.com/", name = "sendMessageText")
    public JAXBElement<SendMessageText> createSendMessageText(SendMessageText value) {
        return new JAXBElement<SendMessageText>(_SendMessageText_QNAME, SendMessageText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageTextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tsys_accounts.telrock.com/", name = "sendMessageTextResponse")
    public JAXBElement<SendMessageTextResponse> createSendMessageTextResponse(SendMessageTextResponse value) {
        return new JAXBElement<SendMessageTextResponse>(_SendMessageTextResponse_QNAME, SendMessageTextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContactAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tsys_accounts.telrock.com/", name = "validateContactAddress")
    public JAXBElement<ValidateContactAddress> createValidateContactAddress(ValidateContactAddress value) {
        return new JAXBElement<ValidateContactAddress>(_ValidateContactAddress_QNAME, ValidateContactAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateContactAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tsys_accounts.telrock.com/", name = "validateContactAddressResponse")
    public JAXBElement<ValidateContactAddressResponse> createValidateContactAddressResponse(ValidateContactAddressResponse value) {
        return new JAXBElement<ValidateContactAddressResponse>(_ValidateContactAddressResponse_QNAME, ValidateContactAddressResponse.class, null, value);
    }

}
