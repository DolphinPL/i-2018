/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */


package br.ufg.inf.es.integracao.atividade4;

/**
 * Classe que cria uma instancia de um titulo de Eleitor.
 */
public class TituloEleitoral {

    private int secao;
    private int zona;

    /**
     * Método de acesso ao atributo seção.
     */
    public int getSecao() {
        return secao;
    }

    /**
     * Método de acesso ao atributo seção.
     */
    public void setSecao(int secao) {
        this.secao = secao;
    }

    /**
     * Método de acesso ao atributo zona.
     */
    public int getZona() {
        return zona;
    }

    /**
     * Método de acesso ao atributo zona.
     */
    public void setZona(int zona) {
        this.zona = zona;
    }
}
