package template2;

import template1.ConcreteTemplate;

public class AppTemplate {
    public static void main(String[] args) {
        double gerador=1.0;
        double vetor[] = new double[5];
        vetor[0]=1.5;
        vetor[1]=5.2;
        vetor[2]=4.3;
        vetor[3]=7.5;
        vetor[4]=2.6;

        ConcreteComparator comparator = new ConcreteComparator();
        comparator.transformar(vetor);

    }
}
