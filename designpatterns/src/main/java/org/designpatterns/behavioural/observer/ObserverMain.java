package org.designpatterns.behavioural.observer;

public class ObserverMain {
    public static void main(String[] args) {
        StockObserver zerodha = new Investor("Zerodha");
        StockObserver groww = new Investor("Groww");

        StockMarket stockMarket = new StockMarketImpl();
        stockMarket.registerObserver(zerodha);
        stockMarket.registerObserver(groww);

        stockMarket.notifyObservers("APPL", 34.32);
    }
}
