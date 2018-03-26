package br.ufg.inf.es.integracao.atividade2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Classe que verificar se um arquivo é JPEG.
 */
public class Atividade2 {

    /**
     * Método responsável pela entrada e exibição dos dados do programa.
     */
    public static void  main(String[] args) {

    	if (verificaArquivo(args[0])) {
		    System.out.println("Arquivo é JPEG");
    	} else {
		    System.out.println("Não é arquivo JPEG");
	    }

    }

    /**
     * Método que recebe o nome de um arquivo e verifica se o mesmo é JPEG.
     * @param file no do arquivo.
     * @return True se o arquivo é JPEG ou False caso contrario.
     * @throws IOException caso o nome do arquivo esteja em branco.
     */
    public static boolean verificaArquivo(String file) throws IOException {

        if (file.equals(null) || file.equals("") || file.equals(" ")) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
        }

        FileInputStream arq = new FileInputStream(file);
	    DataInputStream arquivo = new DataInputStream(arq);

	    byte[] bytes = new byte[arquivo.available()];
	    arquivo.read(bytes);

	    if (Integer.toHexString(bytes[0]).equals("ff") & Integer.toHexString(bytes[1]).equals("d8")
                && Integer.toHexString(bytes[arquivo.available()] - 1).equals("ff") &
                        Integer.toHexString(bytes[arquivo.available()]).equals("d9")) {
	        return true;
        } else {
	        return false;
        }

    }

}
