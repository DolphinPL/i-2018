/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade3;

import java.util.Objects;

/**
 * Classe que descreve o endereço do estudante.
 */
public class Endereco {

    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;

    /**
     * Método construtor da classe Endereço.
     * @param cep cep do endereço.
     * @param logradouro nome da rua.
     * @param numero numero da residencia.
     * @param complemento complemento do endereço.
     */
    public Endereco(String cep, String logradouro, int numero, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    /**
     * Método de acesso ao atributo cep.
     * @return cep do estudante.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Método de acesso ao atributo cep.
     * @param cep cep no estudante.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Método de acesso ao atributo Logradouro.
     * @return Logradouro/rua do estudante.
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Método de acesso ao atributo Logradouro.
     * @param logradouro nome do logradouro/rua do estudante.
     */
    public void setLogradouro(String logradouro) {
        logradouro = logradouro;
    }

    /**
     * Método de acesso ao atributo número.
     * @return número da residencia do estudante.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método de acesso ao atributo Número.
     * @param numero do estudante.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método de acesso atributo complemento.
     * @return complemento do estudante.
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Método de acesso ao atributo complemento.
     * @param complemento complemento do endereço.
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
