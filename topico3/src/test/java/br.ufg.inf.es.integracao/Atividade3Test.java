/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade3.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Atividade3Test {

    @Test(expected = IllegalArgumentException.class)
    public void nomeInvalido() throws FileNotFoundException, UnsupportedEncodingException {
        Atividade3a.persistir("test","");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nomeInvalido3b() throws IOException, XMLStreamException {
        Atividade3b.obterObjeto("");
    }

    @Test
    public void casoTrivial() throws IOException, XMLStreamException {
        Endereco endereco = new Endereco("75.000-000", "Rua 240", 00, "Qd: 12 Lt: 20");

        Assert.assertEquals("75.000-000", endereco.getCep());
        Assert.assertEquals("Rua 240", endereco.getLogradouro());
        Assert.assertEquals(00, endereco.getNumero());
        Assert.assertEquals("Qd: 12 Lt: 20", endereco.getComplemento());

        Estudante estudante = new Estudante("Antonio", 5565, endereco);

        Assert.assertEquals("Antonio", estudante.getNome());
        Assert.assertEquals(5565, estudante.getMatricula());
        Assert.assertEquals(endereco, estudante.getEndereco());

        Turma turma = new Turma();
        turma.setDisciplina("Integração de Aplicação");
        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
        estudantes.add(0, estudante);
        turma.setEstudantes(estudantes);

        Assert.assertEquals("Integração de Aplicação", turma.getDisciplina());
        Assert.assertEquals(estudante, turma.getEstudantes().get(0));
        Assert.assertEquals("Rua 240", turma.getEstudantes().get(0).getEndereco().getLogradouro());

        String xml = Atividade3a.serializar(turma);

        Atividade3a.persistir(xml, "test.xml");

        //Atividade3b.obterObjeto("test.xml");



        File file = new File( "test.xml");
        file.delete();
    }

}
