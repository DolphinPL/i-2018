/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade1;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe de objetos aluno.
 */
@XmlRootElement(name = "aluno")
public class Aluno {

    private String nome;
    private String email;

    /**
     * Método de acesso ao nome de uma aluno.
     * @return Nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de acesso ao email de uma aluno.
     * @return Email do aluno.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método de acesso a variável nome.
     * @param nome Nome do aluno.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de acesso a variável email·
     * @param email Email do aluno.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;

        Aluno aluno = (Aluno) o;

        if (getNome() != null ? !getNome().equals(aluno.getNome()) : aluno.getNome() != null) return false;
        return getEmail() != null ? getEmail().equals(aluno.getEmail()) : aluno.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }
}
