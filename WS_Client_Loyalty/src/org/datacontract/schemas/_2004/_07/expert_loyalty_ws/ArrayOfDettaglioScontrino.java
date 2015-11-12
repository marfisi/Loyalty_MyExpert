
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfDettaglioScontrino complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDettaglioScontrino">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DettaglioScontrino" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}DettaglioScontrino" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDettaglioScontrino", propOrder = {
    "dettaglioScontrino"
})
public class ArrayOfDettaglioScontrino {

    @XmlElement(name = "DettaglioScontrino", nillable = true)
    protected List<DettaglioScontrino> dettaglioScontrino;

    /**
     * Gets the value of the dettaglioScontrino property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioScontrino property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioScontrino().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettaglioScontrino }
     * 
     * 
     */
    public List<DettaglioScontrino> getDettaglioScontrino() {
        if (dettaglioScontrino == null) {
            dettaglioScontrino = new ArrayList<DettaglioScontrino>();
        }
        return this.dettaglioScontrino;
    }

}
