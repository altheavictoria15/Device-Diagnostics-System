package edu.devicediagnostic;

public abstract class Device {
    protected String name;
    protected int batteryLevel;
    protected Powerable powerBehavior;
    
    public Device(String name, int batteryLevel, Powerable powerBehavior) {
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.powerBehavior = powerBehavior;
    }
    
    public abstract void runDiagnostics();
    
    public void showStatus() {
        System.out.println("Device: " + name);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}