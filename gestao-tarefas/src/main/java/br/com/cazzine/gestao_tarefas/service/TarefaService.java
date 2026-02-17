package br.com.cazzine.gestao_tarefas.service;

import br.com.cazzine.gestao_tarefas.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

//Indica que essa class é o 'gerente'
@Service
public class TarefaService {
    //Iniciando a lista onde será guardada as tarefas
    private List<Tarefa> tarefas = new ArrayList<>();
    //Metodos
    //Adicionar tarefa
    public Tarefa criarTarefa(String descricao){
        //Gera um novo id com base no tamanho da lista
        int novoId = tarefas.size() + 1;
        //Cria uma nova tarefa
        Tarefa novaTarefa = new Tarefa(novoId, descricao);
        //Adiciona na lista de tarefas
        tarefas.add(novaTarefa);
        //Retorna a nova tarefa
        return novaTarefa;
    }
    //Listar tarefas
    public List<Tarefa> listarTodas(){
        return tarefas;
    }
}