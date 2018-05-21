/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade1.Aluno;
import br.ufg.inf.es.integracao.atividade1.Atividade1;
import br.ufg.inf.es.integracao.atividade1.Turma;
import org.junit.Test;
import org.testng.Assert;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Atividade1Test {

    @Test
    public void casoTrivialPrincipal() throws IOException, JAXBException {

        Aluno aluno = new Aluno();
        aluno.setEmail("antonio@example.com");
        aluno.setNome("Antonio");
        ArrayList<Aluno> aluno2 = new ArrayList<Aluno>();
        aluno2.add(0, aluno);
        Turma turma = new Turma();
        turma.setAlunos(aluno2);

        FileWriter arq = new FileWriter("arqTest.csv");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("Antonio;antonio@example.com");
        arq.close();

        Assert.assertEquals("Antonio", Atividade1.recuperar("arqTest.csv").getAlunos().get(0).getNome());
        Assert.assertEquals("antonio@example.com", Atividade1.recuperar("arqTest.csv").getAlunos().get(0).getEmail());

        File file = new File( "arqTest.csv");
        file.delete();

    }

    @Test
    public void casosTrivialClassesAuxiliares() {

        Aluno aluno = new Aluno();
        aluno.setEmail("joao@example.com");
        aluno.setNome("Auri");

        Assert.assertEquals("Auri", aluno.getNome());
        Assert.assertEquals("joao@example.com", aluno.getEmail());

        ArrayList<Aluno> aluno2 = new ArrayList<Aluno>();
        aluno2.add(0, aluno);
        Turma turma = new Turma();
        turma.setAlunos(aluno2);

        Assert.assertEquals(aluno2, turma.getAlunos());
    }
}
