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
	 		//convertsToBinary(args[0], args[1]);
			convertsToBinary("/home/aluno/teste.txt", "/home/aluno/binary.dat");
	   	} catch (IOException e) {
	   		System.out.println(e);
	   	}
	}
	
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
        
        for (String line : Files.readAllLines(file, utf8)) {
        	archive.writeInt(Integer.parseInt(Integer.toBinaryString(line.length())));
        }
        
        archive.close();

        
		
	}

}
