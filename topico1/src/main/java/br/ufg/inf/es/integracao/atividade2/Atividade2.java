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

        if (file.equals(null) || file.equals("") || file.equals(" ")) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
        }
        
        byte[] magicoInicio = new byte[4];
        byte[] magicoFim = new byte[4];
        RandomAccessFile arquivo = new RandomAccessFile(file, "rw");
        arquivo.seek(0L);
        arquivo.readFully(magicoInicio);
        arquivo.seek(file.length() - 4);
        arquivo.readFully(magicoFim);
        arquivo.close();
        
        if (magicoInicio.equals("ffd8") && magicoFim.equals("ffd9")) {
        	return true;
        } else {
	        return false;
        }
    }

}
