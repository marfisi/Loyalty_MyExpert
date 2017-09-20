
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DatiClient;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.Riparazione;


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
 *         &lt;element name="riparazione" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}Riparazione" minOccurs="0"/>
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
    "riparazione"
})
@XmlRootElement(name = "InserisciRiparazione")
public class InserisciRiparazione {

    @XmlElementRef(name = "datiClient", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DatiClient> datiClient;
    @XmlElementRef(name = "riparazione", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Riparazione> riparazione;

    /**
     * Recupera il valore della propriet� datiClient.
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
     * Imposta il valore della propriet� datiClient.
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
     * Recupera il valore della propriet� riparazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Riparazione }{@code >}
     *     
     */
    public JAXBElement<Riparazione> getRiparazione() {
        return riparazione;
    }

    /**
     * Imposta il valore della propriet� riparazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Riparazione }{@code >}
     *     
     */
    public void setRiparazione(JAXBElement<Riparazione> value) {
        this.riparazione = value;
    }

}
