package br.ufg.inf.es.integracao.serializacao.atividade2;

import java.io.Serializable;

/**
 * Classe responsável pelo dados de um aluno.
 */
public class Funcionario implements Serializable {

    private String nome;
    private String matricula;

    /**
     * método construtor.
     * @param nome nome de um funiconario.
     * @param matricula matricula de um funiconario.
     */
    public Funcionario(String nome, String matricula) {
        super();
        this.nome = nome;
        this.matricula = matricula;
    }

    /**
     * método responsável por exibir o nome do funiconario.
     * @return nome do funiconario.
     */
    public String getNome() {
        return nome;
    }

    /**
     * método responsável por exibir a matricula de um funiconario.
     * @return matricula de um funiconario.
     */
    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        return matricula != null ? matricula.equals(that.matricula) : that.matricula == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        return result;
    }
}
