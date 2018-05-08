/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

/**
 * Created by aluno on 07/05/18.
 */
public class Tenis extends Calcados {

    private String esporte;

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tenis)) return false;
        if (!super.equals(o)) return false;

        Tenis tenis = (Tenis) o;

        return esporte != null ? esporte.equals(tenis.esporte) : tenis.esporte == null;
    }

}
