package org.example;

public interface IDevice {

    public void start(); // Starts device
    public void stop(); //Stops device
    public boolean isRunning();// Checks if the device is currently running.
    public void read();// Reads the current value from the device.
    public boolean isNormal();// Checks if the device reading is within the normal range.



}
