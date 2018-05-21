/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.ArrayList;

/**
 * Classe que instancia uma Sapataria.
 */
@JacksonXmlRootElement(localName = "calcados")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sapataria {

    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Sapatos> sapatos;
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Tenis> tenis;

    /**
     * Método de acesso ao atributo Sapato.
     */
    public ArrayList<Sapatos> getSapatos() {
        return sapatos;
    }

    /**
     * Método de acesso ao atributo Sapato.
     */
    public void setSapatos(ArrayList<Sapatos> sapatos) {
        this.sapatos = sapatos;
    }

    /**
     * Método de acesso ao atributo Tenis.
     */
    public ArrayList<Tenis> getTenis() {
        return tenis;
    }

    /**
     * Método de acesso ao atributo Tenis.
     */
    public void setTenis(ArrayList<Tenis> tenis) {
        this.tenis = tenis;
    }
}
