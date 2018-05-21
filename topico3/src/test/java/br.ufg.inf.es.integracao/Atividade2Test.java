/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade2.Atividade2;
import br.ufg.inf.es.integracao.atividade2.Sapataria;
import br.ufg.inf.es.integracao.atividade2.Sapatos;
import br.ufg.inf.es.integracao.atividade2.Tenis;
import org.junit.Assert;
import org.junit.Test;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

        Tenis tenis = new Tenis();
        tenis.setEsporte("corrida");
        tenis.setMarca("Nike");
        tenis.setPreco(348.78f);

        Assert.assertEquals("corrida", tenis.getEsporte());
        Assert.assertEquals("Nike", tenis.getMarca());
        Assert.assertEquals(348.78, tenis.getPreco(), 2f);

        Sapatos sapatos = new Sapatos();
        sapatos.setMarca("Adidas");
        sapatos.setPreco(270.98f);
        sapatos.setBlue(12);
        sapatos.setGreen(32);
        sapatos.setRed(23);

        Assert.assertEquals("Adidas", sapatos.getMarca());
        Assert.assertEquals(12, sapatos.getBlue());
        Assert.assertEquals(270.98, sapatos.getPreco(), 2f);

        Sapataria sapataria = new Sapataria();
        ArrayList<Tenis> tenisArrayList = new ArrayList<Tenis>();
        tenisArrayList.add(0, tenis);
        ArrayList<Sapatos> sapatosArrayList = new ArrayList<Sapatos>();
        sapatosArrayList.add(0,sapatos);

        sapataria.setSapatos(sapatosArrayList);
        sapataria.setTenis(tenisArrayList);

        Assert.assertEquals(tenis, sapataria.getTenis().get(0));
        Assert.assertEquals(sapatos, sapataria.getSapatos().get(0));
    }
}
