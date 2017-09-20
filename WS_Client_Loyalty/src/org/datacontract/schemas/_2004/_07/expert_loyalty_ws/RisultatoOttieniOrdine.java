
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RisultatoOttieniOrdine complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RisultatoOttieniOrdine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ordine" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}OttieniOrdineResult" minOccurs="0"/>
 *         &lt;element name="RisultatoOperazione" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoOperazione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisultatoOttieniOrdine", propOrder = {
    "ordine",
    "risultatoOperazione"
})
public class RisultatoOttieniOrdine {

    @XmlElementRef(name = "Ordine", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<OttieniOrdineResult> ordine;
    @XmlElementRef(name = "RisultatoOperazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoOperazione> risultatoOperazione;

    /**
     * Recupera il valore della proprietÓ ordine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OttieniOrdineResult }{@code >}
     *     
     */
    public JAXBElement<OttieniOrdineResult> getOrdine() {
        return ordine;
    }

    /**
     * Imposta il valore della proprietÓ ordine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OttieniOrdineResult }{@code >}
     *     
     */
    public void setOrdine(JAXBElement<OttieniOrdineResult> value) {
        this.ordine = value;
    }

    /**
     * Recupera il valore della proprietÓ risultatoOperazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}
     *     
     */
    public JAXBElement<RisultatoOperazione> getRisultatoOperazione() {
        return risultatoOperazione;
    }

    /**
     * Imposta il valore della proprietÓ risultatoOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}
     *     
     */
    public void setRisultatoOperazione(JAXBElement<RisultatoOperazione> value) {
        this.risultatoOperazione = value;
    }

}
