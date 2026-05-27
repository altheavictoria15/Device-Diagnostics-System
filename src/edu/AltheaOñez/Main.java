package edu.AltheaOñez;

import edu.devicediagnostic.Device;
import edu.devicediagnostic.NormalPowerOn;
import edu.devicediagnostic.FastBootPowerOn;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEVICE DIAGNOSTICS SYSTEM ===\n");
        System.out.println("Diagnostics by: Althea Oñez\n");
        
        ArrayList<Device> devices = new ArrayList<>();
        
        devices.add(new Laptop("Acer Aspire 5", 70, new NormalPowerOn()));
        devices.add(new Smartphone("iPhone 17", 20, new FastBootPowerOn()));
        devices.add(new Tablet("iPad Pro", 50, new NormalPowerOn()));
        devices.add(new Laptop("MacBook Air", 10, new FastBootPowerOn()));
        devices.add(new Smartphone("Samsung Galaxy S26", 95, new NormalPowerOn()));
        devices.add(new Tablet("Huawei MatePad", 40, new FastBootPowerOn()));
        
        System.out.println("Starting diagnostic session for " + devices.size() + " devices...\n");
        System.out.println("=".repeat(60));
        
        int deviceCount = 1;
        for (Device device : devices) {
            System.out.println("Device #" + deviceCount);
            System.out.println("-".repeat(40));
            
            device.showStatus();
            System.out.println();
            device.runDiagnostics();
            
            System.out.println("=".repeat(60));
            deviceCount++;
        }
        
        System.out.println("\n=== DIAGNOSTICS COMPLETED ===");
    }
}