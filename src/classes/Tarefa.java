package classes;

public class Tarefa {

    private String descricaoTarefa;

    public Tarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    @Override
    public String toString() {
        return descricaoTarefa;
    }

}
