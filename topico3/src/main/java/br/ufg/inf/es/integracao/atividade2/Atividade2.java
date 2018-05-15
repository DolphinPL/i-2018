/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by aluno on 14/05/18.
 */
public class Atividade2 {

    public static void main(String[] args) {
        Sapataria sapataria = new Sapataria();
        ArrayList<Sapatos> sapatos;
        ArrayList<Tenis> tenis;

        Path arqAberto = abrirArquivo(args[0]);
    }

    /**
     * Método responsável por abrir um arquivo.
     * @param file nome do arquivo.
     * @return True se o nome for valido, false se o nome for invalido.
     */
    private static Path abrirArquivo(String file) {
        if(nomeValido(file)) {
            return Paths.get(file);
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
