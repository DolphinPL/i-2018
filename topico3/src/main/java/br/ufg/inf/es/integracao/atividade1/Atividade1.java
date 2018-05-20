/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Classe que recupera um arquivo csv e gera um arquivo xml.
 */
public class Atividade1 {

    /**
     * Método de interação/execucção.
     * @param args padrão da classe.
     */
    public void main(String[] args) {
        String file = "arq.csv";

        Turma turma = new Turma();

        try {
            turma = recuperar(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file = "arq.xml";
        try {
            gerarXml(turma, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que recebe dados como objetos do java e gerar um arquivo xml à partir dos objetos de entrada.
     * @param turma Objeto em java.
     * @param file nome do arquivo a ser gerado no formato XML.
     * @throws JAXBException Lançamento da exeção para tratamento na classe principal.
     */
    public static void gerarXml(Turma turma, String file) throws JAXBException {

        JAXBContext contexto = JAXBContext.newInstance(Turma.class);
        Marshaller aux = contexto.createMarshaller();
        aux.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        aux.marshal(turma, new File(file));
    }

    /**
     * Método que recebe um arquivo em formato csv e transforma os seus dados em objeto.
     */
    public static Turma recuperar(String file) throws IOException {
        Aluno aluno = new Aluno();
        Turma turma = new Turma();
        Path arqAberto = null;
        char divisor = ';';
        arqAberto = Paths.get(file);
        Charset utf8 = Charset.forName("UTF-8");
        ArrayList<Aluno> alunoAux = new ArrayList<Aluno>();
        int i = 0;
        for (String line : Files.readAllLines(arqAberto, utf8)) {
            String[] aux = line.split(String.valueOf(divisor));
            aluno.setNome(aux[0]);
            aluno.setEmail(aux[1]);
            alunoAux.add(i, aluno);
            i++;
        }
        turma.setAlunos(alunoAux);
        return turma;
    }

}
