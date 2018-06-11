/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */


package br.ufg.inf.es.integracao.services.implementation;

import br.ufg.inf.es.integracao.documents.Individuo;
import br.ufg.inf.es.integracao.repositories.PacienteRepository;
import br.ufg.inf.es.integracao.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImplementation implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRespository;

    @Override
    public List<Individuo> listarTodos() {
        return this.pacienteRespository.findAll();
    }

    @Override
    public Individuo listarPorId(String id) {
        return null; //this.pacienteRespository.findOne(id);
    }

    @Override
    public Individuo cadastrar(Individuo paciente) {
        return this.pacienteRespository.save(paciente);
    }

    @Override
    public Individuo atualizar(Individuo paciente) {
        return this.pacienteRespository.save(paciente);
    }

    @Override
    public void remover(String id) {
        this.pacienteRespository.deleteById(id);
    }
}
