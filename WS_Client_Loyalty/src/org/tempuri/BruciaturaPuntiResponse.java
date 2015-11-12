
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.RisultatoBruciaturaPunti;


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
 *         &lt;element name="BruciaturaPuntiResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoBruciaturaPunti" minOccurs="0"/>
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
    "bruciaturaPuntiResult"
})
@XmlRootElement(name = "BruciaturaPuntiResponse")
public class BruciaturaPuntiResponse {

    @XmlElementRef(name = "BruciaturaPuntiResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoBruciaturaPunti> bruciaturaPuntiResult;

    /**
     * Recupera il valore della proprietà bruciaturaPuntiResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoBruciaturaPunti }{@code >}
     *     
     */
    public JAXBElement<RisultatoBruciaturaPunti> getBruciaturaPuntiResult() {
        return bruciaturaPuntiResult;
    }

    /**
     * Imposta il valore della proprietà bruciaturaPuntiResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoBruciaturaPunti }{@code >}
     *     
     */
    public void setBruciaturaPuntiResult(JAXBElement<RisultatoBruciaturaPunti> value) {
        this.bruciaturaPuntiResult = value;
    }

}
