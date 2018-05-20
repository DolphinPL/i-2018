/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Classe de objetos turma.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Turma {

    @XmlElementWrapper(name = "alunos")
    @XmlElement(name = "aluno")
    private List<Aluno> alunos;

    /**
     * Método responsável por dar acesso ao ArrayList alunos.
     * @return ArrayList de alunos.
     */
    public List<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * Método de acesso ao ArrayList alunos.
     */
    public void setAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }

}
