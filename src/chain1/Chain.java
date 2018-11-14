package chain1;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public void setSaldo(Produto produto);
    public double getSaldo();
}
