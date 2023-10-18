import javax.sound.midi.Soundbank;
import java.util.List;

public class Agenda {

    private Animal animal;
    private Servico servico;
    private String data;
    private String horario;

    public Agenda(Animal animal, Servico servico, String data, String horario) {
        this.animal = animal;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
   public boolean verificarAgenda(List<Agenda>cronograma) {
        for (Agenda agenda:cronograma) {
           if (agenda.getData().equals(this.getData()) && agenda.getHorario().equals(this.getHorario())) {
               return false;
           } else {
               return true;
           }
       }
       return false;
   }
   public boolean agendar(List<Agenda>cronograma) {
        if (verificarAgenda(cronograma)) {
            System.out.println("Não foi possível realizar este agendamento, horário indisponível");
            return false;


        }
        else {
            cronograma.add(this);
            System.out.println("Agendando com sucesso");
            return true;

        }
   }
   public static void ListarCronograma(List<Agenda> cronograma) {
        for (Agenda agenda:cronograma) {
            System.out.println("Animal:" + agenda.getAnimal().getNome());
            System.out.println("Servico:" + agenda.getServico().descricao());
            System.out.println("Data:" + agenda.getData());
            System.out.println("Horario:" +agenda.getHorario());

        }
   }
}
