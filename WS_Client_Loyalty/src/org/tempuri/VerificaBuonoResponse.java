
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoVerificaBuono;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerificaBuonoResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoVerificaBuono" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "verificaBuonoResult"
})
@XmlRootElement(name = "VerificaBuonoResponse")
public class VerificaBuonoResponse {

    @XmlElementRef(name = "VerificaBuonoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoVerificaBuono> verificaBuonoResult;

    /**
     * Recupera il valore della proprietà verificaBuonoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoVerificaBuono }{@code >}
     *     
     */
    public JAXBElement<RisultatoVerificaBuono> getVerificaBuonoResult() {
        return verificaBuonoResult;
    }

    /**
     * Imposta il valore della proprietà verificaBuonoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoVerificaBuono }{@code >}
     *     
     */
    public void setVerificaBuonoResult(JAXBElement<RisultatoVerificaBuono> value) {
        this.verificaBuonoResult = value;
    }

}
