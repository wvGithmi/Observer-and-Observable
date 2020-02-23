package com.company;

import java.util.Observable;
import java.util.Observer;

public class PeterObserver extends Observable implements Observer {

    public void update(Observable observable, Object arg){

        NokiaMobilePriceObservable nmpo = (NokiaMobilePriceObservable) observable;
        System.out.println("PeterObserver is notified, Price changed to " + nmpo.getPrice());

    }

}
