package org.example;

import java.util.List;

public abstract class BiomedicalDevice implements IDevice{
       private String name;
        private boolean running;
        private List<IObserver> IObserver;


    BiomedicalDevice() { // DEFAULT
        this.name = "ZenonNULL";
        this.IObserver = null;
    }

        BiomedicalDevice(String name, List<IObserver> IObserver){
        this.name = name;
        this.IObserver = IObserver;
    }

    @Override
    public void start(){
        this.running = true;
    }
    @Override
    public void stop(){
        this.running = false;
    }
    @Override
    public boolean isRunning(){
        return this.running;
    }
}
