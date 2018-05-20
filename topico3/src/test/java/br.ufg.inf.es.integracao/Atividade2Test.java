/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade2.Atividade2;
import org.junit.Test;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Atividade2Test {

    @Test(expected = IllegalArgumentException.class)
    public void nomeInvalido() throws Exception{
        Atividade2.recuperarDados("");
    }

    @Test
    public void casoTrivial() throws IOException, XMLStreamException {
        FileWriter arq = new FileWriter("test.xml");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("<calcados><tenis><marca>Nike</marca><preco>23.30</preco><esporte>Corrida</esporte>" +
                "</tenis></calcados>");
        arq.close();

        XMLStreamReader arquivo = Atividade2.recuperarDados("test.xml");

        File file = new File( "test.xml" );
        file.delete();
    }
}
