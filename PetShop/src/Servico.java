import java.util.List;

abstract class Servico {

    public static Object listarServicosDisponiveis;

    public static void listarServicosDisponiveis(List<Servico> servicosDisponiveis) {
    }

    public abstract String descricao();
    public abstract double preco();

    public static void ListarServicosDisponiveis(List<Servico> servicosDisponiveis) {
        System.out.println("Servicos Disponíveis");
        for (Servico servicos: servicosDisponiveis) {
            System.out.println("servicos: "+servicos.descricao());
            System.out.println("preco: "+servicos.preco());
        }
    }
}


