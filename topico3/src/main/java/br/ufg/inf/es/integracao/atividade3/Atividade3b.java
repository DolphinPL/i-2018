/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade3;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Classe que dado um documento XML, armazenado em um arquivo, “recupera” a instância da classe Turma nele serializado.
 */
public class Atividade3b {

    /**
     * Metodo principal de execução do programa.
     * @param args nome do arquivo xml.
     */
    public static void main(String[] args) {

        XMLStreamReader arquivo = null;
        XmlMapper mapper = new XmlMapper();
        Turma turma;

        try {
            arquivo = recuperarDados(args[0]);
            arquivo.next();
            turma = obterObjeto(arquivo, mapper);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Método que criar um objeto apartir dos dados recuperados.
     */
    public static Turma obterObjeto(XMLStreamReader arquivo, XmlMapper mapper) throws XMLStreamException, IOException {
        arquivo.next();

        return mapper.readValue(arquivo, Turma.class);
    }

    /**
     * Método que recuperar os dados do arquivo.
     */
    public static XMLStreamReader recuperarDados(String directory) throws FileNotFoundException, XMLStreamException {
        if (nomeValido(directory)) {
            FileInputStream aux = new FileInputStream(directory);
            XMLInputFactory factory = XMLInputFactory.newFactory();
            return factory.createXMLStreamReader(aux);
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
        if (file.equals(null) || file.trim().isEmpty()) {
            return false;
        }

        return true;
    }

}

