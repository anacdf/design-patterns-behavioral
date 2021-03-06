package strategy2;

import java.util.Arrays;

public class Insertion implements IAlgoritmos {
    int b = 1;
    public double[] run(double[] a, int b) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    exch(a, j, j - 1);
                    return a;
                } else break;
            }
            return a;
        }return a;
    }

    // exchange a[i] and a[j]
    private void exch(double[] a, int i, int j) {
        double swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
