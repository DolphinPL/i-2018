/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade6.Atividade6;
import org.junit.Test;

public class Atividade6Test {
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoInexistenteGeraExcecao() throws Exception {
        Atividade6.returnToTxt("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoNomeEmBrancoGeraExcecao() throws Exception {
        Atividade6.returnToTxt(" ");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void arquivoSemNomeGeraExcecao() throws Exception {
        Atividade6.returnToTxt("");
    }
    
}
