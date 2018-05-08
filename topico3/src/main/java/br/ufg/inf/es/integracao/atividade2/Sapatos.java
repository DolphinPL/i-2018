/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

/**
 * Created by aluno on 07/05/18.
 */
public class Sapatos extends Calcados {

    private int red;
    private int green;
    private int blue;

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

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
