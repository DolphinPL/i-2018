package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade1.Aluno;
import br.ufg.inf.es.integracao.atividade1.Atividade1;
import br.ufg.inf.es.integracao.atividade1.Turma;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Atividade1Test {

    /*@Test
    public void casosTrivial() throws Exception {

        FileWriter arq = new FileWriter("arq.csv");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("João Silva;joao@example.com");
        arq.close();
        Aluno aluno = new Aluno();
        aluno.setNome("João Silva");
        aluno.setEmail("joão@example.com");
        Turma turma = new Turma();
        turma.setAlunos(aluno);
        //Assert.assertEquals(turma, Atividade1.recuperar("arq.csv"));

        FileWriter arq = new FileWriter("test.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("Test");
        arq.close();

        Assert.assertEquals(54657374, Atividade1.retornaHexa("test.txt"));

        File file = new File( "test.txt" );
        file.delete();
    }*/
}
