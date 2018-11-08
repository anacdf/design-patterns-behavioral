package chain1;

public class Produto {
    private String tipo;
    private double preco;

    public Produto(double preco, String tipo) {
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

}
