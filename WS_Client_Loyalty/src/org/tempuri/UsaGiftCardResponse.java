
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoUsaGiftCard;


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
 *         &lt;element name="UsaGiftCardResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoUsaGiftCard" minOccurs="0"/>
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
    "usaGiftCardResult"
})
@XmlRootElement(name = "UsaGiftCardResponse")
public class UsaGiftCardResponse {

    @XmlElementRef(name = "UsaGiftCardResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoUsaGiftCard> usaGiftCardResult;

    /**
     * Recupera il valore della proprietà usaGiftCardResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoUsaGiftCard }{@code >}
     *     
     */
    public JAXBElement<RisultatoUsaGiftCard> getUsaGiftCardResult() {
        return usaGiftCardResult;
    }

    /**
     * Imposta il valore della proprietà usaGiftCardResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoUsaGiftCard }{@code >}
     *     
     */
    public void setUsaGiftCardResult(JAXBElement<RisultatoUsaGiftCard> value) {
        this.usaGiftCardResult = value;
    }

}
