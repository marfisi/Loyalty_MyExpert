
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RisultatoSaldoPunti complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RisultatoSaldoPunti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceCardInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataAggiornamentoSaldo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LivelloCard" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RisultatoOperazione" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoOperazione" minOccurs="0"/>
 *         &lt;element name="Stemmi" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}ArrayOfStemma" minOccurs="0"/>
 *         &lt;element name="TotalePunti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValoreMigliorBuonoOttenibile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisultatoSaldoPunti", propOrder = {
    "codiceCard",
    "codiceCardInterno",
    "dataAggiornamentoSaldo",
    "dataNascita",
    "livelloCard",
    "risultatoOperazione",
    "stemmi",
    "totalePunti",
    "valoreMigliorBuonoOttenibile"
})
public class RisultatoSaldoPunti {

    @XmlElementRef(name = "CodiceCard", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceCard;
    @XmlElementRef(name = "CodiceCardInterno", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceCardInterno;
    @XmlElementRef(name = "DataAggiornamentoSaldo", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAggiornamentoSaldo;
    @XmlElementRef(name = "DataNascita", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataNascita;
    @XmlElement(name = "LivelloCard")
    protected Integer livelloCard;
    @XmlElementRef(name = "RisultatoOperazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoOperazione> risultatoOperazione;
    @XmlElementRef(name = "Stemmi", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStemma> stemmi;
    @XmlElement(name = "TotalePunti")
    protected Integer totalePunti;
    @XmlElementRef(name = "ValoreMigliorBuonoOttenibile", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valoreMigliorBuonoOttenibile;

    /**
     * Recupera il valore della propriet� codiceCard.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceCard() {
        return codiceCard;
    }

    /**
     * Imposta il valore della propriet� codiceCard.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceCard(JAXBElement<String> value) {
        this.codiceCard = value;
    }

    /**
     * Recupera il valore della propriet� codiceCardInterno.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceCardInterno() {
        return codiceCardInterno;
    }

    /**
     * Imposta il valore della propriet� codiceCardInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceCardInterno(JAXBElement<String> value) {
        this.codiceCardInterno = value;
    }

    /**
     * Recupera il valore della propriet� dataAggiornamentoSaldo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAggiornamentoSaldo() {
        return dataAggiornamentoSaldo;
    }

    /**
     * Imposta il valore della propriet� dataAggiornamentoSaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAggiornamentoSaldo(JAXBElement<String> value) {
        this.dataAggiornamentoSaldo = value;
    }

    /**
     * Recupera il valore della propriet� dataNascita.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataNascita() {
        return dataNascita;
    }

    /**
     * Imposta il valore della propriet� dataNascita.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataNascita(JAXBElement<String> value) {
        this.dataNascita = value;
    }

    /**
     * Recupera il valore della propriet� livelloCard.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLivelloCard() {
        return livelloCard;
    }

    /**
     * Imposta il valore della propriet� livelloCard.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLivelloCard(Integer value) {
        this.livelloCard = value;
    }

    /**
     * Recupera il valore della propriet� risultatoOperazione.
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
     * Imposta il valore della propriet� risultatoOperazione.
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
     * Recupera il valore della propriet� stemmi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStemma }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStemma> getStemmi() {
        return stemmi;
    }

    /**
     * Imposta il valore della propriet� stemmi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStemma }{@code >}
     *     
     */
    public void setStemmi(JAXBElement<ArrayOfStemma> value) {
        this.stemmi = value;
    }

    /**
     * Recupera il valore della propriet� totalePunti.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalePunti() {
        return totalePunti;
    }

    /**
     * Imposta il valore della propriet� totalePunti.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalePunti(Integer value) {
        this.totalePunti = value;
    }

    /**
     * Recupera il valore della propriet� valoreMigliorBuonoOttenibile.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValoreMigliorBuonoOttenibile() {
        return valoreMigliorBuonoOttenibile;
    }

    /**
     * Imposta il valore della propriet� valoreMigliorBuonoOttenibile.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValoreMigliorBuonoOttenibile(JAXBElement<String> value) {
        this.valoreMigliorBuonoOttenibile = value;
    }

}
