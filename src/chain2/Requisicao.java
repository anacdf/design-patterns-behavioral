package chain2;

public class Requisicao {
    private int requisicao;

    public Requisicao(int requisicao) {
        this.requisicao=requisicao;
    }

    public int getRequisicao() {
        return requisicao;
    }

    public String toString(){
        return "numero "+requisicao;
    }
}
