
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Dettaglio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Dettaglio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Annullato" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CodiceProdotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Componenti" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}ArrayOfComponente" minOccurs="0"/>
 *         &lt;element name="ConfermaDisponibilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConfermaIndisponibilita" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IdRigaCollegata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdRigaUnivoco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Immateriale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrezzoUnitario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "Dettaglio", propOrder = {
    "annullato",
    "codiceProdotto",
    "componenti",
    "confermaDisponibilita",
    "confermaIndisponibilita",
    "idRigaCollegata",
    "idRigaUnivoco",
    "immateriale",
    "prezzoUnitario",
    "quantita",
    "stato",
    "valuta"
})
public class Dettaglio {

    @XmlElement(name = "Annullato")
    protected Boolean annullato;
    @XmlElementRef(name = "CodiceProdotto", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceProdotto;
    @XmlElementRef(name = "Componenti", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfComponente> componenti;
    @XmlElement(name = "ConfermaDisponibilita")
    protected Boolean confermaDisponibilita;
    @XmlElement(name = "ConfermaIndisponibilita")
    protected Boolean confermaIndisponibilita;
    @XmlElementRef(name = "IdRigaCollegata", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idRigaCollegata;
    @XmlElementRef(name = "IdRigaUnivoco", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idRigaUnivoco;
    @XmlElement(name = "Immateriale")
    protected Boolean immateriale;
    @XmlElementRef(name = "PrezzoUnitario", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prezzoUnitario;
    @XmlElementRef(name = "Quantita", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantita;
    @XmlElement(name = "Stato")
    protected Integer stato;
    @XmlElementRef(name = "Valuta", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valuta;

    /**
     * Recupera il valore della proprietà annullato.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnullato() {
        return annullato;
    }

    /**
     * Imposta il valore della proprietà annullato.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnullato(Boolean value) {
        this.annullato = value;
    }

    /**
     * Recupera il valore della proprietà codiceProdotto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceProdotto() {
        return codiceProdotto;
    }

    /**
     * Imposta il valore della proprietà codiceProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceProdotto(JAXBElement<String> value) {
        this.codiceProdotto = value;
    }

    /**
     * Recupera il valore della proprietà componenti.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComponente }{@code >}
     *     
     */
    public JAXBElement<ArrayOfComponente> getComponenti() {
        return componenti;
    }

    /**
     * Imposta il valore della proprietà componenti.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfComponente }{@code >}
     *     
     */
    public void setComponenti(JAXBElement<ArrayOfComponente> value) {
        this.componenti = value;
    }

    /**
     * Recupera il valore della proprietà confermaDisponibilita.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfermaDisponibilita() {
        return confermaDisponibilita;
    }

    /**
     * Imposta il valore della proprietà confermaDisponibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfermaDisponibilita(Boolean value) {
        this.confermaDisponibilita = value;
    }

    /**
     * Recupera il valore della proprietà confermaIndisponibilita.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfermaIndisponibilita() {
        return confermaIndisponibilita;
    }

    /**
     * Imposta il valore della proprietà confermaIndisponibilita.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfermaIndisponibilita(Boolean value) {
        this.confermaIndisponibilita = value;
    }

    /**
     * Recupera il valore della proprietà idRigaCollegata.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdRigaCollegata() {
        return idRigaCollegata;
    }

    /**
     * Imposta il valore della proprietà idRigaCollegata.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdRigaCollegata(JAXBElement<String> value) {
        this.idRigaCollegata = value;
    }

    /**
     * Recupera il valore della proprietà idRigaUnivoco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdRigaUnivoco() {
        return idRigaUnivoco;
    }

    /**
     * Imposta il valore della proprietà idRigaUnivoco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdRigaUnivoco(JAXBElement<String> value) {
        this.idRigaUnivoco = value;
    }

    /**
     * Recupera il valore della proprietà immateriale.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmateriale() {
        return immateriale;
    }

    /**
     * Imposta il valore della proprietà immateriale.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmateriale(Boolean value) {
        this.immateriale = value;
    }

    /**
     * Recupera il valore della proprietà prezzoUnitario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrezzoUnitario() {
        return prezzoUnitario;
    }

    /**
     * Imposta il valore della proprietà prezzoUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrezzoUnitario(JAXBElement<String> value) {
        this.prezzoUnitario = value;
    }

    /**
     * Recupera il valore della proprietà quantita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantita() {
        return quantita;
    }

    /**
     * Imposta il valore della proprietà quantita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantita(JAXBElement<String> value) {
        this.quantita = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStato(Integer value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà valuta.
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
     * Imposta il valore della proprietà valuta.
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
