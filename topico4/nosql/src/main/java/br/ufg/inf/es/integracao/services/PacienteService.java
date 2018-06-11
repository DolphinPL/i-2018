/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.services;

import br.ufg.inf.es.integracao.documents.Individuo;
import java.util.List;

public interface PacienteService {

    List<Individuo> listarTodos();

    Individuo listarPorId(String id);

    Individuo cadastrar(Individuo paciente);

    Individuo atualizar(Individuo paciente);

    void remover(String id);

}
