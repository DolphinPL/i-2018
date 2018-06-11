/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.repositories;

import br.ufg.inf.es.integracao.documents.Individuo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * interface que extends a classe MongoRepository (org.springframework.data.mongodb.repository.MongoRepository)
 * que permite o uso dos seus recursos.
 */
public interface PacienteRepository extends MongoRepository<Individuo, String> {

}