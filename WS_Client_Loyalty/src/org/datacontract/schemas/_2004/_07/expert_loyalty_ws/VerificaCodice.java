
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VerificaCodice complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerificaCodice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaratteriControllo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodiceCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PosizioniControllo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificaCodice", propOrder = {
    "caratteriControllo",
    "codiceCard",
    "posizioniControllo"
})
public class VerificaCodice {

    @XmlElement(name = "CaratteriControllo", required = true, nillable = true)
    protected String caratteriControllo;
    @XmlElement(name = "CodiceCard", required = true, nillable = true)
    protected String codiceCard;
    @XmlElement(name = "PosizioniControllo", required = true, nillable = true)
    protected String posizioniControllo;

    /**
     * Recupera il valore della proprietà caratteriControllo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaratteriControllo() {
        return caratteriControllo;
    }

    /**
     * Imposta il valore della proprietà caratteriControllo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaratteriControllo(String value) {
        this.caratteriControllo = value;
    }

    /**
     * Recupera il valore della proprietà codiceCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCard() {
        return codiceCard;
    }

    /**
     * Imposta il valore della proprietà codiceCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCard(String value) {
        this.codiceCard = value;
    }

    /**
     * Recupera il valore della proprietà posizioniControllo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosizioniControllo() {
        return posizioniControllo;
    }

    /**
     * Imposta il valore della proprietà posizioniControllo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosizioniControllo(String value) {
        this.posizioniControllo = value;
    }

}
