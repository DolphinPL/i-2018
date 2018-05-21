/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao;

import br.ufg.inf.es.integracao.atividade4.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class Atividade4Test {

    @Test(expected = IllegalArgumentException.class)
    public void verificaStringBranco() throws IOException {
        Atividade4.deserializar("");
    }

    @Test
    public void casoTrivial() throws IOException {
        Comunicacao comunicacao = new Comunicacao();
        comunicacao.setDetalhes("Cliente chato");
        comunicacao.setMeio("E-mail");
        comunicacao.setPreferencia("E-mail");
        comunicacao.setUso("Pessoal");

        Nome nome = new Nome();
        nome.setNomes("Jose");
        nome.setPrefereido("Zé");
        nome.setSobrenomes("Sousa");
        nome.setTitulos("Cidadão");
        ArrayList<Nome> nomes = new ArrayList<Nome>();
        nomes.add(0, nome);

        Data dataInicio = new Data();
        Calendar calendar = new Calendar() {
            @Override
            protected void computeTime() {

            }

            @Override
            protected void computeFields() {

            }

            @Override
            public void add(int field, int amount) {

            }

            @Override
            public void roll(int field, boolean up) {

            }

            @Override
            public int getMinimum(int field) {
                return 0;
            }

            @Override
            public int getMaximum(int field) {
                return 0;
            }

            @Override
            public int getGreatestMinimum(int field) {
                return 0;
            }

            @Override
            public int getLeastMaximum(int field) {
                return 0;
            }
        };
        dataInicio.setData(calendar);
        Endereco endereco = new Endereco();
        endereco.setBairro("Leste Universitario");
        endereco.setDataInicio(dataInicio);

        ArrayList<Endereco> enderecoArrayList = new ArrayList<>();
        enderecoArrayList.add(0,endereco);

        Individuo individuo = new Individuo();

        ArrayList<Comunicacao> comunicacoes = new ArrayList<Comunicacao>();
        comunicacoes.add(0, comunicacao);
        individuo.setNomes(nomes);
        individuo.setComunicacoes(comunicacoes);
        individuo.setEnderecos(enderecoArrayList);

        Assert.assertEquals(comunicacao, individuo.getComunicacoes().get(0));
        Assert.assertEquals(nome, individuo.getNomes().get(0));
        Assert.assertEquals("Leste Universitario", individuo.getEnderecos().get(0).getBairro());

        String xml = Atividade4.serializar(individuo);

        Assert.assertEquals("Jose", Atividade4.deserializar(xml).getNomes().get(0).getNomes());
        Assert.assertEquals("Leste Universitario", Atividade4.deserializar(xml).getEnderecos().get(0).getBairro());
    }
}
