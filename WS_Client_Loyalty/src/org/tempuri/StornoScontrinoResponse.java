
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoStornoScontrino;


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
 *         &lt;element name="StornoScontrinoResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoStornoScontrino" minOccurs="0"/>
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
    "stornoScontrinoResult"
})
@XmlRootElement(name = "StornoScontrinoResponse")
public class StornoScontrinoResponse {

    @XmlElementRef(name = "StornoScontrinoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoStornoScontrino> stornoScontrinoResult;

    /**
     * Recupera il valore della proprietà stornoScontrinoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoStornoScontrino }{@code >}
     *     
     */
    public JAXBElement<RisultatoStornoScontrino> getStornoScontrinoResult() {
        return stornoScontrinoResult;
    }

    /**
     * Imposta il valore della proprietà stornoScontrinoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoStornoScontrino }{@code >}
     *     
     */
    public void setStornoScontrinoResult(JAXBElement<RisultatoStornoScontrino> value) {
        this.stornoScontrinoResult = value;
    }

}
