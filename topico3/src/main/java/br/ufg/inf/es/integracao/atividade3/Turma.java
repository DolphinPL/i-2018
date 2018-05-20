/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade3;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Classe que instancia uma turma e seus estudantes.
 */
public class Turma {

    private String disciplina;
    @JsonProperty("Estudante")
    private List<Estudante> estudantes;

    /**
     * Método de acesso ao atributo disciplina.
     * @return nome da disciplina.
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Método de acesso ao atributo disciplina.
     * @param disciplina nome da disciplina.
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * Método de acesso ao atributo estudante.
     * @return dados do estudante.
     */
    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    /**
     * Método de acesso ao atributo estudante.
     * @param estudantes dados dos estudantes.
     */
    public void setEstudantes(Estudante estudantes) {
        this.estudantes.add(estudantes);
    }

}
