/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade2.Atividade2;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Atividade2Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoInexistenteGeraExcecao() throws Exception {
        Atividade2.verificaArquivo("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoNomeEmBranco() throws Exception {
        Atividade2.verificaArquivo(" ");
    }

    @Test
    public void casosTrivial() throws Exception {
        FileWriter arq = new FileWriter("test.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("Test");
        arq.close();

        Assert.assertEquals(false, Atividade2.verificaArquivo("test.txt"));

        File file = new File( "test.txt" );
        file.delete();
    }
    
}
