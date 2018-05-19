/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade1.Atividade1;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Atividade1Test {

    @Test(expected = IllegalArgumentException.class)
    public void arquivoInexistenteGeraExcecao() throws Exception {
        Atividade1.retornaHexa("");
    }

    @Test(expected = FileNotFoundException.class)
    public void arquivoNaoExiteNomeValido() throws Exception {
        Assert.assertEquals(10, Atividade1.retornaHexa("Invalido.txt"));
    }

    @Test
    public void casosTrivial() throws Exception {
        FileWriter arq = new FileWriter("test.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("Test");
        arq.close();

        Assert.assertEquals(54657374, Atividade1.retornaHexa("test.txt"));

        File file = new File( "test.txt" );
        file.delete();
    }
}
