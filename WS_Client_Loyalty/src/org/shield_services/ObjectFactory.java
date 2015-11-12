
package org.shield_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.shield.ShieldHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.shield_services package. 
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

    private final static QName _ShieldHeader_QNAME = new QName("www.shield-services.org", "shieldHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.shield_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShieldHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "www.shield-services.org", name = "shieldHeader")
    public JAXBElement<ShieldHeader> createShieldHeader(ShieldHeader value) {
        return new JAXBElement<ShieldHeader>(_ShieldHeader_QNAME, ShieldHeader.class, null, value);
    }

}
