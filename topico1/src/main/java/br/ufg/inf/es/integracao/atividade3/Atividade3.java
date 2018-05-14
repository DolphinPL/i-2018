/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *Classe que exibe o conteúdo de arquivo texto, formato UTF-8, na saída padrão.
 */
public class Atividade3 {
	
    /**
     *  Método responsável pela entrada e exibição dos dados do programa.
     * @param args nome do arquivo a ser lido.
     */
    public static void  main(String[] args) {
	    	
	try {
 		System.out.println(recuperarArq(args[0]));
   	} catch (IOException e) {
   		System.out.println(e);
   	}
	
    }

    /**
     * Método que faz a leitura de um arquivo.
     * @param file nome do arquivo.
     * @return conteúdo do arquivo.
     * @throws IOException nome do arquivo em branco.
     */
    public static String recuperarArq (String file) throws IOException {

    	if (nomeValido(file)) {
            Charset utf8 = Charset.forName("UTF-8");
            Path arquivo = Paths.get(file);
            StringBuilder arq = new StringBuilder();
            for (String linha : Files.readAllLines(arquivo, utf8)) {
                arq.append(linha)
                        .append("\n");
            }

            return arq.toString();
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
