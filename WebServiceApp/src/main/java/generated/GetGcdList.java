//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.11 at 11:55:09 AM AEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gcdList" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "gcdList"
})
@XmlRootElement(name = "getGcdList")
public class GetGcdList {

    @XmlElement(required = true)
    protected String gcdList;

    /**
     * Gets the value of the gcdList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcdList() {
        return gcdList;
    }

    /**
     * Sets the value of the gcdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcdList(String value) {
        this.gcdList = value;
    }

}
