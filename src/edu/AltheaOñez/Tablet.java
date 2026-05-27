package edu.AltheaOñez;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.Powerable;

public class Tablet extends Device {
    
    public Tablet(String name, int batteryLevel, Powerable powerBehavior) {
        super(name, batteryLevel, powerBehavior);
    }
    
    @Override
    public void runDiagnostics() {
        powerBehavior.powerOn();
        System.out.println("Running tablet diagnostics...");
        
        int screenBrightness = 95;
        
        if (screenBrightness > 90) {
            System.out.println("NOTE: High brightness detected: " + screenBrightness + "% - High power consumption");
        } else if (screenBrightness > 70) {
            System.out.println("Brightness level: " + screenBrightness + "% - Optimal");
        } else {
            System.out.println("Low brightness: " + screenBrightness + "% - Power saving mode");
        }
        
        if (batteryLevel < 25) {
            System.out.println("WARNING: Battery level low! Please charge soon.");
        } else if (batteryLevel < 50) {
            System.out.println("Moderate battery: " + batteryLevel + "% - Consider charging soon");
        } else {
            System.out.println("Battery level healthy: " + batteryLevel + "%");
        }
        
        System.out.println("Tablet diagnostics complete.\n");
    }
}