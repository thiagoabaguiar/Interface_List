package classes;

public class Principal {

    public static void main(String[] args) {
        
        ListaTarefas minhaLista = new ListaTarefas();
        
        minhaLista.adicionarTarefa("Lavar Louça");
        minhaLista.adicionarTarefa("Arrumar quarto");
        minhaLista.adicionarTarefa("Limpar garagem");
        
        System.out.println(minhaLista);
        
        System.out.println(minhaLista.qtdTarefas());
        
        minhaLista.removerTarefa("Arrumar quarto");
        
        System.out.println(minhaLista);
        
        System.out.println(minhaLista.qtdTarefas());

    }

}
