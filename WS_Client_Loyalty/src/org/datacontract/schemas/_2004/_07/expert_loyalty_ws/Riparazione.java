
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Riparazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Riparazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceCCProdotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceProdottoPdv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContattoRiferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataAcquisto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataAggiornamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataConsegnaProdotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataStimaRiconsegna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescrizioneProdotto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DifettoSegnalato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Identificativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NominativoRiferimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoteRiparazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrezzoPreventivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatoPreventivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatoRiparazione" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Riparazione", propOrder = {
    "codiceCCProdotto",
    "codiceProdottoPdv",
    "contattoRiferimento",
    "dataAcquisto",
    "dataAggiornamento",
    "dataConsegnaProdotto",
    "dataStimaRiconsegna",
    "descrizioneProdotto",
    "difettoSegnalato",
    "identificativo",
    "nominativoRiferimento",
    "noteRiparazione",
    "numeroCard",
    "prezzoPreventivo",
    "statoPreventivo",
    "statoRiparazione"
})
public class Riparazione {

    @XmlElementRef(name = "CodiceCCProdotto", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceCCProdotto;
    @XmlElement(name = "CodiceProdottoPdv", required = true, nillable = true)
    protected String codiceProdottoPdv;
    @XmlElementRef(name = "ContattoRiferimento", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contattoRiferimento;
    @XmlElement(name = "DataAcquisto", required = true, nillable = true)
    protected String dataAcquisto;
    @XmlElement(name = "DataAggiornamento", required = true, nillable = true)
    protected String dataAggiornamento;
    @XmlElementRef(name = "DataConsegnaProdotto", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataConsegnaProdotto;
    @XmlElementRef(name = "DataStimaRiconsegna", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataStimaRiconsegna;
    @XmlElement(name = "DescrizioneProdotto", required = true, nillable = true)
    protected String descrizioneProdotto;
    @XmlElement(name = "DifettoSegnalato", required = true, nillable = true)
    protected String difettoSegnalato;
    @XmlElement(name = "Identificativo", required = true, nillable = true)
    protected String identificativo;
    @XmlElementRef(name = "NominativoRiferimento", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nominativoRiferimento;
    @XmlElementRef(name = "NoteRiparazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> noteRiparazione;
    @XmlElement(name = "NumeroCard", required = true, nillable = true)
    protected String numeroCard;
    @XmlElementRef(name = "PrezzoPreventivo", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prezzoPreventivo;
    @XmlElement(name = "StatoPreventivo")
    protected Integer statoPreventivo;
    @XmlElement(name = "StatoRiparazione")
    protected int statoRiparazione;

    /**
     * Recupera il valore della proprietà codiceCCProdotto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceCCProdotto() {
        return codiceCCProdotto;
    }

    /**
     * Imposta il valore della proprietà codiceCCProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceCCProdotto(JAXBElement<String> value) {
        this.codiceCCProdotto = value;
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
     * Recupera il valore della proprietà contattoRiferimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContattoRiferimento() {
        return contattoRiferimento;
    }

    /**
     * Imposta il valore della proprietà contattoRiferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContattoRiferimento(JAXBElement<String> value) {
        this.contattoRiferimento = value;
    }

    /**
     * Recupera il valore della proprietà dataAcquisto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAcquisto() {
        return dataAcquisto;
    }

    /**
     * Imposta il valore della proprietà dataAcquisto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAcquisto(String value) {
        this.dataAcquisto = value;
    }

    /**
     * Recupera il valore della proprietà dataAggiornamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAggiornamento() {
        return dataAggiornamento;
    }

    /**
     * Imposta il valore della proprietà dataAggiornamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAggiornamento(String value) {
        this.dataAggiornamento = value;
    }

    /**
     * Recupera il valore della proprietà dataConsegnaProdotto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataConsegnaProdotto() {
        return dataConsegnaProdotto;
    }

    /**
     * Imposta il valore della proprietà dataConsegnaProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataConsegnaProdotto(JAXBElement<String> value) {
        this.dataConsegnaProdotto = value;
    }

    /**
     * Recupera il valore della proprietà dataStimaRiconsegna.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataStimaRiconsegna() {
        return dataStimaRiconsegna;
    }

    /**
     * Imposta il valore della proprietà dataStimaRiconsegna.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataStimaRiconsegna(JAXBElement<String> value) {
        this.dataStimaRiconsegna = value;
    }

    /**
     * Recupera il valore della proprietà descrizioneProdotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneProdotto() {
        return descrizioneProdotto;
    }

    /**
     * Imposta il valore della proprietà descrizioneProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneProdotto(String value) {
        this.descrizioneProdotto = value;
    }

    /**
     * Recupera il valore della proprietà difettoSegnalato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifettoSegnalato() {
        return difettoSegnalato;
    }

    /**
     * Imposta il valore della proprietà difettoSegnalato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifettoSegnalato(String value) {
        this.difettoSegnalato = value;
    }

    /**
     * Recupera il valore della proprietà identificativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativo() {
        return identificativo;
    }

    /**
     * Imposta il valore della proprietà identificativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativo(String value) {
        this.identificativo = value;
    }

    /**
     * Recupera il valore della proprietà nominativoRiferimento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNominativoRiferimento() {
        return nominativoRiferimento;
    }

    /**
     * Imposta il valore della proprietà nominativoRiferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNominativoRiferimento(JAXBElement<String> value) {
        this.nominativoRiferimento = value;
    }

    /**
     * Recupera il valore della proprietà noteRiparazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNoteRiparazione() {
        return noteRiparazione;
    }

    /**
     * Imposta il valore della proprietà noteRiparazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNoteRiparazione(JAXBElement<String> value) {
        this.noteRiparazione = value;
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
     * Recupera il valore della proprietà prezzoPreventivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrezzoPreventivo() {
        return prezzoPreventivo;
    }

    /**
     * Imposta il valore della proprietà prezzoPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrezzoPreventivo(JAXBElement<String> value) {
        this.prezzoPreventivo = value;
    }

    /**
     * Recupera il valore della proprietà statoPreventivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatoPreventivo() {
        return statoPreventivo;
    }

    /**
     * Imposta il valore della proprietà statoPreventivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatoPreventivo(Integer value) {
        this.statoPreventivo = value;
    }

    /**
     * Recupera il valore della proprietà statoRiparazione.
     * 
     */
    public int getStatoRiparazione() {
        return statoRiparazione;
    }

    /**
     * Imposta il valore della proprietà statoRiparazione.
     * 
     */
    public void setStatoRiparazione(int value) {
        this.statoRiparazione = value;
    }

}
