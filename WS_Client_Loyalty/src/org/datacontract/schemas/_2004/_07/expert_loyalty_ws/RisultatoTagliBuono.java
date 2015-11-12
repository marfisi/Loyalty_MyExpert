
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.expert_loyalty_domain.ArrayOfTaglioBuono;


/**
 * <p>Classe Java per RisultatoTagliBuono complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RisultatoTagliBuono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RisultatoOperazione" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}RisultatoOperazione" minOccurs="0"/>
 *         &lt;element name="TagliBuono" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione}ArrayOfTaglioBuono" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RisultatoTagliBuono", propOrder = {
    "risultatoOperazione",
    "tagliBuono"
})
public class RisultatoTagliBuono {

    @XmlElementRef(name = "RisultatoOperazione", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<RisultatoOperazione> risultatoOperazione;
    @XmlElementRef(name = "TagliBuono", namespace = "http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaglioBuono> tagliBuono;

    /**
     * Recupera il valore della proprietà risultatoOperazione.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}
     *     
     */
    public JAXBElement<RisultatoOperazione> getRisultatoOperazione() {
        return risultatoOperazione;
    }

    /**
     * Imposta il valore della proprietà risultatoOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RisultatoOperazione }{@code >}
     *     
     */
    public void setRisultatoOperazione(JAXBElement<RisultatoOperazione> value) {
        this.risultatoOperazione = value;
    }

    /**
     * Recupera il valore della proprietà tagliBuono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaglioBuono }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaglioBuono> getTagliBuono() {
        return tagliBuono;
    }

    /**
     * Imposta il valore della proprietà tagliBuono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaglioBuono }{@code >}
     *     
     */
    public void setTagliBuono(JAXBElement<ArrayOfTaglioBuono> value) {
        this.tagliBuono = value;
    }

}
