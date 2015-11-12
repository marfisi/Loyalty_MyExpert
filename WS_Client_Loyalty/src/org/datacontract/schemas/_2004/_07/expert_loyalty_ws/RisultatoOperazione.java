
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_domain_services_dto.ArrayOfErrorMessage;


/**
 * <p>Classe Java per RisultatoOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RisultatoOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceStato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Errori" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Services.DTO.Base}ArrayOfErrorMessage" minOccurs="0"/>
 *         &lt;element name="IdRichiesta" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisultatoOperazione", propOrder = {
    "codiceStato",
    "errori",
    "idRichiesta",
    "timestamp"
})
public class RisultatoOperazione {

    @XmlElement(name = "CodiceStato")
    protected Integer codiceStato;
    @XmlElementRef(name = "Errori", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfErrorMessage> errori;
    @XmlElement(name = "IdRichiesta")
    protected String idRichiesta;
    @XmlElementRef(name = "Timestamp", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timestamp;

    /**
     * Recupera il valore della proprietà codiceStato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodiceStato() {
        return codiceStato;
    }

    /**
     * Imposta il valore della proprietà codiceStato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodiceStato(Integer value) {
        this.codiceStato = value;
    }

    /**
     * Recupera il valore della proprietà errori.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfErrorMessage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfErrorMessage> getErrori() {
        return errori;
    }

    /**
     * Imposta il valore della proprietà errori.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfErrorMessage }{@code >}
     *     
     */
    public void setErrori(JAXBElement<ArrayOfErrorMessage> value) {
        this.errori = value;
    }

    /**
     * Recupera il valore della proprietà idRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRichiesta() {
        return idRichiesta;
    }

    /**
     * Imposta il valore della proprietà idRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRichiesta(String value) {
        this.idRichiesta = value;
    }

    /**
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimestamp(JAXBElement<String> value) {
        this.timestamp = value;
    }

}
