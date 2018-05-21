/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

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
	 		System.out.println(returnToTxt(args[0]));
	   	} catch (IOException e) {
	   		System.out.println(e);
	   	}
	}

	/**
	* Método que exibe um arquivo binário em forma de texto.
	* @param file nome do arquivo binário a ser exibido.
	* @throws IOException caso o nome do arquivo esteja em branco.
	*/
	public static String returnToTxt(String file) throws IOException {

		if (nomeValido(file)) {
			FileInputStream tmp = new FileInputStream(file);
			DataInputStream tmpfile = new DataInputStream(tmp);
			byte[] Byte = new byte[4];
			int aux;
            String retorno = null;

			while ((aux = tmpfile.read(Byte)) != -1){
                aux = ByteBuffer.wrap(Byte).getInt();
                byte[] arrayB = new byte[aux];
                tmpfile.read(arrayB);
                String temp = new String(arrayB, "UTF-8");
                retorno = retorno + temp;
			}
			return retorno;
		} else {
			throw new IllegalArgumentException("Ops, nome de arquivo texto é invalido!");
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
