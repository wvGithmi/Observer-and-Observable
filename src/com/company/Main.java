package com.company;

public class Main {

    public static void main(String[] args) {

        NokiaMobilePriceObservable nmpo = new NokiaMobilePriceObservable(5000);

        PeterObserver pObs = new PeterObserver();
        JohnObserver jObs = new JohnObserver();

        nmpo.addObserver(pObs);
        nmpo.addObserver(jObs);

        nmpo.setPrice(9000);

    }
}
