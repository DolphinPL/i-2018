/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

/**
 * Created by aluno on 07/05/18.
 */

public class Calcados {

    private String nome;
    private float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

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
