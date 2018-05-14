/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade5;

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
public class Atividade5 {

	/**
	 * Método responsável pela interação do programa.
	 * @param args[0] nome do arquivo em texto, args[1] nome do arquivo binário.
	 */
	public static void main(String[] args) {
		try {
	 		convertsToBinary(args[0], args[1]);
	   	} catch (IOException e) {
	   		System.out.println(e);
	   	}
	}

	/**
	* Método que realiza a conversão de dados txt para binario atendendo os três
	*requisitos abaixo:
	*Primeiro. A conversão do arquivo texto em arquivo binário é tal que deve
	*ser possível recuperar a entrada a partir do arquivo binário correspondente
	*do qual foi gerado (sem perda ou acréscimo de dados).
	*Segundo. Para cada linha do arquivo de entrada será produzida uma sequência
	*de bytes correspondentes. Ou seja, o arquivo binário é uma concatenação de
	*sequências de bytes, uma para cada linha de texto.
	*Terceiro. A sequência de bytes correspondente a uma linha de texto é formada
	*pela concatenação de duas sequências de bytes. 
	* @param arqText nome do arquivo texto.
	* @param arqBinary nome do arquivo binário a ser criado e no qual será
	*depositada a sequência de bytes correspondente à entrada (arquivo texto),
	*após a conversão.
	* @throws IOException caso o nome do arquivo esteja em branco.
	*/
	public static void convertsToBinary(String arqText, String arqBinary) throws IOException {

		if (nomeValido(arqText) && nomeValido(arqBinary)) {
			Charset utf8 = Charset.forName("UTF-8");
			Path file = Paths.get(arqText);

			FileOutputStream tmpBinary = new FileOutputStream(arqBinary);
			DataOutputStream archive = new DataOutputStream(tmpBinary);

			for (String line : Files.readAllLines(file, utf8)) {
				byte[] lineByte = line.getBytes(utf8);
				archive.writeInt(line.length());
				archive.write(lineByte, 0, line.length());
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

