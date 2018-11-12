package observer2;

public class AppObserver2 {
    public static void main(String[] args) {
        Alarme alarme = new Alarme();
        Delegacia delegacia = new Delegacia(alarme);
        Seguro seguro = new Seguro(delegacia);

        alarme.add(delegacia);
        alarme.add(seguro);

        alarme.movimento();

        alarme.notificar();
    }
}
