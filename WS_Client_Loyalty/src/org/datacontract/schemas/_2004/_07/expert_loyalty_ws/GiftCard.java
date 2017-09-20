
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GiftCard complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GiftCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Abilitata" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attivabile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attivata" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DataAttivazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCreazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataScadenza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCampagna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ricaricabile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Utilizzata" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValoreResiduo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCard", propOrder = {
    "abilitata",
    "attivabile",
    "attivata",
    "dataAttivazione",
    "dataCreazione",
    "dataScadenza",
    "descrizione",
    "idCampagna",
    "numero",
    "ricaricabile",
    "tipo",
    "utilizzata",
    "valoreResiduo"
})
public class GiftCard {

    @XmlElement(name = "Abilitata")
    protected Boolean abilitata;
    @XmlElement(name = "Attivabile")
    protected Boolean attivabile;
    @XmlElement(name = "Attivata")
    protected Boolean attivata;
    @XmlElementRef(name = "DataAttivazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAttivazione;
    @XmlElementRef(name = "DataCreazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCreazione;
    @XmlElementRef(name = "DataScadenza", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataScadenza;
    @XmlElementRef(name = "Descrizione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descrizione;
    @XmlElementRef(name = "IdCampagna", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idCampagna;
    @XmlElementRef(name = "Numero", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numero;
    @XmlElement(name = "Ricaricabile")
    protected Boolean ricaricabile;
    @XmlElementRef(name = "Tipo", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipo;
    @XmlElement(name = "Utilizzata")
    protected Boolean utilizzata;
    @XmlElementRef(name = "ValoreResiduo", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valoreResiduo;

    /**
     * Recupera il valore della proprietà abilitata.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbilitata() {
        return abilitata;
    }

    /**
     * Imposta il valore della proprietà abilitata.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbilitata(Boolean value) {
        this.abilitata = value;
    }

    /**
     * Recupera il valore della proprietà attivabile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttivabile() {
        return attivabile;
    }

    /**
     * Imposta il valore della proprietà attivabile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttivabile(Boolean value) {
        this.attivabile = value;
    }

    /**
     * Recupera il valore della proprietà attivata.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttivata() {
        return attivata;
    }

    /**
     * Imposta il valore della proprietà attivata.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttivata(Boolean value) {
        this.attivata = value;
    }

    /**
     * Recupera il valore della proprietà dataAttivazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAttivazione() {
        return dataAttivazione;
    }

    /**
     * Imposta il valore della proprietà dataAttivazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAttivazione(JAXBElement<String> value) {
        this.dataAttivazione = value;
    }

    /**
     * Recupera il valore della proprietà dataCreazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCreazione() {
        return dataCreazione;
    }

    /**
     * Imposta il valore della proprietà dataCreazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCreazione(JAXBElement<String> value) {
        this.dataCreazione = value;
    }

    /**
     * Recupera il valore della proprietà dataScadenza.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataScadenza() {
        return dataScadenza;
    }

    /**
     * Imposta il valore della proprietà dataScadenza.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataScadenza(JAXBElement<String> value) {
        this.dataScadenza = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescrizione(JAXBElement<String> value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà idCampagna.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdCampagna() {
        return idCampagna;
    }

    /**
     * Imposta il valore della proprietà idCampagna.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdCampagna(JAXBElement<String> value) {
        this.idCampagna = value;
    }

    /**
     * Recupera il valore della proprietà numero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumero() {
        return numero;
    }

    /**
     * Imposta il valore della proprietà numero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumero(JAXBElement<String> value) {
        this.numero = value;
    }

    /**
     * Recupera il valore della proprietà ricaricabile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRicaricabile() {
        return ricaricabile;
    }

    /**
     * Imposta il valore della proprietà ricaricabile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRicaricabile(Boolean value) {
        this.ricaricabile = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipo(JAXBElement<String> value) {
        this.tipo = value;
    }

    /**
     * Recupera il valore della proprietà utilizzata.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtilizzata() {
        return utilizzata;
    }

    /**
     * Imposta il valore della proprietà utilizzata.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtilizzata(Boolean value) {
        this.utilizzata = value;
    }

    /**
     * Recupera il valore della proprietà valoreResiduo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValoreResiduo() {
        return valoreResiduo;
    }

    /**
     * Imposta il valore della proprietà valoreResiduo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValoreResiduo(JAXBElement<String> value) {
        this.valoreResiduo = value;
    }

}
