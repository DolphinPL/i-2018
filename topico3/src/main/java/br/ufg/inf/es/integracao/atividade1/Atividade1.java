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

        ArrayList<Aluno> alunos = null;
        Aluno aluno = new Aluno();
        Turma turma = new Turma();

        try {
            alunos = recuperar(file, alunos, aluno);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file = "arq.xml";
        turma.setAlunos(alunos);

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
    private void gerarXml(Turma turma, String file) throws JAXBException {

        JAXBContext contexto = JAXBContext.newInstance(Turma.class);
        Marshaller aux = contexto.createMarshaller();
        aux.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        aux.marshal(turma, new File(file));
    }

    /**
     * Método que recebe um arquivo em formato csv e transforma os seus dados em objeto.
     * @param file Nome do arquivo em formato csv.
     * @param alunos ArrayList de alunos.
     * @param aluno Objeto do tipo aluno.
     * @return ArrayList de alunos.
     * @throws IOException Lançamento da exeção para tratamento na classe principal.
     */
    private ArrayList<Aluno> recuperar(String file, ArrayList<Aluno> alunos, Aluno aluno) throws IOException {
        Path arqAberto = null;
        char divisor = ';';
        arqAberto = Paths.get(file);
        Charset utf8 = Charset.forName("UTF-8");
        for (String line : Files.readAllLines(arqAberto, utf8)) {
            String[] aux = line.split(String.valueOf(divisor));
            aluno.setNome(aux[line.length()-2]);
            aluno.setEmail(aux[line.length()-1]);
            alunos.add(aluno);
        }
        return alunos;
    }

}
