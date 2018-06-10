/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.documents;

/**
 * Classe que cria uma instancia de CTPS.
 */
public class Ctps {

    private String serie;
    private String estado;

    /**
     * Método de acesso ao atributo serie.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Método de acesso ao atributo serie.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Método de acesso ao atributo estado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método de acesso ao atributo estado.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
