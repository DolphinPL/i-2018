package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade4.Atividade4;
import org.junit.Test;

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
