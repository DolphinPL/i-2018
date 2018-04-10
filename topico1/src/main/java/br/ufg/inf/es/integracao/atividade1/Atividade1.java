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
     * Método responsável pela entrada e exibição dos dados do programa.
     *
     * @param args nome do arquivo a ser lido.
     */
    public static void main(String[] args) {

        try {
            System.out.println(exibirHexa(args[0]));
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    /*
        Não alterei o comentário abaixo para você perceber as observações:
        (a) o método não exibe e, portanto, "exibirHexa" não é um bom nome.
        (b) exibirHexa não lembra que o nome do arquivo é verificado, aberto, bytes recuperados, ....
            (não é melhor dividir as várias atividades do método em métodos específicos?
        (c) Métodos derivados: verificaNome(file); obtemInteiro(file); exibeInteiroHexa(int)?
     */


    /**
     * Método recebe o nome de um arquivo e retorna os 4 primeiros bytes do arquivo.
     *
     * @param file entrada de uma String com o nome do arquivo.
     * @return os 4 primeiros bytes do arquivo.
     * @throws IOException caso o nome do arquivo esteja em branco.
     */
    public static int exibirHexa(String file) throws IOException {

        // Refatorando por partes...
        // 1. file.equals(null) => file == null
        // 2. file.equals("") => file.isEmpty()
        // 3. file.trim().isEmpty()
        // 4. Do que foi colocado acima basta....
        if (file == null || file.trim().isEmpty()) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
        }

        // Vários erros podem ocorrer aqui, por exemplo, o arquivo com menos de 4 bytes.
        // Não há permissão de leitura no arquivo.
        // O arquivo não existe, ....
        FileInputStream arq = new FileInputStream(file);
        DataInputStream arquivo = new DataInputStream(arq);
        int aux = arquivo.readInt();
        arquivo.close();

        return Integer.parseInt(Integer.toHexString(aux));

    }

}
