/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividade2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Classe que verificar se um arquivo é JPEG.
 */
public class Atividade2 {

    /**
     * Método responsável pela entrada e exibição dos dados do programa.
     * @param args nome do arquivo a ser lido.
     */
    public static void  main(String[] args) {
    	
    	try {
    		if (verificaArquivo(args[0])) {
    			System.out.println("Arquivo é JPEG");
    		} else {
    			System.out.println("Não é arquivo JPEG");
    		}
    	} catch (IOException e) {
    		System.out.println(e);
    	}

    }

    /**
     * Método que recebe o nome de um arquivo e verifica se o mesmo é JPEG.
     * @param file no do arquivo.
     * @return True se o arquivo é JPEG ou False caso contrario.
     * @throws IOException caso o nome do arquivo esteja em branco.
     */
    public static boolean verificaArquivo(String file) throws IOException {

        if (nomeValido(file)) {

            byte[] byteArray = new byte[4];

            RandomAccessFile arquivo = new RandomAccessFile(file, "r");
            arquivo.seek(0);
            arquivo.read(byteArray, 0, 2);
            arquivo.seek(arquivo.length() - 2);
            arquivo.read(byteArray, 2, 2);
            arquivo.close();
            String inicio = Integer.toHexString(byteArray[0] & 0xFF) + Integer.toHexString(byteArray[1] & 0xFF);
            String fim = Integer.toHexString(byteArray[2] & 0xFF) + Integer.toHexString(byteArray[3] & 0xFF);


            if (inicio.equals("ffd8") && fim.equals("ffd9")) {
                return true;
            } else {
                return false;
            }
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
