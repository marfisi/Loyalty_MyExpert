
package org.datacontract.schemas._2004._07.expert_loyalty_domain;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TaglioBuono complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaglioBuono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceExpertBuono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportoMinimoSpesa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Punti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaglioBuono", propOrder = {
    "codiceExpertBuono",
    "importoMinimoSpesa",
    "punti",
    "valore"
})
public class TaglioBuono {

    @XmlElementRef(name = "CodiceExpertBuono", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codiceExpertBuono;
    @XmlElement(name = "ImportoMinimoSpesa")
    protected BigDecimal importoMinimoSpesa;
    @XmlElement(name = "Punti")
    protected Integer punti;
    @XmlElement(name = "Valore")
    protected BigDecimal valore;

    /**
     * Recupera il valore della proprietà codiceExpertBuono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodiceExpertBuono() {
        return codiceExpertBuono;
    }

    /**
     * Imposta il valore della proprietà codiceExpertBuono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodiceExpertBuono(JAXBElement<String> value) {
        this.codiceExpertBuono = value;
    }

    /**
     * Recupera il valore della proprietà importoMinimoSpesa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoMinimoSpesa() {
        return importoMinimoSpesa;
    }

    /**
     * Imposta il valore della proprietà importoMinimoSpesa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoMinimoSpesa(BigDecimal value) {
        this.importoMinimoSpesa = value;
    }

    /**
     * Recupera il valore della proprietà punti.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPunti() {
        return punti;
    }

    /**
     * Imposta il valore della proprietà punti.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPunti(Integer value) {
        this.punti = value;
    }

    /**
     * Recupera il valore della proprietà valore.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValore() {
        return valore;
    }

    /**
     * Imposta il valore della proprietà valore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValore(BigDecimal value) {
        this.valore = value;
    }

}
