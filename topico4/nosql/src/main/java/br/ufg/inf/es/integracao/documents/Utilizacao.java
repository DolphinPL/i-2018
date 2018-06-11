/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.documents;

import java.util.Calendar;

/**
 * Classe que cria uma instância de utilização.
 */
public class Utilizacao {

    private String uso;
    private Calendar dataInicial;
    private Calendar dataFinal;

    /**
     * Método de acesso ao atributo uso.
     */
    public String getUso() {
        return uso;
    }

    /**
     * Método de acesso ao atributo uso.
     */
    public void setUso(String uso) {
        this.uso = uso;
    }

    /**
     * Método de acesso ao atributo data de inicio.
     */
    public Calendar getDataInicial() {
        return dataInicial;
    }

    /**
     * Método de acesso ao atributo data de inicio.
     */
    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    /**
     * Método de acesso ao atributo data de fim.
     */
    public Calendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Método de acesso ao atributo data de fim.
     */
    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }

}
