package observer2;

public class Delegacia implements IObserver {
    private Alarme alarme;

    public Delegacia(Alarme alarme) {
        this.alarme = alarme;
    }

    @Override
    public void update() {
        System.out.println("Delegacia:");
        System.out.println(this.alarme.getMessage());
    }

    public void updateSeguradora() {
        System.out.println("Atencao Seguradora:");
        System.out.println(this.alarme.getMessage());
    }

}
