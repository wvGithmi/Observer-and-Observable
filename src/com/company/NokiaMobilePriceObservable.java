package com.company;

import java.util.Observable;

public class NokiaMobilePriceObservable extends Observable{

    private int price;

    public NokiaMobilePriceObservable(int price){
        this.price = price;
    }

    public void setPrice(int newPrice){

        if(price != newPrice){
            System.out.println("Price has changed to new price : " + newPrice);
            price = newPrice;

            setChanged();

            notifyObservers();
        }

    }

    public int getPrice(){
        return price;
    }

}
