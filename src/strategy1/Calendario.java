package strategy1;

public class Calendario {
    private IDiaDaSemana diaDaSemana;

    public Calendario(IDiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public void execute(){
        System.out.print("Dia da semana: ");
        this.diaDaSemana.run();
    }
}
