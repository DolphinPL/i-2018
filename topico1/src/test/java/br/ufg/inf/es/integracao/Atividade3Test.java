/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade3.Atividade3;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Atividade3Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoInexistenteGeraExcecao() throws Exception {
        Atividade3.recuperarArq("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoNomeEmBranco() throws Exception {
        Atividade3.recuperarArq(" ");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoSemNome() throws Exception {
        Atividade3.recuperarArq("");
    }

    @Test
    public void casosTrivial() throws Exception {
        String test = "Test";
        FileWriter arq = new FileWriter("test.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(test);
        arq.close();

        Assert.assertEquals(test + "\n", Atividade3.recuperarArq("test.txt"));

        File file = new File( "test.txt" );
        file.delete();
    }
    
}
