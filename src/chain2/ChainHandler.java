package chain2;

public interface ChainHandler {
    void setNextChain(ChainHandler nextChain);
    void handleRequest(Requisicao requisicao);
}
