package cs2901.utec.edu.pe;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public float getTemperature() {
        return (float)Math.random()*10;
    }
    public float getHumidity() {
        return (float)Math.random()*10;
    }
    public float getPression() {
        return (float)Math.random()*10;
    }
    public void measurementsChanged() {

    }
}
