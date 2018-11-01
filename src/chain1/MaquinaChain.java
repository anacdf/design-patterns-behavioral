package chain1;

public abstract class MaquinaChain {
    protected MaquinaChain prox;
    protected Produtos produto;

    public MaquinaChain(Produtos id) {
        prox = null;
        produto = id;
    }

    public void setNext(MaquinaChain forma) {
        if (prox == null) {
            prox = forma;
        } else {
            prox.setNext(forma);
        }
    }

    public void dispensarProduto(Produtos id) throws Exception {
        if (podeDispensarProduto(id)) {
            efetuaPagamento();
        } else {
            if (prox == null) {
                throw new Exception("banco não cadastrado");
            }
            prox.dispensarProduto(id);
        }
    }

    private boolean podeDispensarProduto(Produtos id) {
        if (produto == id) {
            return true;
        }
        return false;
    }

    protected abstract void efetuaPagamento();
}
