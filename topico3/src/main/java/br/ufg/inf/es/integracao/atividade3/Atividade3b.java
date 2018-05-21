/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade3;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;

/**
 * Classe que dado um documento XML, armazenado em um arquivo, “recupera” a instância da classe Turma nele serializado.
 */
public class Atividade3b {

    /**
     * Metodo principal de execução do programa.
     * @param args nome do arquivo xml.
     */
    public static void main(String[] args) {
        Turma turma = new Turma();
        try {
            turma = obterObjeto(args[0]);
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
    public static Turma obterObjeto(String directory) throws XMLStreamException, IOException {
        if (nomeValido(directory)) {
            File file = new File(directory);
            XmlMapper mapper = new XmlMapper();
            String xml = recuperarDados(new FileInputStream(file));
            Turma turma = mapper.readValue(xml, Turma.class);

            return turma;
        } else {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
        }
    }

    /**
     * Método que recuperar os dados do arquivo.
     */
    public static String recuperarDados(InputStream aux) throws IOException, XMLStreamException {
        StringBuilder arq = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(aux));
        while ((line = br.readLine()) != null) {
            arq.append(line);
        }
        br.close();
        return arq.toString();
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

