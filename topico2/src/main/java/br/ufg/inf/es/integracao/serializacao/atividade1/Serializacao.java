/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.serializacao.atividade1;

import java.io.*;

/**
* Classe que gera exerção ao tentar serializar um obleto.
*/
public class Serializacao {

    /**
     * Método responsável pela inicialização do programa.
     * @param args argumentos de entrada do metodo persistir.
     */
    public static void main(String[] args) {
        try {
            persistir(args[0], args[1], args[2], args[3], args[4]);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Método que serializar um objeto.
     * @param nomeTurma nome da turma a ser criada.
     * @param nomeProfessor professor da turma.
     * @param nomeAluno nome do aluno.
     * @param matriculaAluno número de matricula de determinado aluno
     * @param nomeArquivo nome do arquivo onde sera salvo.
     * @throws IOException caso o nome do arquivo seja invalido.
     */
    public static boolean persistir(String nomeTurma, String nomeProfessor, String nomeAluno,
        String matriculaAluno, String nomeArquivo) throws IOException {

        if (nomeArquivo.equals(null) || nomeArquivo.trim().isEmpty()) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
        }

        Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
        Aluno[] alunos = {aluno};
        Turma turma = new Turma(nomeTurma, nomeProfessor, alunos);

        ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomeArquivo)));
        objectOut.writeObject(turma);
        objectOut.close();

        return true;

    }

}
