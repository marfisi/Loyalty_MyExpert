
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DatiClient;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.Scontrino;


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
 *         &lt;element name="scontrino" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}Scontrino" minOccurs="0"/>
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
    "scontrino"
})
@XmlRootElement(name = "CaricamentoPunti")
public class CaricamentoPunti {

    @XmlElementRef(name = "datiClient", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DatiClient> datiClient;
    @XmlElementRef(name = "scontrino", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Scontrino> scontrino;

    /**
     * Recupera il valore della proprietà datiClient.
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
     * Imposta il valore della proprietà datiClient.
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
     * Recupera il valore della proprietà scontrino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Scontrino }{@code >}
     *     
     */
    public JAXBElement<Scontrino> getScontrino() {
        return scontrino;
    }

    /**
     * Imposta il valore della proprietà scontrino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Scontrino }{@code >}
     *     
     */
    public void setScontrino(JAXBElement<Scontrino> value) {
        this.scontrino = value;
    }

}
