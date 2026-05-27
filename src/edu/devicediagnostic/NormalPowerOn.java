package edu.devicediagnostic;

public class NormalPowerOn implements Powerable {
    @Override
    public void powerOn() {
        System.out.println("[Normal Boot] Powering on device...");
        System.out.println("Loading operating system...");
        System.out.println("Device ready.");
    }
}