
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DatiClient;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.FiltroElencoOrdini;


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
 *         &lt;element name="datiClient" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}DatiClient" minOccurs="0"/>
 *         &lt;element name="filtro" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}FiltroElencoOrdini" minOccurs="0"/>
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
    "datiClient",
    "filtro"
})
@XmlRootElement(name = "OttieniElencoOrdini")
public class OttieniElencoOrdini {

    @XmlElementRef(name = "datiClient", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DatiClient> datiClient;
    @XmlElementRef(name = "filtro", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<FiltroElencoOrdini> filtro;

    /**
     * Recupera il valore della proprietà datiClient.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatiClient }{@code >}
     *     
     */
    public JAXBElement<DatiClient> getDatiClient() {
        return datiClient;
    }

    /**
     * Imposta il valore della proprietà datiClient.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatiClient }{@code >}
     *     
     */
    public void setDatiClient(JAXBElement<DatiClient> value) {
        this.datiClient = value;
    }

    /**
     * Recupera il valore della proprietà filtro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FiltroElencoOrdini }{@code >}
     *     
     */
    public JAXBElement<FiltroElencoOrdini> getFiltro() {
        return filtro;
    }

    /**
     * Imposta il valore della proprietà filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FiltroElencoOrdini }{@code >}
     *     
     */
    public void setFiltro(JAXBElement<FiltroElencoOrdini> value) {
        this.filtro = value;
    }

}
