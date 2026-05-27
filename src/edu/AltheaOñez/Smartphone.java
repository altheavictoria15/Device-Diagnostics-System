package edu.AltheaOñez;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.Powerable;

public class Smartphone extends Device {
    
    public Smartphone(String name, int batteryLevel, Powerable powerBehavior) {
        super(name, batteryLevel, powerBehavior);
    }
    
    @Override
    public void runDiagnostics() {
        powerBehavior.powerOn();
        System.out.println("Running smartphone diagnostics...");
        
        int storageUsed = 85;
        
        if (storageUsed > 90) {
            System.out.println("WARNING: Storage almost full! Used: " + storageUsed + "%");
        } else if (storageUsed > 75) {
            System.out.println("CAUTION: Storage running low: " + storageUsed + "% used");
        } else {
            System.out.println("Storage usage normal: " + storageUsed + "%");
        }
        
        if (batteryLevel < 15) {
            System.out.println("CRITICAL: Battery critically low! " + batteryLevel + "% remaining");
        } else if (batteryLevel < 30) {
            System.out.println("WARNING: Battery low: " + batteryLevel + "%");
        } else {
            System.out.println("Battery level: " + batteryLevel + "% - Good");
        }
        
        System.out.println("Smartphone diagnostics complete.\n");
    }
}