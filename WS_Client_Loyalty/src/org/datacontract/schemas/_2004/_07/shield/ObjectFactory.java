
package org.datacontract.schemas._2004._07.shield;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.shield package. 
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

    private final static QName _ShieldHeader_QNAME = new QName("http://schemas.datacontract.org/2004/07/Shield.Client", "ShieldHeader");
    private final static QName _ShieldHeaderUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/Shield.Client", "Username");
    private final static QName _ShieldHeaderContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/Shield.Client", "Context");
    private final static QName _ShieldHeaderIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Shield.Client", "IPAddress");
    private final static QName _ShieldHeaderPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Shield.Client", "Password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.shield
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShieldHeader }
     * 
     */
    public ShieldHeader createShieldHeader() {
        return new ShieldHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShieldHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Shield.Client", name = "ShieldHeader")
    public JAXBElement<ShieldHeader> createShieldHeader(ShieldHeader value) {
        return new JAXBElement<ShieldHeader>(_ShieldHeader_QNAME, ShieldHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Shield.Client", name = "Username", scope = ShieldHeader.class)
    public JAXBElement<String> createShieldHeaderUsername(String value) {
        return new JAXBElement<String>(_ShieldHeaderUsername_QNAME, String.class, ShieldHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Shield.Client", name = "Context", scope = ShieldHeader.class)
    public JAXBElement<String> createShieldHeaderContext(String value) {
        return new JAXBElement<String>(_ShieldHeaderContext_QNAME, String.class, ShieldHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Shield.Client", name = "IPAddress", scope = ShieldHeader.class)
    public JAXBElement<String> createShieldHeaderIPAddress(String value) {
        return new JAXBElement<String>(_ShieldHeaderIPAddress_QNAME, String.class, ShieldHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Shield.Client", name = "Password", scope = ShieldHeader.class)
    public JAXBElement<String> createShieldHeaderPassword(String value) {
        return new JAXBElement<String>(_ShieldHeaderPassword_QNAME, String.class, ShieldHeader.class, value);
    }

}
