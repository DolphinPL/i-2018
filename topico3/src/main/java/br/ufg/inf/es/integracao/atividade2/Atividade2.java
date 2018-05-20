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
import java.util.ArrayList;
import java.util.List;


/**
 * Carrega o conteúdo de um arquivo contendo um documento XML. Após carregar o documento XML, a aplicação deverá
 * disponibilizar uma lista de calçados, conforme o conteúdo do documento carregado.
 */
public class Atividade2 {

    public static void main(String[] args) {
        Sapataria sapataria = new Sapataria();
        XMLStreamReader arquivo = null;
        XmlMapper mapper = new XmlMapper();

        try {
            arquivo = recuperarDados(args[0]);
            sapataria = carregarObjetos(arquivo, mapper);
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
    public static Sapataria carregarObjetos(XMLStreamReader arquivo, XmlMapper mapper) throws
            XMLStreamException, IOException {
        Sapataria sapataria = new Sapataria();
        int aux = arquivo.next();
        ArrayList<Tenis> tenisAux = new ArrayList<Tenis>();
        ArrayList<Sapatos> sapatosAux = new ArrayList<Sapatos>();
        int iTenis = 0;
        int iSapatos = 0;
        while (aux != XMLStreamConstants.END_DOCUMENT) {
            if (aux == XMLStreamConstants.START_ELEMENT) {
                String calcados = arquivo.getLocalName();
                if (calcados.equals("tenis")) {
                    Tenis tenis = mapper.readValue(arquivo, Tenis.class);
                    tenisAux.add(iTenis, tenis);
                    iTenis++;
                } else {
                    Sapatos sapatos = mapper.readValue(arquivo, Sapatos.class);
                    sapatosAux.add(iSapatos, sapatos);
                    iSapatos++;
                }
            }
            aux = arquivo.next();
        }
        sapataria.setTenis(tenisAux);
        sapataria.setSapatos(sapatosAux);

        return sapataria;
    }

    /**
     * Método que recuperar os dados do arquivo.
     */
    public static XMLStreamReader recuperarDados(String directory) throws FileNotFoundException, XMLStreamException {
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
