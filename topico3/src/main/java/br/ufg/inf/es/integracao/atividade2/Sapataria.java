/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import java.util.List;

/**
 * Classe que instancia uma Sapataria.
 */
public class Sapataria {

    private List<Sapatos> sapatos;
    private List<Tenis> tenis;

    /**
     * Método de acesso ao atributo Sapato.
     */
    public List<Sapatos> getSapatos() {
        return sapatos;
    }

    /**
     * Método de acesso ao atributo Sapato.
     */
    public void setSapatos(List<Sapatos> sapatos) {
        this.sapatos = sapatos;
    }

    /**
     * Método de acesso ao atributo Tenis.
     */
    public List<Tenis> getTenis() {
        return tenis;
    }

    /**
     * Método de acesso ao atributo Tenis.
     */
    public void setTenis(List<Tenis> tenis) {
        this.tenis = tenis;
    }
}
