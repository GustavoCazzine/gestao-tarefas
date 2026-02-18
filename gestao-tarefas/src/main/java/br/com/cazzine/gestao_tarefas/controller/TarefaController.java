package br.com.cazzine.gestao_tarefas.controller;

import br.com.cazzine.gestao_tarefas.model.Tarefa;
import br.com.cazzine.gestao_tarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; // <--- 1. Import que faltava

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service; // <--- 2. Sem o "new"! O Spring injeta sozinho.

    @GetMapping
    public List<Tarefa> listarTodas(){
        return service.listarTodas();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefaRecebida){
        return service.criarTarefa(tarefaRecebida.getDescricao());
    }

    //DeletarTarefa
    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Integer id){
        service.deletarPorId(id);
    }

    //AtualizarTarefa
    @PutMapping("/{id}")
    public void atualizarPorId(@PathVariable Integer id, @RequestBody Tarefa novaDescricao){
        service.atualizarTarefa(id, novaDescricao.getDescricao());
    }

    //AtualizarStatus
    @PutMapping("/{id}/concluir")
    public void atualizarStatusPorId(@PathVariable Integer id){
        service.concluirTarefa(id);
    }
}