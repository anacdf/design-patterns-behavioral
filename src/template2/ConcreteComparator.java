package template2;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcreteComparator extends AbstractComparator {

    @Override
    void transformar(double[] lista) {
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
    }
}
