package org.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarketImpl implements StockMarket {

    private List<StockObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockSymbol, double stockPrice) {
        for (StockObserver stockObserver : observers) {
            stockObserver.update(stockSymbol, stockPrice);
        }
    }
}
