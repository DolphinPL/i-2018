/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import java.util.ArrayList;

public class Sapataria {

    private ArrayList<Sapatos> sapatos;
    private ArrayList<Tenis> tenis;

    public ArrayList<Sapatos> getSapatos() {
        return sapatos;
    }

    public void setSapatos(ArrayList<Sapatos> sapatos) {
        this.sapatos = sapatos;
    }

    public ArrayList<Tenis> getTenis() {
        return tenis;
    }

    public void setTenis(ArrayList<Tenis> tenis) {
        this.tenis = tenis;
    }
}
