
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DatiClient;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datiClient" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}DatiClient" minOccurs="0"/>
 *         &lt;element name="codiceBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totaleSpesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valutaSpesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "datiClient",
    "codiceBuono",
    "totaleSpesa",
    "valutaSpesa"
})
@XmlRootElement(name = "UtilizzaBuono")
public class UtilizzaBuono {

    @XmlElementRef(name = "datiClient", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DatiClient> datiClient;
    @XmlElementRef(name = "codiceBuono", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceBuono;
    @XmlElementRef(name = "totaleSpesa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totaleSpesa;
    @XmlElementRef(name = "valutaSpesa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valutaSpesa;

    /**
     * Recupera il valore della proprietÓ datiClient.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatiClient }{@code >}
     *     
     */
    public JAXBElement<DatiClient> getDatiClient() {
        return datiClient;
    }

    /**
     * Imposta il valore della proprietÓ datiClient.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatiClient }{@code >}
     *     
     */
    public void setDatiClient(JAXBElement<DatiClient> value) {
        this.datiClient = value;
    }

    /**
     * Recupera il valore della proprietÓ codiceBuono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceBuono() {
        return codiceBuono;
    }

    /**
     * Imposta il valore della proprietÓ codiceBuono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceBuono(JAXBElement<String> value) {
        this.codiceBuono = value;
    }

    /**
     * Recupera il valore della proprietÓ totaleSpesa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotaleSpesa() {
        return totaleSpesa;
    }

    /**
     * Imposta il valore della proprietÓ totaleSpesa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotaleSpesa(JAXBElement<String> value) {
        this.totaleSpesa = value;
    }

    /**
     * Recupera il valore della proprietÓ valutaSpesa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValutaSpesa() {
        return valutaSpesa;
    }

    /**
     * Imposta il valore della proprietÓ valutaSpesa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValutaSpesa(JAXBElement<String> value) {
        this.valutaSpesa = value;
    }

}
