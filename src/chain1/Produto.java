package chain1;

public class Produto {
    private String produto;
    private double moeda1;
    private double moeda2;
    private double moeda3;

    public Produto(double moeda1, double moeda2, double moeda3, String produto) {
        this.moeda1 = moeda1;
        this.moeda2 = moeda2;
        this.moeda2 = moeda2;
        this.produto = produto;
    }

    public String getProduto(){
        return produto;
    }

    public double getMoeda1() {
        return moeda1;
    }

    public double getMoeda2() {
        return moeda2;
    }

    public double getMoeda3() {
        return moeda3;
    }
}
