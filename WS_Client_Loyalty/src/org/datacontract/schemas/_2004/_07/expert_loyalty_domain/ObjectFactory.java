
package org.datacontract.schemas._2004._07.expert_loyalty_domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.expert_loyalty_domain package. 
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

    private final static QName _TaglioBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione", "TaglioBuono");
    private final static QName _ArrayOfTaglioBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione", "ArrayOfTaglioBuono");
    private final static QName _TaglioBuonoCodiceExpertBuono_QNAME = new QName("http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione", "CodiceExpertBuono");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.expert_loyalty_domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TaglioBuono }
     * 
     */
    public TaglioBuono createTaglioBuono() {
        return new TaglioBuono();
    }

    /**
     * Create an instance of {@link ArrayOfTaglioBuono }
     * 
     */
    public ArrayOfTaglioBuono createArrayOfTaglioBuono() {
        return new ArrayOfTaglioBuono();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaglioBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione", name = "TaglioBuono")
    public JAXBElement<TaglioBuono> createTaglioBuono(TaglioBuono value) {
        return new JAXBElement<TaglioBuono>(_TaglioBuono_QNAME, TaglioBuono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaglioBuono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione", name = "ArrayOfTaglioBuono")
    public JAXBElement<ArrayOfTaglioBuono> createArrayOfTaglioBuono(ArrayOfTaglioBuono value) {
        return new JAXBElement<ArrayOfTaglioBuono>(_ArrayOfTaglioBuono_QNAME, ArrayOfTaglioBuono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione", name = "CodiceExpertBuono", scope = TaglioBuono.class)
    public JAXBElement<String> createTaglioBuonoCodiceExpertBuono(String value) {
        return new JAXBElement<String>(_TaglioBuonoCodiceExpertBuono_QNAME, String.class, TaglioBuono.class, value);
    }

}
