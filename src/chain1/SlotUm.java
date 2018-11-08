package chain1;

public class SlotUm extends MaquinaChain {
    private int quantidade;
    private double cents;
    private double saldo;
    private double troco;
    private Produto produto;

    public SlotUm(Produto produto) {
        super(produto);
    }

    public void acumulaMoedas(double cents, int quantidade){
        if(cents==1){
            saldo = cents*quantidade;
        } else saldo=0;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getTroco(){
        if(produto.getPreco()<saldo){
            return troco = saldo - produto.getPreco();
        }
        return troco=0.0;
    }

    public void dispensarProduto() {
        if(saldo==produto.getPreco()){
            System.out.println("Dear cliente, "+produto.getTipo() + " dispensado com sucesso!");
        }else if (saldo>produto.getPreco()){
            System.out.println("Dear cliente, "+produto.getTipo() + " dispensado com sucesso! e seu troco é " + getTroco() + " reais.");
        }
    }
}
