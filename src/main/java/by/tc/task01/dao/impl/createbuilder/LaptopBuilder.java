package by.tc.task01.dao.impl.createbuilder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopBuilder {
    private int id;
    private double price;
    private double batteryCapacity;
    private double OS;
    private double memoryROM;
    private double systemMemory;
    private double CPU;
    private double displayInches;

    public LaptopBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public LaptopBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public LaptopBuilder setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public LaptopBuilder setOS(double OS) {
        this.OS = OS;
        return this;
    }

    public LaptopBuilder setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
        return this;
    }

    public LaptopBuilder setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
        return this;
    }

    public LaptopBuilder setCPU(double CPU) {
        this.CPU = CPU;
        return this;
    }

    public LaptopBuilder setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
        return this;
    }
    public Appliance build(){
        Laptop laptop = new Laptop(id, price, batteryCapacity, OS, memoryROM, systemMemory, CPU, displayInches);
        return laptop;
    }
}
