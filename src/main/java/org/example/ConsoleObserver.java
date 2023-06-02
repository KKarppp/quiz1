package org.example;

public class ConsoleObserver implements IObserver{

    @Override
    public void notify(String message){
        System.out.println(message);
    }
}
