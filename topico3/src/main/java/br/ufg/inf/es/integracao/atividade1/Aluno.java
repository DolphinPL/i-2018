package br.ufg.inf.es.integracao.atividade1;

/**
 * Created by aluno on 07/05/18.
 */
public class Aluno {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
