package strategy2;

public class ClienteStrategy {
    public static void main(String[] args) {

        Bubble bubble = new Bubble();
        Estrategia estrategia = new Estrategia(bubble);

        double vetor[] = new double[5];
        vetor[0]=1.5;
        vetor[1]=5.2;
        vetor[2]=4.3;
        vetor[3]=7.5;
        vetor[4]=2.6;

        estrategia.execute(vetor, 5);
    }
}
