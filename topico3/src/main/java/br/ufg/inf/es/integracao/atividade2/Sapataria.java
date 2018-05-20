/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import java.util.ArrayList;

/**
 * Classe que instancia uma Sapataria.
 */
public class Sapataria {

    private ArrayList<Sapatos> sapatos;
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
