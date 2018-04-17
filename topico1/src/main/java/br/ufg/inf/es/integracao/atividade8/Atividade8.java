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
	 		viewToTxt(args[0], Integer.parseInt(args[1]));
	   	} catch (IOException e) {
	   		System.out.println(e);
	   	}
	}

	/**
	* Método que exibe uma linha especifica de um arquivo binário em forma de texto.
	* @param file nome do arquivo binário a ser exibido.
	* @throws IOException caso o nome do arquivo esteja em branco.
	*/
	public static void viewToTxt(String file, int lineExpecf) throws IOException {

		if (file.equals(null) || file.equals("") || file.equals(" ")) {
    			throw new IllegalArgumentException("Ops, nome de arquivo texto é invalido!");
    		}

		FileInputStream tmp = new FileInputStream(file);
		DataInputStream tmpfile = new DataInputStream(tmp);
		byte[] intByte = new byte[4];
		int Index;
		int lineByte;
		int amountSkip = 0;

		while ((Index = tmpfile.read(intByte)) != -1) {
			Index = ByteBuffer.wrap(intByte).getInt();

			if (Index == lineExpecf) {
				lineByte = tmpfile.read(intByte);
				lineByte = ByteBuffer.wrap(intByte).getInt();

				byte[] byteArray = new byte[lineByte];
				tmpfile.read(byteArray);

				String str = new String(byteArray, "UTF-8");
				System.out.println(str);
			} else {
				amountSkip = tmpfile.read(intByte);
				amountSkip = ByteBuffer.wrap(intByte).getInt();
				tmpfile.skipBytes(amountSkip);
			}

		}
	}
}
