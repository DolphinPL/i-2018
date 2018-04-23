
package br.ufg.inf.es.integracao.serializacao.atividade2;

import br.ufg.inf.es.integracao.serializacao.atividade2.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class SerializaDeserializaTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void nomeInvalidoTwoGeraExcecao() throws Exception {
        SerializaDeserializa.deserializar("");
    }

    @Test
    public void testCasoTrivial() throws IOException, ClassNotFoundException {
        Funcionario funcionario = new Funcionario("Jonelson", "1234");
        //Assert.assertEquals(true, SerializaDeserializa.serializar(funcionario, new FileOutputStream("test.txt")));
        //Assert.assertEquals(funcionario, SerializaDeserializa.deserializar("test.txt"));
    }
}
