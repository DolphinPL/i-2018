/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.documents;

/**
 * Classe que cria uma instância de uma representação.
 */
public class Representacao {

    private String utilizacao;
    private String alternativa;

    /**
     * Método de acesso ao atributo utilização.
     */
    public String getUtilizacao() {
        return utilizacao;
    }

    /**
     * Método de acesso ao atributo utilização.
     */
    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    /**
     * Método de acesso ao atributo alternativa.
     */
    public String getAlternativa() {
        return alternativa;
    }

    /**
     * Método de acesso ao atributo alternativa.
     */
    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

}
