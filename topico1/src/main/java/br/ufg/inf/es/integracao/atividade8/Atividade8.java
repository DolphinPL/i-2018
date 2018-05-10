/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.io.IOException;

/**
 * Classe que exibe um arquivo binário.
 */
public class Atividade8 {

	/**
	 * Método responsável pela interação do programa.
	 * @param args nome do arquivo binário e args[1] número da linha a ser exibida.
	 */
	public static void main(String[] args) {
		try {
            System.out.println(search(args[0], Integer.parseInt(args[1])));
	   	} catch (IOException e) {
	   		System.out.println(e);
	   	}
	}

	/**
	* Método que exibe uma linha especifica de um arquivo binário em forma de texto.
	* @param file nome do arquivo binário a ser exibido.
	* @throws IOException caso o nome do arquivo esteja em branco.
	*/
	public static String search(String file, int lineExpecf) throws IOException {

		if (nomeValido(file)) {
			FileInputStream tmp = new FileInputStream(file);
			DataInputStream tmpfile = new DataInputStream(tmp);
			byte[] intByte = new byte[4];
			int Index;
			int lineByte;
			int amountSkip = 0;

			while (tmpfile.read(intByte) != -1) {
				Index = ByteBuffer.wrap(intByte).getInt();

				if (Index == lineExpecf) {
					lineByte = ByteBuffer.wrap(intByte).getInt();

					byte[] byteArray = new byte[lineByte];
					tmpfile.read(byteArray);

					String str = new String(byteArray, "UTF-8");
					return str;
				}
				amountSkip = ByteBuffer.wrap(intByte).getInt();
				tmpfile.skipBytes(amountSkip);
			}
		} else {
			throw new IllegalArgumentException("Ops, nome de arquivo texto é invalido!");
		}
		return "Não há a linha desejada";
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
