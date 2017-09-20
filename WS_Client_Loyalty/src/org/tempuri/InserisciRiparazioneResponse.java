
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoInserisciRiparazione;


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
 *         &lt;element name="InserisciRiparazioneResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoInserisciRiparazione" minOccurs="0"/>
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
    "inserisciRiparazioneResult"
})
@XmlRootElement(name = "InserisciRiparazioneResponse")
public class InserisciRiparazioneResponse {

    @XmlElementRef(name = "InserisciRiparazioneResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoInserisciRiparazione> inserisciRiparazioneResult;

    /**
     * Recupera il valore della proprietà inserisciRiparazioneResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoInserisciRiparazione }{@code >}
     *     
     */
    public JAXBElement<RisultatoInserisciRiparazione> getInserisciRiparazioneResult() {
        return inserisciRiparazioneResult;
    }

    /**
     * Imposta il valore della proprietà inserisciRiparazioneResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoInserisciRiparazione }{@code >}
     *     
     */
    public void setInserisciRiparazioneResult(JAXBElement<RisultatoInserisciRiparazione> value) {
        this.inserisciRiparazioneResult = value;
    }

}
