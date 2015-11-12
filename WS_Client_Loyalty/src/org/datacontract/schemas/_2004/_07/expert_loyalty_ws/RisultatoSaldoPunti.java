
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
 *         &lt;element name="CodiceInternoExpert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataAggiornamentoSaldo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RisultatoOperazione" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoOperazione" minOccurs="0"/>
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
    "codiceInternoExpert",
    "dataAggiornamentoSaldo",
    "risultatoOperazione",
    "totalePunti",
    "valoreMigliorBuonoOttenibile"
})
public class RisultatoSaldoPunti {

    @XmlElementRef(name = "CodiceInternoExpert", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceInternoExpert;
    @XmlElementRef(name = "DataAggiornamentoSaldo", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAggiornamentoSaldo;
    @XmlElementRef(name = "RisultatoOperazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoOperazione> risultatoOperazione;
    @XmlElement(name = "TotalePunti")
    protected Integer totalePunti;
    @XmlElementRef(name = "ValoreMigliorBuonoOttenibile", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valoreMigliorBuonoOttenibile;

    /**
     * Recupera il valore della proprietà codiceInternoExpert.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceInternoExpert() {
        return codiceInternoExpert;
    }

    /**
     * Imposta il valore della proprietà codiceInternoExpert.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceInternoExpert(JAXBElement<String> value) {
        this.codiceInternoExpert = value;
    }

    /**
     * Recupera il valore della proprietà dataAggiornamentoSaldo.
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
     * Imposta il valore della proprietà dataAggiornamentoSaldo.
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
     * Recupera il valore della proprietà risultatoOperazione.
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
     * Imposta il valore della proprietà risultatoOperazione.
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
     * Recupera il valore della proprietà totalePunti.
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
     * Imposta il valore della proprietà totalePunti.
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
     * Recupera il valore della proprietà valoreMigliorBuonoOttenibile.
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
     * Imposta il valore della proprietà valoreMigliorBuonoOttenibile.
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
