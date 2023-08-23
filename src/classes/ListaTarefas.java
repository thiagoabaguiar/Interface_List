package classes;

import java.util.ArrayList;

public class ListaTarefas {

    private ArrayList<Tarefa> listaTarefas = new ArrayList<Tarefa>();

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        listaTarefas.add(novaTarefa);
    }

    public void removerTarefa(String descricao) {

        if (!listaTarefas.isEmpty()) {
            ArrayList<Tarefa> tarefaARemover = new ArrayList<Tarefa>();
            for (Tarefa t : listaTarefas) {
                if (t.getDescricaoTarefa().equalsIgnoreCase(descricao)) {
                    tarefaARemover.add(t);
                }
            }
            listaTarefas.removeAll(tarefaARemover);
        }
        
    }

    public int qtdTarefas() {
        return listaTarefas.size();
    }

    @Override
    public String toString() {
        return "### Lista de Tarefas ### \n" + listaTarefas;
    }

}
