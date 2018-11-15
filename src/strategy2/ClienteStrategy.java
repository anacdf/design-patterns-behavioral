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
        vetor1[0]=1.5;
        vetor1[1]=5.2;
        vetor1[2]=4.3;
        vetor1[3]=7.5;
        vetor1[4]=2.6;
        estrategia1.execute(vetor1, 5);

        double vetor2[] = new double[5];
        vetor2[0]=1.5;
        vetor2[1]=5.2;
        vetor2[2]=4.3;
        vetor2[3]=7.5;
        vetor2[4]=2.6;
        estrategia2.execute(vetor2, 5);

        double vetor3[] = new double[5];
        vetor3[0]=1.5;
        vetor3[1]=5.2;
        vetor3[2]=4.3;
        vetor3[3]=7.5;
        vetor3[4]=2.6;
        estrategia3.execute(vetor3, 5);

    }
}
