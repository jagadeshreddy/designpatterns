package org.designpatterns.behavioural.observer;

//Subject
public interface StockMarket {

    void registerObserver(StockObserver observer);

    void removeObserver(StockObserver observer);

    void notifyObservers(String stockSymbol, double stockPrice);
}
