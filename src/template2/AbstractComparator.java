package template2;

public abstract class AbstractComparator {
    private double lista[];

    final void templateMethod(double lista[]){
        transformar(lista);

    }

    abstract void transformar(double lista[]);


}
