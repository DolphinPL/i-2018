package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade1.Atividade1;
import org.junit.Test;

public class Atividade1Test {

    @Test(expected = IllegalArgumentException.class)
    public void arquivoInexistenteGeraExcecao() throws Exception {
        Atividade1.retornaHexa("");
    }
}
