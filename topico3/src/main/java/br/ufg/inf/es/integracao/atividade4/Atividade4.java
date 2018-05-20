/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

/**
 * Classe que serializar uma instância de Individuo e outra para fazer a operação inversa, ou seja, a partir do
 * conteúdo de um documento XML, recebido como String produz a instância correspondente de Individuo.
 */
public class Atividade4 {

    /**
     * Metodo principal do programa.
     */
    public static void main(String[] args) {

        Individuo individuo = new Individuo();
        String xml = null;
        try {
            individuo = deserializar(args[0]);
            xml = serializar(individuo);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Método que serializar o objeto.
     */
    public static String serializar(Individuo individuo) throws JsonProcessingException {
        ObjectMapper objectMapper = new XmlMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(individuo);
    }

    /**
     * Método que deserializar uma string e retorna um objeto individuo.
     */
    public static Individuo deserializar(String xml) throws IOException {

        if (stringValido(xml)) {
            XmlMapper mapper = new XmlMapper();

            return mapper.readValue(xml, Individuo.class);
        } else {
            throw new IllegalArgumentException("Ops, xml em branco!");
        }
    }

    /**
     * Método que verifica se o nome de um arquivo é valido.
     * @param string Arquivo xml.
     * @return True Arquivo não estiver em branco.
     */
    private static boolean stringValido(String string) {
        if (string.equals(null) || string.trim().isEmpty()) {
            return false;
        }

        return true;
    }

}
