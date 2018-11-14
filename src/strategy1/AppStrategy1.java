package strategy1;

public class AppStrategy1 {
    public static void main(String[] args) {

        Segunda segunda = new Segunda();
        Calendario calendario = new Calendario(segunda);

        calendario.execute();
        Calendario c1 = new Calendario(new Terca());
        c1.execute();
    }
}
