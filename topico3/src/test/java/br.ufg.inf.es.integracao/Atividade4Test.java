/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade4.Atividade4;
import org.junit.Test;

import java.io.IOException;

public class Atividade4Test {

    @Test(expected = IllegalArgumentException.class)
    public void verificaStringBranco() throws IOException {
        Atividade4.deserializar("");
    }
}
