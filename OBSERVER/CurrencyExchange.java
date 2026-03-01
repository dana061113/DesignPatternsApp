package observer;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private double usdRate;

    public void setUsdRate(double usdRate) {
        this.usdRate = usdRate;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(usdRate);
        }
    }
}
