package edu.devicediagnostic;

public class FastBootPowerOn implements Powerable {
    @Override
    public void powerOn() {
        System.out.println("[Fast Boot] Quick powering on...");
        System.out.println("Bypassing full system checks...");
        System.out.println("Device ready in ultra-fast mode.");
    }
}