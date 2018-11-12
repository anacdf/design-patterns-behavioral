package observer2;

public interface IObservable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notificar();
}
