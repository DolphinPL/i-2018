/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade3.Atividade3a;
import br.ufg.inf.es.integracao.atividade3.Atividade3b;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Atividade3Test {

    @Test(expected = IllegalArgumentException.class)
    public void nomeInvalido() throws FileNotFoundException, UnsupportedEncodingException {
        Atividade3a.persistir("test","");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nomeInvalido3b() throws FileNotFoundException, XMLStreamException {
        Atividade3b.recuperarDados("");
    }

}
