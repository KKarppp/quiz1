package org.example;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class BloodPressureMonitor extends BiomedicalDevice {

    private int systolic;
    private int diastolic;

    public BloodPressureMonitor(String name, List<org.example.IObserver> IObserver, int systolic, int diastolic) {
        super(name, IObserver);
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    @Override
    public void read() {
        Random rd = new Random();
        systolic = rd.nextInt(100, 160);
        diastolic = rd.nextInt(60, 120);
        System.out.println("Systolic" + systolic);
        System.out.println("Dastolic" + diastolic);   // ask where to put the random generators (maybe constroctior)
    }

    @Override
    public boolean isNormal() {
        if (systolic < 120 && diastolic < 80) {
            return true;
        } else return false;
    }
}

// Source: https://www.cdc.gov/bloodpressure/about.htm
