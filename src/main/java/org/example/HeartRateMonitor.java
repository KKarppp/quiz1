package org.example;

import java.util.List;
import java.util.Random;

public class HeartRateMonitor extends BiomedicalDevice {

    private int heartRate;


    public HeartRateMonitor(String name, List<IObserver> iObservers, int heartRate) {
        super(name, iObservers);
        this.heartRate = heartRate;
    }

    @Override
    public void read() {
        Random rd = new Random();
        heartRate = rd.nextInt(0, 150);
        System.out.println("Heart Rate: " + heartRate);
        /*if(!isNormal()){
            for(var IObserver : IObserver ){
                IObserver.notify("Heart Rate NOT NOTMAL!");
            }*/
    }

    @Override
    public boolean isNormal() {
        if (heartRate > 60 && heartRate < 100) {
            return true;
        } else
            return false;
    }

}
//Source: https://www.bhf.org.uk/informationsupport/heart-matters-magazine/medical/ask-the-experts/pulse-rate

//    Implement the start, stop, isRunning, read, and isNormal methods in each of the three
//        device classes, according to their specific device behavior.