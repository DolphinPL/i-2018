/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Classe que exibe um arquivo binário.
 */
public class Atividade6 {

	/**
	 * Método responsável pela interação do programa.
	 * @param args[0] nome do arquivo binário.
	 */
	public static void main(String[] args) {
		try {
	 		viewToTxt(args[0]);
	   	} catch (IOException e) {
	   		System.out.println(e);
	   	}
	}

	/**
	* Método que exibe um arquivo binário em forma de testo.
	* @param file nome do arquivo binário a ser exibido.
	* @throws IOException caso o nome do arquivo esteja em branco.
	*/
	public static void viewToTxt(String file) throws IOException {

		if (file.equals(null) || file.equals("") || file.equals(" ")) {
    			throw new IllegalArgumentException("Ops, nome de arquivo texto é invalido!");
    		}

		FileInputStream tmp = new FileInputStream(file);
		DataInputStream tmpfile = new DataInputStream(tmp);
		int aux;

		while((aux = tmpfile.read()) != -1){
        	    System.out.print((char)aux);
        	}
	}
}
