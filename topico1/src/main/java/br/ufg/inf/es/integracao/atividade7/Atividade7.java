/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe que converte arquivo de texto em binário.
 */
public class Atividade7 {

	/**
	 * Método responsável pela interação do programa.
	 */
	public static void main(String[] args) {
		try {
	 		convertsArqToBinary(args[0], args[1]);
	   	} catch (IOException e) {
	   		System.out.println(e);
	   	}
	}

	/**
	* Método que realiza a conversão de dados txt para binario de forma otimozada
	* adicionando um index na linha.
	* @param arqText nome do arquivo texto.
	* @param arqBinary nome do arquivo binário a ser criado e no qual será
	* depositada a sequência de bytes correspondente à entrada (arquivo texto),
	* após a conversão.
	* @throws IOException caso o nome do arquivo esteja em branco.
	*/
	public static void convertsArqToBinary(String arqText, String arqBinary) throws IOException {

		if (nomeValido(arqText) && nomeValido(arqBinary)) {
			Charset utf8 = Charset.forName("UTF-8");
			Path file = Paths.get(arqText);

			FileOutputStream tmpBinary = new FileOutputStream(arqBinary);
			DataOutputStream archive = new DataOutputStream(tmpBinary);
			int index = 0;

			for (String line : Files.readAllLines(file, utf8)) {
				byte[] lineByte = line.getBytes(utf8);
				archive.writeInt(index);
				archive.writeInt(line.length());
				archive.write(lineByte, 0, line.length());
				index++;
			}

			archive.close();
		} else {
			throw new IllegalArgumentException("Ops, nome de arquivo binário é invalido!");
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
