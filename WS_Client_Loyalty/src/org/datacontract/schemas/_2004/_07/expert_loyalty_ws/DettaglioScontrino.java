
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DettaglioScontrino complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DettaglioScontrino">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoriaMerceologica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceBrand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceEAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceProdotto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceProdottoPdv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescrizioneProdotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsclusioneCalcoloPunti" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NumeroRigaOrdineEcommerce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentualeAccelerazioneLocale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PrezzoTotale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrezzoTotaleValuta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipologiaRiga" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DettaglioScontrino", propOrder = {
    "categoriaMerceologica",
    "codiceBrand",
    "codiceBuono",
    "codiceEAN",
    "codiceProdotto",
    "codiceProdottoPdv",
    "descrizioneProdotto",
    "esclusioneCalcoloPunti",
    "numeroRigaOrdineEcommerce",
    "percentualeAccelerazioneLocale",
    "prezzoTotale",
    "prezzoTotaleValuta",
    "quantita",
    "tipologiaRiga"
})
public class DettaglioScontrino {

    @XmlElement(name = "CategoriaMerceologica", required = true, nillable = true)
    protected String categoriaMerceologica;
    @XmlElement(name = "CodiceBrand", required = true, nillable = true)
    protected String codiceBrand;
    @XmlElementRef(name = "CodiceBuono", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceBuono;
    @XmlElementRef(name = "CodiceEAN", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceEAN;
    @XmlElement(name = "CodiceProdotto", required = true, nillable = true)
    protected String codiceProdotto;
    @XmlElement(name = "CodiceProdottoPdv", required = true, nillable = true)
    protected String codiceProdottoPdv;
    @XmlElementRef(name = "DescrizioneProdotto", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizioneProdotto;
    @XmlElement(name = "EsclusioneCalcoloPunti")
    protected boolean esclusioneCalcoloPunti;
    @XmlElementRef(name = "NumeroRigaOrdineEcommerce", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroRigaOrdineEcommerce;
    @XmlElement(name = "PercentualeAccelerazioneLocale")
    protected int percentualeAccelerazioneLocale;
    @XmlElement(name = "PrezzoTotale", required = true, nillable = true)
    protected String prezzoTotale;
    @XmlElement(name = "PrezzoTotaleValuta", required = true, nillable = true)
    protected String prezzoTotaleValuta;
    @XmlElement(name = "Quantita")
    protected int quantita;
    @XmlElement(name = "TipologiaRiga", required = true, nillable = true)
    protected String tipologiaRiga;

    /**
     * Recupera il valore della proprietà categoriaMerceologica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaMerceologica() {
        return categoriaMerceologica;
    }

    /**
     * Imposta il valore della proprietà categoriaMerceologica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaMerceologica(String value) {
        this.categoriaMerceologica = value;
    }

    /**
     * Recupera il valore della proprietà codiceBrand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceBrand() {
        return codiceBrand;
    }

    /**
     * Imposta il valore della proprietà codiceBrand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceBrand(String value) {
        this.codiceBrand = value;
    }

    /**
     * Recupera il valore della proprietà codiceBuono.
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
     * Imposta il valore della proprietà codiceBuono.
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
     * Recupera il valore della proprietà codiceEAN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceEAN() {
        return codiceEAN;
    }

    /**
     * Imposta il valore della proprietà codiceEAN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceEAN(JAXBElement<String> value) {
        this.codiceEAN = value;
    }

    /**
     * Recupera il valore della proprietà codiceProdotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    /**
     * Imposta il valore della proprietà codiceProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceProdotto(String value) {
        this.codiceProdotto = value;
    }

    /**
     * Recupera il valore della proprietà codiceProdottoPdv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceProdottoPdv() {
        return codiceProdottoPdv;
    }

    /**
     * Imposta il valore della proprietà codiceProdottoPdv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceProdottoPdv(String value) {
        this.codiceProdottoPdv = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneProdotto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescrizioneProdotto() {
        return descrizioneProdotto;
    }

    /**
     * Imposta il valore della proprietà descrizioneProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescrizioneProdotto(JAXBElement<String> value) {
        this.descrizioneProdotto = value;
    }

    /**
     * Recupera il valore della proprietà esclusioneCalcoloPunti.
     * 
     */
    public boolean isEsclusioneCalcoloPunti() {
        return esclusioneCalcoloPunti;
    }

    /**
     * Imposta il valore della proprietà esclusioneCalcoloPunti.
     * 
     */
    public void setEsclusioneCalcoloPunti(boolean value) {
        this.esclusioneCalcoloPunti = value;
    }

    /**
     * Recupera il valore della proprietà numeroRigaOrdineEcommerce.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroRigaOrdineEcommerce() {
        return numeroRigaOrdineEcommerce;
    }

    /**
     * Imposta il valore della proprietà numeroRigaOrdineEcommerce.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroRigaOrdineEcommerce(JAXBElement<String> value) {
        this.numeroRigaOrdineEcommerce = value;
    }

    /**
     * Recupera il valore della proprietà percentualeAccelerazioneLocale.
     * 
     */
    public int getPercentualeAccelerazioneLocale() {
        return percentualeAccelerazioneLocale;
    }

    /**
     * Imposta il valore della proprietà percentualeAccelerazioneLocale.
     * 
     */
    public void setPercentualeAccelerazioneLocale(int value) {
        this.percentualeAccelerazioneLocale = value;
    }

    /**
     * Recupera il valore della proprietà prezzoTotale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezzoTotale() {
        return prezzoTotale;
    }

    /**
     * Imposta il valore della proprietà prezzoTotale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezzoTotale(String value) {
        this.prezzoTotale = value;
    }

    /**
     * Recupera il valore della proprietà prezzoTotaleValuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezzoTotaleValuta() {
        return prezzoTotaleValuta;
    }

    /**
     * Imposta il valore della proprietà prezzoTotaleValuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezzoTotaleValuta(String value) {
        this.prezzoTotaleValuta = value;
    }

    /**
     * Recupera il valore della proprietà quantita.
     * 
     */
    public int getQuantita() {
        return quantita;
    }

    /**
     * Imposta il valore della proprietà quantita.
     * 
     */
    public void setQuantita(int value) {
        this.quantita = value;
    }

    /**
     * Recupera il valore della proprietà tipologiaRiga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologiaRiga() {
        return tipologiaRiga;
    }

    /**
     * Imposta il valore della proprietà tipologiaRiga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologiaRiga(String value) {
        this.tipologiaRiga = value;
    }

}
