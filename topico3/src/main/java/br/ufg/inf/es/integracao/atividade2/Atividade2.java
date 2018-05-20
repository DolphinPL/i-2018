/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


/**
 * Created by aluno on 14/05/18.
 */
public class Atividade2 {

    public static void main(String[] args) {
        Sapataria sapataria = new Sapataria();
        XMLStreamReader arquivo = null;
        XmlMapper mapper = new XmlMapper();

        try {
            arquivo = recuperarDados(args[0]);
            crarregarObjetos(arquivo, mapper, sapataria);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que carregar os objetos para disponibiliza-los.
     */
    private static void crarregarObjetos(XMLStreamReader arquivo, XmlMapper mapper, Sapataria sapataria) throws
            XMLStreamException, IOException {
        int aux = arquivo.next();
        while (aux != XMLStreamConstants.END_DOCUMENT) {
            if (aux == XMLStreamConstants.START_ELEMENT) {
                String calcados = arquivo.getLocalName();
                if (calcados.equals("tenis")) {
                    Tenis tenis = mapper.readValue(arquivo, Tenis.class);
                    sapataria.setTenis(tenis);
                } else {
                    Sapatos sapatos = mapper.readValue(arquivo, Sapatos.class);
                    sapataria.setSapatos(sapatos);
                }
            }
        }
    }

    /**
     * Método que recuperar os dados do arquivo.
     */
    private static XMLStreamReader recuperarDados(String directory) throws FileNotFoundException, XMLStreamException {
        if (nomeValido(directory)) {
            FileInputStream aux = new FileInputStream(directory);
            XMLInputFactory factory = XMLInputFactory.newFactory();
            XMLStreamReader arquivo = factory.createXMLStreamReader(aux);
            return arquivo;
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
