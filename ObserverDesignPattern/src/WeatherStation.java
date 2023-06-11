import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{
    private List<IObserver> observers = new ArrayList<>();
    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver obsrvr: observers){
            obsrvr.update();
        }
    }
}
