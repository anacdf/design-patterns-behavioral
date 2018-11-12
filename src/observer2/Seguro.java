package observer2;

public class Seguro implements IObserver {
    private Delegacia delegacia;

    public Seguro(Delegacia delegacia) {
        this.delegacia = delegacia;
    }

    @Override
    public void update() {
        this.delegacia.updateSeguradora();
    }
}
