package observer2;

import java.util.ArrayList;

public class Alarme implements IObservable {
    private ArrayList<IObserver> listOfObservers = new ArrayList<>();
    private boolean movimento = false;

    @Override
    public void add(IObserver observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notificar() {
        if(movimento==true) {
            for (IObserver observer : listOfObservers) {
                observer.update();
            }
        }
    }

    public String getMessage(){
        return "movimento detectado";
    }

    public boolean movimento(){
        return this.movimento = true;
    }
}
