
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoOttieniElencoOrdini;


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
 *         &lt;element name="OttieniElencoOrdiniResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoOttieniElencoOrdini" minOccurs="0"/>
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
    "ottieniElencoOrdiniResult"
})
@XmlRootElement(name = "OttieniElencoOrdiniResponse")
public class OttieniElencoOrdiniResponse {

    @XmlElementRef(name = "OttieniElencoOrdiniResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoOttieniElencoOrdini> ottieniElencoOrdiniResult;

    /**
     * Recupera il valore della proprietÓ ottieniElencoOrdiniResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoOttieniElencoOrdini }{@code >}
     *     
     */
    public JAXBElement<RisultatoOttieniElencoOrdini> getOttieniElencoOrdiniResult() {
        return ottieniElencoOrdiniResult;
    }

    /**
     * Imposta il valore della proprietÓ ottieniElencoOrdiniResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoOttieniElencoOrdini }{@code >}
     *     
     */
    public void setOttieniElencoOrdiniResult(JAXBElement<RisultatoOttieniElencoOrdini> value) {
        this.ottieniElencoOrdiniResult = value;
    }

}
