
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Produto> mercadorias = new ArrayList<>();
        List<Servico> servicos = new ArrayList<>();
        List<Agenda> cronograma = new ArrayList<>();

        Animal animal1 = new Cachorro("Meggy", "Lulu da Pomerânia", "05/08/2022","Jake");
        Animal animal2 = new Gato("Liz", "Persa", "09/06/2020", "Fernanda");

        Produto vacinas = new Medicamentos("antirabica", 20.00,10);
        Produto pelucia = new Brinquedos("macaco com apito", 30.00,25);
        mercadorias.add(vacinas);
        mercadorias.add(pelucia);

        vacinas.vender(5);
        System.out.println("------------------");
        pelucia.vender (10);
        System.out.println("------------------");

        Servico banho = new Banho();
        Servico tosa = new Tosa();
        Servico ConsultaVeterinaria = new ConsultaVeterinaria();
        servicos.add(banho);
        servicos.add(tosa);

        List<Servico> servicosDisponiveis =  List.of(banho, tosa, ConsultaVeterinaria);

        Servico.ListarServicosDisponiveis(servicosDisponiveis);
        System.out.println("------------------------");

        List<Produto> mercadoriasDisponiveis =  List.of(vacinas, pelucia);

        Produto.ListarMercadoriasDisponiveis(mercadoriasDisponiveis);
        System.out.println("------------------");

        Agenda agenda1 = new Agenda(animal1, banho, "20/10/2023", "15:00");
        agenda1.agendar(cronograma);

        Agenda.ListarCronograma(cronograma);

    }
}