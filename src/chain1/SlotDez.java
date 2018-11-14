package chain1;

public class SlotDez implements Chain{
    private Chain nextChain;
    private double saldo;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void setSaldo(Produto produto) {
        if(produto.getMoeda1()==0.10&&produto.getMoeda2()==0.10&&produto.getMoeda3()==0.10){
            saldo = produto.getMoeda1()+produto.getMoeda2()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.10&&produto.getMoeda2()==0.10&&produto.getMoeda3()!=0.10){
            saldo = produto.getMoeda1()+produto.getMoeda2();
        }
        else if(produto.getMoeda1()!=0.10&&produto.getMoeda2()==0.10&&produto.getMoeda3()==0.10){
            saldo = produto.getMoeda2()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.10&&produto.getMoeda2()!=0.10&&produto.getMoeda3()!=0.10){
            saldo = produto.getMoeda1();
        }
        else if(produto.getMoeda1()!=0.10&&produto.getMoeda2()!=0.10&&produto.getMoeda3()==0.10){
            saldo = produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.10&&produto.getMoeda2()!=0.10&&produto.getMoeda3()==0.10){
            saldo =produto.getMoeda1()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()!=0.10&&produto.getMoeda2()==0.10&&produto.getMoeda3()!=0.10){
            saldo = produto.getMoeda2();
        }
        else nextChain.setSaldo(produto);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
