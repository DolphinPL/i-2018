package br.ufg.inf.es.integracao.atividade1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Classe que recebe como único argumento um nome de arquivo e exibe os 4 primeiros
 * bytes (inteiro de 32 bits) em formato hexadecimal na saída padrão.
 */
public class Atividade1 {

    /**
     * @param file entrada de uma String com o nome do arquivo.
     * @return os 4 primeiros bytes do arquivo.
     * @throws IOException caso o nome do arquivo esteja em branco.
     */
    public static int exibirHexa(String file) throws IOException {

	if (file.equals(null) || file.equals("") || file.equals(" ")) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
	}

	FileInputStream arq = new FileInputStream(file);
	DataInputStream arquivo = new DataInputStream(arq);

	return Integer.parseInt(Integer.toHexString(arquivo.readInt()));

    }

}
