/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

/**
 * Classe que cria uma instância de Sapatos.
 */
public class Sapatos extends Calcados {

    private int red;
    private int green;
    private int blue;

    /**
     * Método de acesso ao atributo red.
     */
    public int getRed() {
        return red;
    }

    /**
     * Método de acesso ao atributo red.
     */
    public void setRed(int red) {
        this.red = red;
    }

    /**
     * Método de acesso ao atributo green.
     */
    public int getGreen() {
        return green;
    }

    /**
     * Método de acesso ao atributo green.
     */
    public void setGreen(int green) {
        this.green = green;
    }

    /**
     * Método de acesso ao atributo blue.
     */
    public int getBlue() {
        return blue;
    }

    /**
     * Método de acesso ao atributo blue.
     */
    public void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sapatos)) return false;
        if (!super.equals(o)) return false;

        Sapatos sapatos = (Sapatos) o;

        if (red != sapatos.red) return false;
        if (green != sapatos.green) return false;
        return blue == sapatos.blue;
    }

}
