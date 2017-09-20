
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TestataOrdineResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TestataOrdineResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cellulare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Citofono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Civico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceClientePdV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comune" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataOraTimeOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataOrdine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdUnivoco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Indirizzo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroOrdineTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroOrdineWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartitaIva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RagioneSociale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotaleOrdine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestataOrdineResult", propOrder = {
    "cap",
    "cellulare",
    "citofono",
    "civico",
    "codiceClientePdV",
    "codiceFiscale",
    "cognome",
    "comune",
    "dataOraTimeOut",
    "dataOrdine",
    "email",
    "idUnivoco",
    "indirizzo",
    "nazione",
    "nome",
    "numeroCard",
    "numeroOrdineTS",
    "numeroOrdineWeb",
    "partitaIva",
    "provincia",
    "ragioneSociale",
    "stato",
    "telefono",
    "totaleOrdine"
})
public class TestataOrdineResult {

    @XmlElementRef(name = "CAP", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cap;
    @XmlElementRef(name = "Cellulare", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cellulare;
    @XmlElementRef(name = "Citofono", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> citofono;
    @XmlElementRef(name = "Civico", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> civico;
    @XmlElementRef(name = "CodiceClientePdV", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceClientePdV;
    @XmlElementRef(name = "CodiceFiscale", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceFiscale;
    @XmlElementRef(name = "Cognome", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cognome;
    @XmlElementRef(name = "Comune", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comune;
    @XmlElementRef(name = "DataOraTimeOut", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataOraTimeOut;
    @XmlElementRef(name = "DataOrdine", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataOrdine;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "IdUnivoco", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idUnivoco;
    @XmlElementRef(name = "Indirizzo", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indirizzo;
    @XmlElementRef(name = "Nazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazione;
    @XmlElementRef(name = "Nome", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "NumeroCard", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCard;
    @XmlElementRef(name = "NumeroOrdineTS", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOrdineTS;
    @XmlElementRef(name = "NumeroOrdineWeb", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOrdineWeb;
    @XmlElementRef(name = "PartitaIva", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partitaIva;
    @XmlElementRef(name = "Provincia", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provincia;
    @XmlElementRef(name = "RagioneSociale", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ragioneSociale;
    @XmlElementRef(name = "Stato", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stato;
    @XmlElementRef(name = "Telefono", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono;
    @XmlElementRef(name = "TotaleOrdine", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totaleOrdine;

    /**
     * Recupera il valore della propriet� cap.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della propriet� cap.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCAP(JAXBElement<String> value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della propriet� cellulare.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCellulare() {
        return cellulare;
    }

    /**
     * Imposta il valore della propriet� cellulare.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCellulare(JAXBElement<String> value) {
        this.cellulare = value;
    }

    /**
     * Recupera il valore della propriet� citofono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCitofono() {
        return citofono;
    }

    /**
     * Imposta il valore della propriet� citofono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCitofono(JAXBElement<String> value) {
        this.citofono = value;
    }

    /**
     * Recupera il valore della propriet� civico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCivico() {
        return civico;
    }

    /**
     * Imposta il valore della propriet� civico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCivico(JAXBElement<String> value) {
        this.civico = value;
    }

    /**
     * Recupera il valore della propriet� codiceClientePdV.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceClientePdV() {
        return codiceClientePdV;
    }

    /**
     * Imposta il valore della propriet� codiceClientePdV.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceClientePdV(JAXBElement<String> value) {
        this.codiceClientePdV = value;
    }

    /**
     * Recupera il valore della propriet� codiceFiscale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Imposta il valore della propriet� codiceFiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceFiscale(JAXBElement<String> value) {
        this.codiceFiscale = value;
    }

    /**
     * Recupera il valore della propriet� cognome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della propriet� cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCognome(JAXBElement<String> value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della propriet� comune.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComune() {
        return comune;
    }

    /**
     * Imposta il valore della propriet� comune.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComune(JAXBElement<String> value) {
        this.comune = value;
    }

    /**
     * Recupera il valore della propriet� dataOraTimeOut.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOraTimeOut() {
        return dataOraTimeOut;
    }

    /**
     * Imposta il valore della propriet� dataOraTimeOut.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOraTimeOut(JAXBElement<String> value) {
        this.dataOraTimeOut = value;
    }

    /**
     * Recupera il valore della propriet� dataOrdine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOrdine() {
        return dataOrdine;
    }

    /**
     * Imposta il valore della propriet� dataOrdine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOrdine(JAXBElement<String> value) {
        this.dataOrdine = value;
    }

    /**
     * Recupera il valore della propriet� email.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Imposta il valore della propriet� email.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Recupera il valore della propriet� idUnivoco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdUnivoco() {
        return idUnivoco;
    }

    /**
     * Imposta il valore della propriet� idUnivoco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdUnivoco(JAXBElement<String> value) {
        this.idUnivoco = value;
    }

    /**
     * Recupera il valore della propriet� indirizzo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndirizzo() {
        return indirizzo;
    }

    /**
     * Imposta il valore della propriet� indirizzo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndirizzo(JAXBElement<String> value) {
        this.indirizzo = value;
    }

    /**
     * Recupera il valore della propriet� nazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazione() {
        return nazione;
    }

    /**
     * Imposta il valore della propriet� nazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazione(JAXBElement<String> value) {
        this.nazione = value;
    }

    /**
     * Recupera il valore della propriet� nome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Imposta il valore della propriet� nome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della propriet� numeroCard.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCard() {
        return numeroCard;
    }

    /**
     * Imposta il valore della propriet� numeroCard.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCard(JAXBElement<String> value) {
        this.numeroCard = value;
    }

    /**
     * Recupera il valore della propriet� numeroOrdineTS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroOrdineTS() {
        return numeroOrdineTS;
    }

    /**
     * Imposta il valore della propriet� numeroOrdineTS.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroOrdineTS(JAXBElement<String> value) {
        this.numeroOrdineTS = value;
    }

    /**
     * Recupera il valore della propriet� numeroOrdineWeb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroOrdineWeb() {
        return numeroOrdineWeb;
    }

    /**
     * Imposta il valore della propriet� numeroOrdineWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroOrdineWeb(JAXBElement<String> value) {
        this.numeroOrdineWeb = value;
    }

    /**
     * Recupera il valore della propriet� partitaIva.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartitaIva() {
        return partitaIva;
    }

    /**
     * Imposta il valore della propriet� partitaIva.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartitaIva(JAXBElement<String> value) {
        this.partitaIva = value;
    }

    /**
     * Recupera il valore della propriet� provincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della propriet� provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvincia(JAXBElement<String> value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della propriet� ragioneSociale.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRagioneSociale() {
        return ragioneSociale;
    }

    /**
     * Imposta il valore della propriet� ragioneSociale.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRagioneSociale(JAXBElement<String> value) {
        this.ragioneSociale = value;
    }

    /**
     * Recupera il valore della propriet� stato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStato() {
        return stato;
    }

    /**
     * Imposta il valore della propriet� stato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStato(JAXBElement<String> value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della propriet� telefono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefono() {
        return telefono;
    }

    /**
     * Imposta il valore della propriet� telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefono(JAXBElement<String> value) {
        this.telefono = value;
    }

    /**
     * Recupera il valore della propriet� totaleOrdine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotaleOrdine() {
        return totaleOrdine;
    }

    /**
     * Imposta il valore della propriet� totaleOrdine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotaleOrdine(JAXBElement<String> value) {
        this.totaleOrdine = value;
    }

}
