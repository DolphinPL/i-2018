/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */


package br.ufg.inf.es.integracao.atividade4;

/**
 * Classe que cria uma instância de formas de  meios de comunicação.
 */
public class Comunicacao {

    private String meio;
    private String preferencia;
    private String detalhes;
    private String uso;


    /**
     * Método de acesso ao atributo meio.
     */
    public String getMeio() {
        return meio;
    }

    /**
     * Método de acesso ao atributo meio.
     */
    public void setMeio(String meio) {
        this.meio = meio;
    }

    /**
     * Método de acesso ao atributo preferencia.
     */
    public String getPreferencia() {
        return preferencia;
    }

    /**
     * Método de acesso ao atributo preferencia.
     */
    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    /**
     * Método de acesso ao atributo detalhes.
     */
    public String getDetalhes() {
        return detalhes;
    }

    /**
     * Método de acesso ao atributo detalhes.
     */
    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

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
}
