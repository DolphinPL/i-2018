/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.documents;

import java.util.List;

/**
 * Classe que cria uma instância de nome de um parciente.
 */
public class Nome {

    private List<Representacao> representacao;
    private List<Utilizacao> utilizacoe;
    private String titulos;
    private String nomes;
    private String sobrenomes;
    private String sufixos;
    private String prefereido;
    private String usoCondicional;

    /**
     * Método de acesso ao atributo representação.
     */
    public List<Representacao> getRepresentacao() {
        return representacao;
    }

    /**
     * Método de acesso ao atributo representação.
     */
    public void setRepresentacao(List<Representacao> representacao) {
        this.representacao = representacao;
    }

    /**
     * Método de acesso ao atributo utilizações.
     */
    public List<Utilizacao> getUtilizacoe() {
        return utilizacoe;
    }

    /**
     * Método de acesso ao atributo utilizações.
     */
    public void setUtilizacoe(List<Utilizacao> utilizacoe) {
        this.utilizacoe = utilizacoe;
    }

    /**
     * Método de acesso ao atributo titulos.
     */
    public String getTitulos() {
        return titulos;
    }

    /**
     * Método de acesso ao atributo titulos.
     */
    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    /**
     * Método de acesso ao atributo nomes.
     */
    public String getNomes() {
        return nomes;
    }

    /**
     * Método de acesso ao atributo nomes.
     */
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    /**
     * Método de acesso ao atributo sobrenomes.
     */
    public String getSobrenomes() {
        return sobrenomes;
    }

    /**
     * Método de acesso ao atributo sobrenomes.
     */
    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    /**
     * Método de acesso ao atributo sufixos.
     */
    public String getSufixos() {
        return sufixos;
    }

    /**
     * Método de acesso ao atributo sufixos.
     */
    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    /**
     * Método de acesso ao atributo preferido.
     */
    public String getPrefereido() {
        return prefereido;
    }

    /**
     * Método de acesso ao atributo preferido.
     */
    public void setPrefereido(String prefereido) {
        this.prefereido = prefereido;
    }

    /**
     * Método de acesso ao atributo condicional.
     */
    public String getUsoCondicional() {
        return usoCondicional;
    }

    /**
     * Método de acesso ao atributo condicional.
     */
    public void setUsoCondicional(String usoCondicional) {
        this.usoCondicional = usoCondicional;
    }

}
