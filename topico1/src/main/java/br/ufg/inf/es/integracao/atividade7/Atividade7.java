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
	* Método que realiza a conversão de dados txt para binario de forma otimozada
	* adicionando um index na linha.
	* @param arqText nome do arquivo texto.
	* @param arqBinary nome do arquivo binário a ser criado e no qual será
	* depositada a sequência de bytes correspondente à entrada (arquivo texto),
	* após a conversão.
	* @throws IOException caso o nome do arquivo esteja em branco.
	*/
	public static void convertsToBinary(String arqText, String arqBinary) throws IOException {

		if (arqText.equals(null) || arqText.equals("") || arqText.equals(" ")) {
    			throw new IllegalArgumentException("Ops, nome de arquivo texto é invalido!");
    		}

		if (arqBinary.equals(null) || arqBinary.equals("") || arqBinary.equals(" ")) {
    			throw new IllegalArgumentException("Ops, nome de arquivo binário é invalido!");
    		}

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
                        index ++;
    		}

    		archive.close();
	}

}
