
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfStemma complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStemma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Stemma" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}Stemma" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStemma", propOrder = {
    "stemma"
})
public class ArrayOfStemma {

    @XmlElement(name = "Stemma", nillable = true)
    protected List<Stemma> stemma;

    /**
     * Gets the value of the stemma property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stemma property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStemma().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stemma }
     * 
     * 
     */
    public List<Stemma> getStemma() {
        if (stemma == null) {
            stemma = new ArrayList<Stemma>();
        }
        return this.stemma;
    }

}
