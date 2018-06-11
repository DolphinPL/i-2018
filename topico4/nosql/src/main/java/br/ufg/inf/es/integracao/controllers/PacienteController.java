/*
 * Copyright (c) 2018.
 * Antonio Arlis Santos da Silva
 * Creative Commons Attribution 4.0 International License.
 */

package br.ufg.inf.es.integracao.controllers;

import br.ufg.inf.es.integracao.documents.Individuo;
import br.ufg.inf.es.integracao.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("mongodb://ia2018:ia2018@ds153380.mlab.com:53380/ia20181")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Individuo>> listarTodos() {
        return ResponseEntity.ok(this.pacienteService.listarTodos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Individuo> listarPorId(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(this.pacienteService.listarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Individuo> cadastrar(@RequestBody Individuo paciente) {
        return ResponseEntity.ok(this.pacienteService.cadastrar(paciente));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Individuo> atualizar(@PathVariable(name = "id") String id, Individuo paciente) {
        paciente.setId(id);
        return ResponseEntity.ok(this.pacienteService.atualizar(paciente));
    }

    @DeleteMapping(path = "/{id}")
    public void remover(@PathVariable(name = "id") String id) {
        this.pacienteService.remover(id);
    }

}
