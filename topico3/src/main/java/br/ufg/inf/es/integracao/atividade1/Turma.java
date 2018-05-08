/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade1;

import java.util.ArrayList;

/**
 * Classe de objetos turma.
 */
public class Turma {

    private ArrayList<Aluno> alunos;

    /**
     * Método responsável por dar acesso ao ArrayList alunos.
     * @return ArrayList de alunos.
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * Método de acesso ao ArrayList alunos.
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Turma)) return false;

        Turma turma = (Turma) o;

        return getAlunos() != null ? getAlunos().equals(turma.getAlunos()) : turma.getAlunos() == null;
    }

    @Override
    public int hashCode() {
        return getAlunos() != null ? getAlunos().hashCode() : 0;
    }
}
