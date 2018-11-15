package strategy2;

import java.util.Arrays;

public class Bubble implements IAlgoritmos{

    public double[] run(double[] a, int n)
    {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++)
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
        }
            return a;
    }

}
