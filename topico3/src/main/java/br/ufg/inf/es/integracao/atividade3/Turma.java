/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;

/**
 * Classe que instancia uma turma e seus estudantes.
 */
@JacksonXmlRootElement(localName = "turma")
public class Turma {

    private String disciplina;
    @JacksonXmlElementWrapper(localName = "estudantes")
    @JacksonXmlProperty(localName = "estudante")
    private ArrayList<Estudante> estudantes;

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
    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    /**
     * Método de acesso ao atributo estudante.
     * @param estudantes dados dos estudantes.
     */
    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

}
