
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoGenerazioneBuono;


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
 *         &lt;element name="GenerazioneBuonoResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoGenerazioneBuono" minOccurs="0"/>
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
    "generazioneBuonoResult"
})
@XmlRootElement(name = "GenerazioneBuonoResponse")
public class GenerazioneBuonoResponse {

    @XmlElementRef(name = "GenerazioneBuonoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoGenerazioneBuono> generazioneBuonoResult;

    /**
     * Recupera il valore della propriet� generazioneBuonoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoGenerazioneBuono }{@code >}
     *     
     */
    public JAXBElement<RisultatoGenerazioneBuono> getGenerazioneBuonoResult() {
        return generazioneBuonoResult;
    }

    /**
     * Imposta il valore della propriet� generazioneBuonoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoGenerazioneBuono }{@code >}
     *     
     */
    public void setGenerazioneBuonoResult(JAXBElement<RisultatoGenerazioneBuono> value) {
        this.generazioneBuonoResult = value;
    }

}
