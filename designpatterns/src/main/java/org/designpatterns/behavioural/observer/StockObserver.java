package org.designpatterns.behavioural.observer;

public interface StockObserver {
    void update(String stockSymbol, double stockPrice);
}
