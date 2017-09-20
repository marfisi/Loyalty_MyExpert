
package it.cascino.loyalty.loyaltyintegration;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import org.tempuri.ILoyaltyIntegration;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LoyaltyIntegration", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://expertws.akronimo.it/v1.2/LoyaltyIntegration.svc?singleWsdl")
public class LoyaltyIntegrationTest
    extends Service
{

    private final static URL LOYALTYINTEGRATION_WSDL_LOCATION;
    private final static WebServiceException LOYALTYINTEGRATION_EXCEPTION;
    private final static QName LOYALTYINTEGRATION_QNAME = new QName("http://tempuri.org/", "LoyaltyIntegration");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://expertws.akronimo.it/v1.2/LoyaltyIntegration.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOYALTYINTEGRATION_WSDL_LOCATION = url;
        LOYALTYINTEGRATION_EXCEPTION = e;
    }

    public LoyaltyIntegrationTest() {
        super(__getWsdlLocation(), LOYALTYINTEGRATION_QNAME);
    }

    public LoyaltyIntegrationTest(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOYALTYINTEGRATION_QNAME, features);
    }

    public LoyaltyIntegrationTest(URL wsdlLocation) {
        super(wsdlLocation, LOYALTYINTEGRATION_QNAME);
    }

    public LoyaltyIntegrationTest(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOYALTYINTEGRATION_QNAME, features);
    }

    public LoyaltyIntegrationTest(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoyaltyIntegrationTest(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ILoyaltyIntegration
     */
    @WebEndpoint(name = "BasicHttpBinding_ILoyaltyIntegration")
    public ILoyaltyIntegration getBasicHttpBindingILoyaltyIntegration() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ILoyaltyIntegration"), ILoyaltyIntegration.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ILoyaltyIntegration
     */
    @WebEndpoint(name = "BasicHttpBinding_ILoyaltyIntegration")
    public ILoyaltyIntegration getBasicHttpBindingILoyaltyIntegration(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ILoyaltyIntegration"), ILoyaltyIntegration.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOYALTYINTEGRATION_EXCEPTION!= null) {
            throw LOYALTYINTEGRATION_EXCEPTION;
        }
        return LOYALTYINTEGRATION_WSDL_LOCATION;
    }

}