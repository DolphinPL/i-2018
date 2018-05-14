/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade3.Atividade3;
import org.junit.Test;

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
    
}
