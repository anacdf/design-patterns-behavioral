package template1;

public abstract class AbstractTemplate {

    final void templateMethod(String palavra){
        maiusculo(palavra);
        minusculo(palavra);
        duplicar(palavra);
        inverter(palavra);
    }

    abstract void maiusculo(String palavra);

    abstract void minusculo(String palavra);

    abstract void duplicar(String palavra);

    abstract void inverter(String palavra);


}
