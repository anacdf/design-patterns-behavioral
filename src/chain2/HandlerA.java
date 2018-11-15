package chain2;

public class HandlerA implements ChainHandler {
    private ChainHandler chainHandler;
    private Requisicao requisicao;
    long t = System.currentTimeMillis();

    @Override
    public void setNextChain(ChainHandler nextChain) {
        this.chainHandler=nextChain;
    }

    @Override
    public void handleRequest(Requisicao requisicao) {
        t = System.currentTimeMillis() - t;
        if (t<200) {
            System.out.println("Requisicao " + requisicao.toString());
            System.out.println("Handler 1");
        }
        else chainHandler.handleRequest(requisicao);
    }
}
