
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RisultatoGenerazioneBuono complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RisultatoGenerazioneBuono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NuovoSaldoPunti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PuntiConsumati" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RisultatoOperazione" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoOperazione" minOccurs="0"/>
 *         &lt;element name="TipologiaBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValoreBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Valuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisultatoGenerazioneBuono", propOrder = {
    "codiceBuono",
    "nuovoSaldoPunti",
    "puntiConsumati",
    "risultatoOperazione",
    "tipologiaBuono",
    "valoreBuono",
    "valuta"
})
public class RisultatoGenerazioneBuono {

    @XmlElementRef(name = "CodiceBuono", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceBuono;
    @XmlElement(name = "NuovoSaldoPunti")
    protected Integer nuovoSaldoPunti;
    @XmlElement(name = "PuntiConsumati")
    protected Integer puntiConsumati;
    @XmlElementRef(name = "RisultatoOperazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoOperazione> risultatoOperazione;
    @XmlElementRef(name = "TipologiaBuono", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipologiaBuono;
    @XmlElementRef(name = "ValoreBuono", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valoreBuono;
    @XmlElementRef(name = "Valuta", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valuta;

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
     * Recupera il valore della proprietÓ nuovoSaldoPunti.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNuovoSaldoPunti() {
        return nuovoSaldoPunti;
    }

    /**
     * Imposta il valore della proprietÓ nuovoSaldoPunti.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNuovoSaldoPunti(Integer value) {
        this.nuovoSaldoPunti = value;
    }

    /**
     * Recupera il valore della proprietÓ puntiConsumati.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPuntiConsumati() {
        return puntiConsumati;
    }

    /**
     * Imposta il valore della proprietÓ puntiConsumati.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPuntiConsumati(Integer value) {
        this.puntiConsumati = value;
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

    /**
     * Recupera il valore della proprietÓ tipologiaBuono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipologiaBuono() {
        return tipologiaBuono;
    }

    /**
     * Imposta il valore della proprietÓ tipologiaBuono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipologiaBuono(JAXBElement<String> value) {
        this.tipologiaBuono = value;
    }

    /**
     * Recupera il valore della proprietÓ valoreBuono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValoreBuono() {
        return valoreBuono;
    }

    /**
     * Imposta il valore della proprietÓ valoreBuono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValoreBuono(JAXBElement<String> value) {
        this.valoreBuono = value;
    }

    /**
     * Recupera il valore della proprietÓ valuta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValuta() {
        return valuta;
    }

    /**
     * Imposta il valore della proprietÓ valuta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValuta(JAXBElement<String> value) {
        this.valuta = value;
    }

}
