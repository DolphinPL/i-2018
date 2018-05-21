/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

/**
 * Classe que, dada uma instância da classe Turma, gera o documento XML correspondente (serializa a instância)
 * e persiste  a sequência de caracteres (documento XML), em um arquivo (UTF-8).
 */
public class Atividade3a {

    /**
     * Metodo principal do programa.
     * @param turma objeto do tipo turma.
     * @param args nome do arquivo a ser salvo.
     */
    public static void main(Turma turma, String[] args) {

        String xml = null;
        try {
            xml = serializar(turma);
            persistir(xml, args[0]);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    /**
     * Método que serializar o objeto.
     */
    public static String serializar(Turma turma) throws JsonProcessingException {
        ObjectMapper objectMapper = new XmlMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(turma);
    }

    /**
     * Método que persiste o objeto.
     */
    public static void persistir(String xml, String diretory) throws FileNotFoundException, UnsupportedEncodingException {
        if (nomeValido(diretory)) {
            PrintWriter arquivo = new PrintWriter(diretory, "UTF-8");
            arquivo.write(xml);
            arquivo.close();
        } else {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
        }
    }

    /**
     * Método que verifica se o nome de um arquivo é valido.
     * @param file Nome do arquivo.
     * @return True nome valido.
     */
    private static boolean nomeValido(String file) {

        if (file.equals(null) || file.equals("") || file.equals(" ")) {
            return false;
        } else {
            return true;
        }
    }
}
