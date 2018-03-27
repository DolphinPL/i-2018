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
	 		System.out.println(exibirArq(args[0]));
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
    public static String exibirArq (String file) throws IOException {

    	if (file.equals(null) || file.equals("") || file.equals(" ")) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
    	}

        Charset uft8 = Charset.forName("UFT-8");
        Path arquivo = Paths.get(file);
        StringBuilder arq = new StringBuilder();
        for (String linha : Files.readAllLines(arquivo, uft8)) {
            arq.append(linha)
                    .append("\n");
        }

        return arq.toString();
    }

}
