
package org.datacontract.schemas._2004._07.expert_loyalty_domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfTaglioBuono complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTaglioBuono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaglioBuono" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.Domain.Configurazione}TaglioBuono" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaglioBuono", propOrder = {
    "taglioBuono"
})
public class ArrayOfTaglioBuono {

    @XmlElement(name = "TaglioBuono", nillable = true)
    protected List<TaglioBuono> taglioBuono;

    /**
     * Gets the value of the taglioBuono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taglioBuono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaglioBuono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaglioBuono }
     * 
     * 
     */
    public List<TaglioBuono> getTaglioBuono() {
        if (taglioBuono == null) {
            taglioBuono = new ArrayList<TaglioBuono>();
        }
        return this.taglioBuono;
    }

}
