/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.atividades;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

/**
 * Classe responsável por realizar a comunicação com a base de dados.
 */
public class Conection {

    private MongoDatabase baseDados;

    /**
     * Método que instacia a conexão.
     */
    public Conection() {
        if (this.baseDados == null) {
            MongoClientURI aux = new MongoClientURI("mongodb://ia2018:ia2018@ds153380.mlab.com:53380/ia20181");
            MongoClient client = new MongoClient(aux);
            this.baseDados = client.getDatabase(aux.getDatabase());
        } else {
            throw new IllegalArgumentException("Ops, a conexão já existe!");
        }
    }

    /**
     * Método que retorna uma conexão.
     */
    public MongoDatabase getBaseDados() {
        return baseDados;
    }
}
