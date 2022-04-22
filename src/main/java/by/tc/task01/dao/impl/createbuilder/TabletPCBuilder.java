package by.tc.task01.dao.impl.createbuilder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder {
    private int id;
    private double price;
    private double batteryCapacity;
    private double displayInches;
    private double memoryROM;
    private double flashMemoryCapacity;
    private String color;

    public TabletPCBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public TabletPCBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public TabletPCBuilder setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public TabletPCBuilder setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
        return this;
    }

    public TabletPCBuilder setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
        return this;
    }

    public TabletPCBuilder setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
        return this;
    }

    public TabletPCBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Appliance build(){
        TabletPC tabletPC = new TabletPC(id, price, batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color);
        return tabletPC;
    }
}