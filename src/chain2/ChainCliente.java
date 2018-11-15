package chain2;

public class ChainCliente {
    public static void main(String[] args) {
        Requisicao req1 = new Requisicao(1);

        ChainHandler handlerA = new HandlerA();
        ChainHandler handlerB = new HandlerB();
        ChainHandler handlerC = new HandlerC();
        ChainHandler handlerD = new HandlerD();

        handlerA.setNextChain(handlerB);
        handlerB.setNextChain(handlerC);
        handlerC.setNextChain(handlerD);

        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);
        handlerA.handleRequest(req1);

    }
}
