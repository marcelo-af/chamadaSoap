
package com.projectsoap.correios.servico;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoriaServico.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="categoriaServico"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEM_CATEGORIA"/&gt;
 *     &lt;enumeration value="PAC"/&gt;
 *     &lt;enumeration value="SEDEX"/&gt;
 *     &lt;enumeration value="CARTA"/&gt;
 *     &lt;enumeration value="GRANDES_FORMATOS"/&gt;
 *     &lt;enumeration value="REVERSO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "categoriaServico")
@XmlEnum
public enum CategoriaServico {

    SEM_CATEGORIA,
    PAC,
    SEDEX,
    CARTA,
    GRANDES_FORMATOS,
    REVERSO;

    public String value() {
        return name();
    }

    public static CategoriaServico fromValue(String v) {
        return valueOf(v);
    }

}
