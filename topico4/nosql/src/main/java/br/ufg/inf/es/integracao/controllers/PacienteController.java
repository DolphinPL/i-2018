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

    /**
     * Método responsável por listar todos os pacientes cadastrado na base de dados.
     * @return http: cod 200 e list de pacientes.
     */
    @GetMapping
    public ResponseEntity<List<Individuo>> listarTodos() {
        return ResponseEntity.ok(this.pacienteService.listarTodos());
    }

    /**
     * Método que lista um paciente especifico quando encontrado.
     * @param id retirado da url passado.
     * @return http: cod 200 e os dados do paciente quando encontrado.
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<Individuo> listarPorId(@PathVariable(name = "id") String id) {
        return ResponseEntity.ok(this.pacienteService.listarPorId(id));
    }

    /**
     * Método que persiste os dados de um paciente.
     * @param paciente dados do paciente.
     * @return http: cod 200 e o paciente cadastrado.
     */
    @PostMapping
    public ResponseEntity<Individuo> cadastrar(@RequestBody Individuo paciente) {
        return ResponseEntity.ok(this.pacienteService.cadastrar(paciente));
    }

    /**
     * Metodo que realiza a atualização dos dados de um paciente.
     * @param id retirado da url passado.
     * @param paciente dados do paciente.
     */
    @PutMapping(path = "/{id}")
    public ResponseEntity<Individuo> atualizar(@PathVariable(name = "id") String id, Individuo paciente) {
        paciente.setId(id);
        return ResponseEntity.ok(this.pacienteService.atualizar(paciente));
    }

    /**
     * Método que remove um paciente.
     * @param id retirado da url passado.
     */
    @DeleteMapping(path = "/{id}")
    public void remover(@PathVariable(name = "id") String id) {
        this.pacienteService.remover(id);
    }

}
