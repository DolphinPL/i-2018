/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividades;

import br.ufg.inf.es.integracao.documents.Endereco;
import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Classe principal do programa.
 */
public class Principal {

    public static void main(String[] args) {

        Conection conection = new Conection();


        persistir(conection.getBaseDados());
    }

    public static void persistir(MongoDatabase baseDados) {

        Endereco endereco = new Endereco();
        endereco.setBairro("test");
        endereco.setCaixaPostal("8888");
        endereco.setCep("9999999");
        endereco.setCodigoMunicipio(123);

        MongoCollection<Document> paciente = baseDados.getCollection("base-dados-paciente");

        MongoCursor<Document> cursor = paciente.find().iterator();

        Gson gson = new Gson();

        String json = gson.toJson(endereco);

            Document novoPaciente = new Document("paciente", json);
            paciente.insertOne(novoPaciente);
//
//        Document updDocument = new Document("name", "Antonio");
//        individuos.updateOne(updDocument, new Document("$set", new Document("idade", 20)));

//        try {
//            while (cursor.hasNext()){
//                Document doc = cursor.next();
//                System.out.println(doc.get("name"));
//            }
//        } catch (Exception e){
//            System.out.println(e);
//        }

    }
}
