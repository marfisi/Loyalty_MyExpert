
package org.datacontract.schemas._2004._07.expert_loyalty_domain_services_dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.expert_loyalty_domain_services_dto package. 
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

    private final static QName _ArrayOfErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base", "ArrayOfErrorMessage");
    private final static QName _ErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base", "ErrorMessage");
    private final static QName _ErrorMessageContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base", "Context");
    private final static QName _ErrorMessageDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base", "Description");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.expert_loyalty_domain_services_dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorMessage }
     * 
     */
    public ErrorMessage createErrorMessage() {
        return new ErrorMessage();
    }

    /**
     * Create an instance of {@link ArrayOfErrorMessage }
     * 
     */
    public ArrayOfErrorMessage createArrayOfErrorMessage() {
        return new ArrayOfErrorMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base", name = "ArrayOfErrorMessage")
    public JAXBElement<ArrayOfErrorMessage> createArrayOfErrorMessage(ArrayOfErrorMessage value) {
        return new JAXBElement<ArrayOfErrorMessage>(_ArrayOfErrorMessage_QNAME, ArrayOfErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base", name = "ErrorMessage")
    public JAXBElement<ErrorMessage> createErrorMessage(ErrorMessage value) {
        return new JAXBElement<ErrorMessage>(_ErrorMessage_QNAME, ErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base", name = "Context", scope = ErrorMessage.class)
    public JAXBElement<String> createErrorMessageContext(String value) {
        return new JAXBElement<String>(_ErrorMessageContext_QNAME, String.class, ErrorMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base", name = "Description", scope = ErrorMessage.class)
    public JAXBElement<String> createErrorMessageDescription(String value) {
        return new JAXBElement<String>(_ErrorMessageDescription_QNAME, String.class, ErrorMessage.class, value);
    }

}
