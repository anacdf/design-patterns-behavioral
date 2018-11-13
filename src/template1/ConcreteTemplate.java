package template1;

public class ConcreteTemplate extends AbstractTemplate{
    private String palavra;
    private String invertida;

    @Override
    void maiusculo(String palavra) {
        System.out.println(palavra.toUpperCase());
    }

    @Override
    void minusculo(String palavra) {
        System.out.println(palavra.toLowerCase());
    }

    @Override
    void duplicar(String palavra) {
        System.out.println(palavra + " " + palavra);
    }

    @Override
    void inverter(String palavra) {
        invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println(invertida);
    }
}
