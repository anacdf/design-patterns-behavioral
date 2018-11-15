package strategy2;

import java.util.Arrays;

public class Estrategia {
    private IAlgoritmos algoritmos;

    public Estrategia(IAlgoritmos algoritmos){
        this.algoritmos=algoritmos;
    }

    public void execute(double[]lista, int num){
        algoritmos.run(lista, num);
        System.out.println(Arrays.toString(lista));
        }

}
