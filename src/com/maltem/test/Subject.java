package com.maltem.test;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state1;
    private int state2;
    private String state3;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObservers(){
       observers.forEach(Observer::update);
    }

    public void setState(int state1,int state2,String state3) {
        this.state1 = state1;
        this.state2 = state2;
        this.state3 = state3;
        notifyAllObservers();
    }

    public int getState1() {
        return state1;
    }

    public int getState2() {
        return state2;
    }

    public String getState3() {
        return state3;
    }
}
