
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DatiClient complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DatiClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceClient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceOperatore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodicePdv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiClient", propOrder = {
    "codiceClient",
    "codiceOperatore",
    "codicePdv"
})
public class DatiClient {

    @XmlElement(name = "CodiceClient", required = true, nillable = true)
    protected String codiceClient;
    @XmlElement(name = "CodiceOperatore", required = true, nillable = true)
    protected String codiceOperatore;
    @XmlElement(name = "CodicePdv", required = true, nillable = true)
    protected String codicePdv;

    /**
     * Recupera il valore della proprietà codiceClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceClient() {
        return codiceClient;
    }

    /**
     * Imposta il valore della proprietà codiceClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceClient(String value) {
        this.codiceClient = value;
    }

    /**
     * Recupera il valore della proprietà codiceOperatore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceOperatore() {
        return codiceOperatore;
    }

    /**
     * Imposta il valore della proprietà codiceOperatore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceOperatore(String value) {
        this.codiceOperatore = value;
    }

    /**
     * Recupera il valore della proprietà codicePdv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicePdv() {
        return codicePdv;
    }

    /**
     * Imposta il valore della proprietà codicePdv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicePdv(String value) {
        this.codicePdv = value;
    }

}
