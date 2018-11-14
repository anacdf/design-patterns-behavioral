package chain1;

public class App {
    public static void main(String[] args) {
        SlotDez slotDez = new SlotDez();
        SlotVinteECinco slotVinteCinco = new SlotVinteECinco();
        SlotCinquenta slotCinquenta = new SlotCinquenta();

        slotDez.setNextChain(slotVinteCinco);
        slotVinteCinco.setNextChain(slotCinquenta);

        Produto refri = new Produto(0.5, 0.5, 0.5, "refri");
        Produto chocolate = new Produto(0.5, 0.5, 0.25, "chocolate");
        Produto bala = new Produto(0.25, 0.25, 0.10, "bala");

        Caixa caixa = new Caixa(refri, slotDez, slotVinteCinco, slotCinquenta);

        caixa.vender(refri);
        caixa.vender(chocolate);
        caixa.vender(bala);
    }
}
