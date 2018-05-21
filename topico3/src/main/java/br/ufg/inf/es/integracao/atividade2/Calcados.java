/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Classe que instância um Calçado.
 */
@JacksonXmlRootElement(localName = "calcado")
public class Calcados {

    private String marca;
    private float preco;
    /**
     * Método de acesso ao atributo nome.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método de acesso ao atributo nome.
     */
    public void setMarca(String marca) {
        this.marca = marca;
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

}
