package org.example;
import java.util.List;

public class Patient{

    String name;
    List<IDevice> devices;
    public Patient() {
        this.name = "";
        this.devices = null;
    }
    public Patient(String name, List<IDevice> devices) {
        this.name = name;
        this.devices = devices;
    }
}
