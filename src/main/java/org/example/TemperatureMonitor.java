package org.example;

import java.util.List;
import java.util.Random;

public class TemperatureMonitor extends BiomedicalDevice {

  double temperature;

    public TemperatureMonitor(String name, List<org.example.IObserver> IObserver, double heartRate) {
        super(name, IObserver);
        this.temperature = temperature;
    }

    @Override
    public void read() {
        Random rd = new Random();
        temperature = rd.nextDouble(0,45);
        System.out.println("Temperature: "+ temperature);
    }

    @Override
    public boolean isNormal() {
        if (temperature > 36.5 && temperature < 37){
            return true;
        } else


        return false;
    }
}
