/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Classe que cria uma instancia de Tenis.
 */
public class Tenis extends Calcados {

    private String esporte;

    /**
     * Método de acesso ao atributo esporte.
     * @return dados do atributo esporte.
     */
    public String getEsporte() {
        return esporte;
    }

    /**
     * Método de acesso ao atributo esporte.
     */
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

}
