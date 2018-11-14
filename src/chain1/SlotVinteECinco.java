package chain1;

public class SlotVinteECinco implements Chain {
    private Chain nextChain;
    private double saldo;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void setSaldo(Produto produto) {
        if(produto.getMoeda1()==0.25&&produto.getMoeda2()==0.25&&produto.getMoeda3()==0.25){
             saldo = produto.getMoeda1()+produto.getMoeda2()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.25&&produto.getMoeda2()==0.25&&produto.getMoeda3()!=0.25){
             saldo = produto.getMoeda1()+produto.getMoeda2();
        }
        else if(produto.getMoeda1()!=0.25&&produto.getMoeda2()==0.25&&produto.getMoeda3()==0.25){
             saldo = produto.getMoeda2()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.25&&produto.getMoeda2()!=0.25&&produto.getMoeda3()!=0.25){
             saldo = produto.getMoeda1();
        }
        else if(produto.getMoeda1()!=0.25&&produto.getMoeda2()!=0.25&&produto.getMoeda3()==0.25){
             saldo = produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.25&&produto.getMoeda2()!=0.25&&produto.getMoeda3()==0.25){
             saldo =produto.getMoeda1()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()!=0.25&&produto.getMoeda2()==0.25&&produto.getMoeda3()!=0.25){
             saldo =produto.getMoeda2();
        }
        else nextChain.setSaldo(produto);
    }

    public double getSaldo() {
        return saldo;
    }
}
