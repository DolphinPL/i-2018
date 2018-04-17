package br.ufg.inf.es.integracao.serializacao.atividade2;

import java.io.*;

/**
 * Classe que gera exerção ao tentar serializar um obleto.
 */
public class SerializaDeserializa {

    /**
     * Método responsável pela inicialização do programa.
     * @param args argumentos de entrada do metodo persistir.
     */
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byt = new ByteArrayOutputStream();
            Funcionario funcionario = new Funcionario("Jonelson", "1234");
            serializar(funcionario, byt);
            Funcionario funcionarios = deserializar(args[2]);
            System.out.println(funcionarios.getMatricula());
            System.out.println(funcionarios.getNome());
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que serializar um objeto.
     * @param objeto objeto a ser serializado.
     * @param outputStream Arrey de bytes.
     * @throws IOException caso o nome do arquivo seja invalido.
     */
    public static boolean serializar(Object objeto, ByteArrayOutputStream outputStream) throws IOException {

        ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(outputStream));
        objectOut.writeObject(objeto);
        objectOut.close();

        return true;


    }

    /**
     * Método que deserializar um objeto.
     * @param nomeArquivo nome do arquivo onde o objeto encontra-se salvo.
     * @return Objeto do tipo funcionario.
     * @throws IOException caso o nome do arquivo seja invalido.
     * @throws ClassNotFoundException caso apresente erro na leitura do objeto.
     */
    public static Funcionario deserializar(String nomeArquivo) throws IOException, ClassNotFoundException {

        if (nomeArquivo.equals(null) || nomeArquivo.trim().isEmpty()) {
            throw new IllegalArgumentException("Ops, nome de arquivo é invalido!");
        }

        FileInputStream inFile = new FileInputStream(nomeArquivo);
        ObjectInputStream d = new ObjectInputStream(inFile);
        Funcionario objeto = (Funcionario)d.readObject();

        d.close();
        return objeto;
    }

}
