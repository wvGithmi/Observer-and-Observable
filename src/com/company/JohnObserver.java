package com.company;

import java.util.Observable;
import java.util.Observer;

public class JohnObserver extends Observable implements Observer {

    public void update(Observable observable, Object arg){

        NokiaMobilePriceObservable nmpo = (NokiaMobilePriceObservable) observable;
        System.out.println("JohnObserver is notified, Price changed to " + nmpo.getPrice());

    }
}
