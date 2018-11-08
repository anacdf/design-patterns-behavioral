package chain1;

public class App {
    public static void main(String[] args) {
        Produto refri = new Produto(2.0, "Coca-Cola");

        MaquinaChain slotUm = new SlotUm(refri);

        slotUm.acumulaMoedas(1.0, 2);
        slotUm.dispensarProduto();


    }
}
