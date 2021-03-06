/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade8.Atividade8;
import org.junit.Test;

public class Atividade8Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoOneInexistenteGeraExcecao() throws Exception {
        Atividade8.search("", 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoNomeEmBrancoOneGeraExcecao() throws Exception {
        Atividade8.search(" ", 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoSemNomeOneGeraExcecao() throws Exception {
        Atividade8.search("", 2);
    }
  
}
