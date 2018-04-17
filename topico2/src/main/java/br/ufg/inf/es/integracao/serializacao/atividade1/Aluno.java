package br.ufg.inf.es.integracao.serializacao.atividade1;

/**
 * Classe responsável pelo dados de um aluno.
 */
public class Aluno {

    private String nome;
    private String matricula;

    /**
     * método construtor.
     * @param nome nome de um aluno.
     * @param matricula matricula de um aluno.
     */
    public Aluno(String nome, String matricula) {
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
    public String getMatricula() {
        return matricula;
    }

}
