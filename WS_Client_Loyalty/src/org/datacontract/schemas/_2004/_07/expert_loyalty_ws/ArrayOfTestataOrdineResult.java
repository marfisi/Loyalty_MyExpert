
package org.datacontract.schemas._2004._07.expert_loyalty_ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ArrayOfTestataOrdineResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTestataOrdineResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestataOrdineResult" type="{http://schemas.datacontract.org/2004/07/Expert.Loyalty.WS.DTO}TestataOrdineResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTestataOrdineResult", propOrder = {
    "testataOrdineResult"
})
public class ArrayOfTestataOrdineResult {

    @XmlElement(name = "TestataOrdineResult", nillable = true)
    protected List<TestataOrdineResult> testataOrdineResult;

    /**
     * Gets the value of the testataOrdineResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testataOrdineResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestataOrdineResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestataOrdineResult }
     * 
     * 
     */
    public List<TestataOrdineResult> getTestataOrdineResult() {
        if (testataOrdineResult == null) {
            testataOrdineResult = new ArrayList<TestataOrdineResult>();
        }
        return this.testataOrdineResult;
    }

}
