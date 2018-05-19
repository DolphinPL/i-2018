/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */


package br.ufg.inf.es.integracao.atividade4;

import java.util.List;

/**
 * Classe que cria uma instância de individuo.
 */
public class Individuo {

    private DadoDemografico dadoDemografico;
    private List<Endereco> enderecos;
    private List<Vinculo> vinculos;
    private List<Identificador> identificadores;
    private List<Nome> nomes;
    private List<Comunicacao> comunicacoes;

    /**
     * Método de acesso ao atributo dados demograficos.
     */
    public DadoDemografico getDadoDemografico() {
        return dadoDemografico;
    }

    /**
     * Método de acesso ao atributo dados demograficos.
     */
    public void setDadoDemografico(DadoDemografico dadoDemografico) {
        this.dadoDemografico = dadoDemografico;
    }

    /**
     * Método de acesso ao atributo endereço.
     */
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * Método de acesso ao atributo endereço.
     */
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    /**
     * Método de acesso ao atributo vinculo.
     */
    public List<Vinculo> getVinculos() {
        return vinculos;
    }

    /**
     * Método de acesso ao atributo vinculo.
     */
    public void setVinculos(List<Vinculo> vinculos) {
        this.vinculos = vinculos;
    }

    /**
     * Método de acesso ao atributo identificadores.
     */
    public List<Identificador> getIdentificadores() {
        return identificadores;
    }

    /**
     * Método de acesso ao atributo identificadores.
     */
    public void setIdentificadores(List<Identificador> identificadores) {
        this.identificadores = identificadores;
    }

    /**
     * Método de acesso ao atributo nome.
     */
    public List<Nome> getNomes() {
        return nomes;
    }

    /**
     * Método de acesso ao atributo nome.
     */
    public void setNomes(List<Nome> nomes) {
        this.nomes = nomes;
    }

    /**
     * Método de acesso ao atributo comunicações.
     */
    public List<Comunicacao> getComunicacoes() {
        return comunicacoes;
    }

    /**
     * Método de acesso ao atributo comunicações.
     */
    public void setComunicacoes(List<Comunicacao> comunicacoes) {
        this.comunicacoes = comunicacoes;
    }
}
