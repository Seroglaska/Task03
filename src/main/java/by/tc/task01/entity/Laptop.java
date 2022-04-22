package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private double OS;
    private double memoryROM;
    private double systemMemory;
    private double CPU;
    private double displayInches;

    public Laptop(int id, double price, double batteryCapacity, double OS, double memoryROM, double systemMemory, double CPU, double displayInches) {
        super(id, price);
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInches = displayInches;
    }

    public Laptop() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
                && memoryROM == laptop.memoryROM
                && systemMemory == laptop.systemMemory
                && Double.compare(laptop.CPU, CPU) == 0
                && displayInches == laptop.displayInches
                && Objects.equals(OS, laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, OS, memoryROM, systemMemory, CPU, displayInches);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + "\n" +
                "Id=" + super.getId() + "\n" +
                "BatteryCapacity=" + batteryCapacity + "\n" +
                "OS=" + OS + "\n" +
                "MemoryROM=" + memoryROM + "\n" +
                "SystemMemory=" + systemMemory + "\n" +
                "CPU=" + CPU + "\n" +
                "DisplayInches=" + displayInches + "\n" +
                "Price=" + super.getPrice();
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getOS() {
        return OS;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public double getDisplayInches() {
        return displayInches;
    }
    // you may add your own code here
}
