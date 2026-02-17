package br.com.cazzine.gestao_tarefas.model;

public class Tarefa {
    // Atributos (Só os dados)
    private int id;
    private String descricao;
    private boolean concluida;

    // Construtores
    public Tarefa() {} // Obrigatório pro Spring

    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public boolean isConcluida() { return concluida; } // O Jackson ama o "is" para booleano
    public void setConcluida(boolean concluida) { this.concluida = concluida; }
}