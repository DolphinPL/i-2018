/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade4;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Classe que persiste texto em formato UTF-8.
 */
public class Atividade4 {
	
	/**
	 * Método responsável pela interação do programa. 
	 * @param args[0] nome do arquivo, args[1] dados a serem persistidos.
	 */
	public static void main(String[] args) {
		try {
	 		persisteDados(args[0], args[1]);
	   	} catch (IOException e) {
	   		System.out.println(e);
	   	}
	}
	
	/**
	 * Método que persiste dados.
	 * @param diretory nome do arquivo.
	 * @param dados dados a serem persistidos.
	 * @throws IOException caso o nome do arquivo esteja em branco.
	 */
	public static void persisteDados(String diretory, String dados) throws IOException {

    	if (diretory.equals(null) || diretory.equals("") || diretory.equals(" ")) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
    	}
		
	if (dados.equals(null) || dados.equals("") || dados.equals(" ")) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
    	}
    	
    	PrintWriter pw = new PrintWriter(diretory, "UTF-8");
    	pw.write(dados);
    	pw.close();
    	
	}

}
