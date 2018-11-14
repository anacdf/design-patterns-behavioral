package chain1;

public class Caixa {
    private SlotDez slotDez;
    private SlotVinteECinco slotVinteECinco;
    private SlotCinquenta slotCinquenta;
    private Produto produto;
    private double total;
    private double preco;
    private double troco;

    public Caixa(Produto produto, SlotDez slotDez, SlotVinteECinco slotVinteECinco, SlotCinquenta slotCinquenta){
        this.produto=produto;
        this.slotDez = slotDez;
        this.slotVinteECinco = slotVinteECinco;
        this.slotCinquenta = slotCinquenta;
    }

    public void vender(Produto produto){
        total = slotDez.getSaldo() + slotVinteECinco.getSaldo()+slotCinquenta.getSaldo();

        if(produto.getProduto()=="refri"){
            preco = 1.5;
            if(total>preco) {
                troco = total - 1.5;
                System.out.println("Refrigerante disponivel. Retire seu troco de R$"+troco);
            }else troco=0.0;
            System.out.println("Refrigerante disponivel");
        }

       else if(produto.getProduto()=="chocolate"){
            preco = 1.25;
            if(total>preco) {
                troco = total - 1.25;
                System.out.println("Chocolate disponivel. Retire seu troco de R$"+troco);
            }else troco=0.0;
            System.out.println("Chocolate disponivel.");
        }

        else if(produto.getProduto()=="bala"){
            preco = 0.60;
            if(total>preco) {
                troco = total - 0.60;
                System.out.println("Bala disponivel. Retire seu troco de R$"+troco);
            }else
                troco = 0.0;
                System.out.println("Bala disponivel.");

        }

        else
                System.out.println("Produto não está a venda");
    }
}
