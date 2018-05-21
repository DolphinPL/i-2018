/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade4.Atividade4;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Atividade4Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoOneInexistenteGeraExcecao() throws Exception {
        Atividade4.persisteDados("", "/topico1/test.bat");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoNomeEmBrancoOneGeraExcecao() throws Exception {
        Atividade4.persisteDados(" ", "/topico1/test.bat");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoSemNomeOneGeraExcecao() throws Exception {
        Atividade4.persisteDados("", "/topico1/test.bat");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoTwoInexistenteGeraExcecao() throws Exception {
        Atividade4.persisteDados("/topico1/test.txt", "");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoNomeEmBrancoTwoGeraExcecao() throws Exception {
        Atividade4.persisteDados("/topico1/test.txt", " ");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoSemNomeTwoGeraExcecao() throws Exception {
        Atividade4.persisteDados("/topico1/test.txt", "");
    }
    
}
