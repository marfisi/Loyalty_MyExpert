
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoTagliBuono;


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
 *         &lt;element name="ElencaTagliBuonoResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoTagliBuono" minOccurs="0"/>
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
    "elencaTagliBuonoResult"
})
@XmlRootElement(name = "ElencaTagliBuonoResponse")
public class ElencaTagliBuonoResponse {

    @XmlElementRef(name = "ElencaTagliBuonoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoTagliBuono> elencaTagliBuonoResult;

    /**
     * Recupera il valore della proprietà elencaTagliBuonoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoTagliBuono }{@code >}
     *     
     */
    public JAXBElement<RisultatoTagliBuono> getElencaTagliBuonoResult() {
        return elencaTagliBuonoResult;
    }

    /**
     * Imposta il valore della proprietà elencaTagliBuonoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoTagliBuono }{@code >}
     *     
     */
    public void setElencaTagliBuonoResult(JAXBElement<RisultatoTagliBuono> value) {
        this.elencaTagliBuonoResult = value;
    }

}
