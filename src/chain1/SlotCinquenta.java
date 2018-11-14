package chain1;

public class SlotCinquenta implements Chain{
    private Chain nextChain;
    private double saldo;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void setSaldo(Produto produto) {
        if(produto.getMoeda1()==0.50&&produto.getMoeda2()==0.50&&produto.getMoeda3()==0.50){
             saldo = produto.getMoeda1()+produto.getMoeda2()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.50&&produto.getMoeda2()==0.50&&produto.getMoeda3()!=0.50){
             saldo = produto.getMoeda1()+produto.getMoeda2();
        }
        else if(produto.getMoeda1()!=0.50&&produto.getMoeda2()==0.50&&produto.getMoeda3()==0.50){
             saldo = produto.getMoeda2()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.50&&produto.getMoeda2()!=0.50&&produto.getMoeda3()!=0.50){
             saldo = produto.getMoeda1();
        }
        else if(produto.getMoeda1()!=0.50&&produto.getMoeda2()!=0.50&&produto.getMoeda3()==0.50){
             saldo = produto.getMoeda3();
        }
        else if(produto.getMoeda1()==0.50&&produto.getMoeda2()!=0.50&&produto.getMoeda3()==0.50){
             saldo =produto.getMoeda1()+produto.getMoeda3();
        }
        else if(produto.getMoeda1()!=0.50&&produto.getMoeda2()==0.50&&produto.getMoeda3()!=0.50){
             saldo =produto.getMoeda2();
        }
        else System.out.println("essa maquina so aceita moedas de 0.10, 0.50 e 0.25");;
    }

    public double getSaldo() {
        return saldo;
    }

}
