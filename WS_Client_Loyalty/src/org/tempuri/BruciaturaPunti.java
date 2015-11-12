
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.DatiClient;
import org.datacontract.schemas._2004._07.expert_loyalty_ws.VerificaCodice;


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
 *         &lt;element name="verificaCodice" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}VerificaCodice" minOccurs="0"/>
 *         &lt;element name="puntiRichiesti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totaleSpesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "verificaCodice",
    "puntiRichiesti",
    "totaleSpesa"
})
@XmlRootElement(name = "BruciaturaPunti")
public class BruciaturaPunti {

    @XmlElementRef(name = "datiClient", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DatiClient> datiClient;
    @XmlElementRef(name = "verificaCodice", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<VerificaCodice> verificaCodice;
    protected Integer puntiRichiesti;
    @XmlElementRef(name = "totaleSpesa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totaleSpesa;

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
     * Recupera il valore della proprietà verificaCodice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerificaCodice }{@code >}
     *     
     */
    public JAXBElement<VerificaCodice> getVerificaCodice() {
        return verificaCodice;
    }

    /**
     * Imposta il valore della proprietà verificaCodice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerificaCodice }{@code >}
     *     
     */
    public void setVerificaCodice(JAXBElement<VerificaCodice> value) {
        this.verificaCodice = value;
    }

    /**
     * Recupera il valore della proprietà puntiRichiesti.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPuntiRichiesti() {
        return puntiRichiesti;
    }

    /**
     * Imposta il valore della proprietà puntiRichiesti.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPuntiRichiesti(Integer value) {
        this.puntiRichiesti = value;
    }

    /**
     * Recupera il valore della proprietà totaleSpesa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotaleSpesa() {
        return totaleSpesa;
    }

    /**
     * Imposta il valore della proprietà totaleSpesa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotaleSpesa(JAXBElement<String> value) {
        this.totaleSpesa = value;
    }

}
