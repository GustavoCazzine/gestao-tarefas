import javax.management.StringValueExp;
import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    //Atributos
    private int id;
    private String descricao;
    private boolean concluida;
    private List<Tarefa> tarefas = new ArrayList<>();

    //Construtor CHEIO
    public Tarefa(int id, String descricao, boolean concluida) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = concluida;
    }
    //Construtor VAZIO
    public Tarefa(){}

    //Metodos especiais
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    // ----------------------------------------------- //
    //Metodos
    public void criarTarefa(String descricao){
        tarefas.add(new Tarefa(this.getId() + 1, descricao, false));
    }
}