
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Scontrino complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Scontrino">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataOra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Dettagli" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}ArrayOfDettaglioScontrino"/>
 *         &lt;element name="ExtraPuntiAccelerazioneLocale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdTransazione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroOrdineEcommerce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoTransazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotaleImporto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotaleImportoValuta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Valuta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scontrino", propOrder = {
    "dataOra",
    "dettagli",
    "extraPuntiAccelerazioneLocale",
    "idTransazione",
    "numeroCard",
    "numeroOrdineEcommerce",
    "tipoTransazione",
    "totaleImporto",
    "totaleImportoValuta",
    "valuta"
})
public class Scontrino {

    @XmlElement(name = "DataOra", required = true, nillable = true)
    protected String dataOra;
    @XmlElement(name = "Dettagli", required = true, nillable = true)
    protected ArrayOfDettaglioScontrino dettagli;
    @XmlElement(name = "ExtraPuntiAccelerazioneLocale")
    protected int extraPuntiAccelerazioneLocale;
    @XmlElement(name = "IdTransazione", required = true, nillable = true)
    protected String idTransazione;
    @XmlElement(name = "NumeroCard", required = true, nillable = true)
    protected String numeroCard;
    @XmlElementRef(name = "NumeroOrdineEcommerce", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOrdineEcommerce;
    @XmlElementRef(name = "TipoTransazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoTransazione;
    @XmlElement(name = "TotaleImporto", required = true, nillable = true)
    protected String totaleImporto;
    @XmlElement(name = "TotaleImportoValuta", required = true, nillable = true)
    protected String totaleImportoValuta;
    @XmlElement(name = "Valuta", required = true, nillable = true)
    protected String valuta;

    /**
     * Recupera il valore della proprietà dataOra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataOra() {
        return dataOra;
    }

    /**
     * Imposta il valore della proprietà dataOra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataOra(String value) {
        this.dataOra = value;
    }

    /**
     * Recupera il valore della proprietà dettagli.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDettaglioScontrino }
     *     
     */
    public ArrayOfDettaglioScontrino getDettagli() {
        return dettagli;
    }

    /**
     * Imposta il valore della proprietà dettagli.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDettaglioScontrino }
     *     
     */
    public void setDettagli(ArrayOfDettaglioScontrino value) {
        this.dettagli = value;
    }

    /**
     * Recupera il valore della proprietà extraPuntiAccelerazioneLocale.
     * 
     */
    public int getExtraPuntiAccelerazioneLocale() {
        return extraPuntiAccelerazioneLocale;
    }

    /**
     * Imposta il valore della proprietà extraPuntiAccelerazioneLocale.
     * 
     */
    public void setExtraPuntiAccelerazioneLocale(int value) {
        this.extraPuntiAccelerazioneLocale = value;
    }

    /**
     * Recupera il valore della proprietà idTransazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransazione() {
        return idTransazione;
    }

    /**
     * Imposta il valore della proprietà idTransazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransazione(String value) {
        this.idTransazione = value;
    }

    /**
     * Recupera il valore della proprietà numeroCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCard() {
        return numeroCard;
    }

    /**
     * Imposta il valore della proprietà numeroCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCard(String value) {
        this.numeroCard = value;
    }

    /**
     * Recupera il valore della proprietà numeroOrdineEcommerce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroOrdineEcommerce() {
        return numeroOrdineEcommerce;
    }

    /**
     * Imposta il valore della proprietà numeroOrdineEcommerce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroOrdineEcommerce(JAXBElement<String> value) {
        this.numeroOrdineEcommerce = value;
    }

    /**
     * Recupera il valore della proprietà tipoTransazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoTransazione() {
        return tipoTransazione;
    }

    /**
     * Imposta il valore della proprietà tipoTransazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoTransazione(JAXBElement<String> value) {
        this.tipoTransazione = value;
    }

    /**
     * Recupera il valore della proprietà totaleImporto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotaleImporto() {
        return totaleImporto;
    }

    /**
     * Imposta il valore della proprietà totaleImporto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotaleImporto(String value) {
        this.totaleImporto = value;
    }

    /**
     * Recupera il valore della proprietà totaleImportoValuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotaleImportoValuta() {
        return totaleImportoValuta;
    }

    /**
     * Imposta il valore della proprietà totaleImportoValuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotaleImportoValuta(String value) {
        this.totaleImportoValuta = value;
    }

    /**
     * Recupera il valore della proprietà valuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuta() {
        return valuta;
    }

    /**
     * Imposta il valore della proprietà valuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuta(String value) {
        this.valuta = value;
    }

}
