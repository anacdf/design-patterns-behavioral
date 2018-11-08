package chain1;

public abstract class MaquinaChain {
    protected MaquinaChain prox;
    protected Slots moeda;
    private double cents;
    private int quantidade;
    private double saldo;
    private double preco;
    private double troco;
    private Produto produto;

    public MaquinaChain(Produto produto) {
        prox = null;
        this.produto = produto;
    }

    public void acumulaMoedas(double cents, int quantidade){

    }

    public double getSaldo(){
        return saldo;
    }

    public double getTroco(){
        if(preco<saldo){
            return troco = saldo - preco;
        }
        return troco =0.0;
    }

        public void dispensarProduto() {
       
    }

//    public void setNext(MaquinaChain forma) {
//        if (prox == null) {
//            prox = forma;
//        } else {
//            prox.setNext(forma);
//        }
//    }
//
//    public void dispensarProduto(Slots id) throws Exception {
//        if (podeDispensarProduto(id)) {
//            efetuaPagamento();
//        } else {
//            if (prox == null) {
//                throw new Exception("banco não cadastrado");
//            }
//            prox.dispensarProduto(id);
//        }
//    }
//
//    private boolean podeDispensarProduto(Slots id) {
//        if (moeda == id) {
//            return true;
//        }
//        return false;
//    }
//
//    protected abstract void efetuaPagamento();

}
