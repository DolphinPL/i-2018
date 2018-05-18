/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

/**
 * Classe que instância um Calçado.
 */

public class Calcados {

    private String nome;
    private float preco;
    /**
     * Método de acesso ao atributo nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de acesso ao atributo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de acesso ao atributo preço.
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Método de acesso ao atributo preço.
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calcados)) return false;

        Calcados calcados = (Calcados) o;

        if (Float.compare(calcados.preco, preco) != 0) return false;
        return nome != null ? nome.equals(calcados.nome) : calcados.nome == null;
    }

}
