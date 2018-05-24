/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade3;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Classe que realiza a instância de um estudante.
 */
public class Estudante {

    private String nome;
    private int matricula;
    @JsonProperty("Endereço")
    private Endereco endereco;

    /**
     * Método de acesso ao atributo nome.
     * @return nome do estudante.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de acesso ao atributo nome.
     * @param nome do estudante.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de acesso ao atributo magtricula.
     * @return matricula do estudante.
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Méttodo de acesso ao atributo matricula.
     * @param matricula do estudante.
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * Método de acesso ao atributo endereço.
     * @return endereço do estudante.
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Método de acesso ao atributo endereço.
     * @param endereco do estudante.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
