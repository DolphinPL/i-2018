package br.ufg.inf.es.integracao.serializacao.atividade1;

/**
 * Classe responsável pelo dados de uma turma.
 */
public class Turma {

    private String nome;
    private String professor;
    private Aluno[] alunos;

    /**
     * método construtor.
     * @param nome nome da turma.
     * @param professor nome do professor da turma.
     * @param alunos vetor com os dados dos alunos da turma.
     */
    public Turma(String nome, String professor, Aluno[] alunos) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
    }

    /**
     * método responsável por exibir nome da turma.
     * @return nome da turma.
     */
    public String getNome() {
        return nome;
    }

    /**
     * método responsável por exibir o nome do professor da turma.
     * @return nome do professor.
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * método responsável pela exibição dos alunos.
     * @return dados dos alunos.
     */
    public Aluno[] getAlunos() {
        return alunos;
    }
}
