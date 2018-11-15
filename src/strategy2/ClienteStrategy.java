package strategy2;

public class ClienteStrategy {
    public static void main(String[] args) {

        Bubble bubble = new Bubble();
        Insertion insertion = new Insertion();
        Merge merge = new Merge();
        Quick quick = new Quick();

        Estrategia estrategia = new Estrategia(bubble);
        Estrategia estrategia1 = new Estrategia(insertion);
        Estrategia estrategia2 = new Estrategia(merge);
        Estrategia estrategia3 = new Estrategia(quick);

        double vetor[] = new double[5];
        vetor[0]=1.5;
        vetor[1]=5.2;
        vetor[2]=4.3;
        vetor[3]=7.5;
        vetor[4]=2.6;
        estrategia.execute(vetor, 5);

        double vetor1[] = new double[5];
        vetor[0]=1.5;
        vetor[1]=5.2;
        vetor[2]=4.3;
        vetor[3]=7.5;
        vetor[4]=2.6;
        estrategia1.execute(vetor, 1);

        double vetor2[] = new double[5];
        vetor[0]=1.5;
        vetor[1]=5.2;
        vetor[2]=4.3;
        vetor[3]=7.5;
        vetor[4]=2.6;
        estrategia2.execute(vetor, 1);

        double vetor3[] = new double[5];
        vetor[0]=1.5;
        vetor[1]=5.2;
        vetor[2]=4.3;
        vetor[3]=7.5;
        vetor[4]=2.6;
        estrategia3.execute(vetor, 1);

    }
}
