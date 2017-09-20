
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoLeggiGiftCard;


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
 *         &lt;element name="LeggiGiftCardResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoLeggiGiftCard" minOccurs="0"/>
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
    "leggiGiftCardResult"
})
@XmlRootElement(name = "LeggiGiftCardResponse")
public class LeggiGiftCardResponse {

    @XmlElementRef(name = "LeggiGiftCardResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoLeggiGiftCard> leggiGiftCardResult;

    /**
     * Recupera il valore della proprietà leggiGiftCardResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoLeggiGiftCard }{@code >}
     *     
     */
    public JAXBElement<RisultatoLeggiGiftCard> getLeggiGiftCardResult() {
        return leggiGiftCardResult;
    }

    /**
     * Imposta il valore della proprietà leggiGiftCardResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoLeggiGiftCard }{@code >}
     *     
     */
    public void setLeggiGiftCardResult(JAXBElement<RisultatoLeggiGiftCard> value) {
        this.leggiGiftCardResult = value;
    }

}
