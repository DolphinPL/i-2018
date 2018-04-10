package br.ufg.inf.es.integracao.serializacao.atividade1;

import java.io.Serializable;

/**
 * Classe responsável pelo dados de um aluno.
 */
public class Aluno implements Serializable {

    private String nome;
    private int matricula;

    /**
     * método construtor.
     * @param nome nome de um aluno.
     * @param matricula matricula de um aluno.
     */
    public Aluno(String nome, int matricula) {
        super();
        this.nome = nome;
        this.matricula = matricula;
    }

    /**
     * método responsável por exibir o nome do aluno.
     * @return nome do aluno.
     */
    public String getNome() {
        return nome;
    }

    /**
     * método responsável por exibir a matricula de um aluno.
     * @return matricula de um aluno.
     */
    public int getMatricula() {
        return matricula;
    }

}
