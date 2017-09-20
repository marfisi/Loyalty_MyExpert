
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per FiltroElencoOrdini complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FiltroElencoOrdini">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodiceOrdineWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataOrdineA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataOrdineDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroElementi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Pagina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Stato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltroElencoOrdini", propOrder = {
    "codiceCard",
    "codiceOrdineWeb",
    "dataOrdineA",
    "dataOrdineDa",
    "numeroElementi",
    "pagina",
    "stato"
})
public class FiltroElencoOrdini {

    @XmlElementRef(name = "CodiceCard", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceCard;
    @XmlElementRef(name = "CodiceOrdineWeb", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceOrdineWeb;
    @XmlElementRef(name = "DataOrdineA", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataOrdineA;
    @XmlElementRef(name = "DataOrdineDa", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataOrdineDa;
    @XmlElement(name = "NumeroElementi")
    protected Integer numeroElementi;
    @XmlElement(name = "Pagina")
    protected Integer pagina;
    @XmlElementRef(name = "Stato", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stato;

    /**
     * Recupera il valore della proprietà codiceCard.
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
     * Imposta il valore della proprietà codiceCard.
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
     * Recupera il valore della proprietà codiceOrdineWeb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceOrdineWeb() {
        return codiceOrdineWeb;
    }

    /**
     * Imposta il valore della proprietà codiceOrdineWeb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceOrdineWeb(JAXBElement<String> value) {
        this.codiceOrdineWeb = value;
    }

    /**
     * Recupera il valore della proprietà dataOrdineA.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOrdineA() {
        return dataOrdineA;
    }

    /**
     * Imposta il valore della proprietà dataOrdineA.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOrdineA(JAXBElement<String> value) {
        this.dataOrdineA = value;
    }

    /**
     * Recupera il valore della proprietà dataOrdineDa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataOrdineDa() {
        return dataOrdineDa;
    }

    /**
     * Imposta il valore della proprietà dataOrdineDa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataOrdineDa(JAXBElement<String> value) {
        this.dataOrdineDa = value;
    }

    /**
     * Recupera il valore della proprietà numeroElementi.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroElementi() {
        return numeroElementi;
    }

    /**
     * Imposta il valore della proprietà numeroElementi.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroElementi(Integer value) {
        this.numeroElementi = value;
    }

    /**
     * Recupera il valore della proprietà pagina.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPagina() {
        return pagina;
    }

    /**
     * Imposta il valore della proprietà pagina.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPagina(Integer value) {
        this.pagina = value;
    }

    /**
     * Recupera il valore della proprietà stato.
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
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStato(JAXBElement<String> value) {
        this.stato = value;
    }

}
