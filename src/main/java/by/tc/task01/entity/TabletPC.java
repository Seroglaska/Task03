package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance{
    private double batteryCapacity;
    private double displayInches;
    private double memoryROM;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC(int id, double price, double batteryCapacity, double displayInches, double memoryROM, double flashMemoryCapacity, String color) {
        super(id, price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }
    public TabletPC(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
                && displayInches == tabletPC.displayInches
                && memoryROM == tabletPC.memoryROM
                && flashMemoryCapacity == tabletPC.flashMemoryCapacity && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + "\n" +
                "Id=" + super.getId() + "\n" +
                "BatteryCapacity=" + batteryCapacity + "\n" +
                "DisplayInches=" + displayInches + "\n" +
                "MemoryRom=" + memoryROM + "\n" +
                "FlashMemoryCapacity=" + flashMemoryCapacity + "\n" +
                "Color=" + color + "\n" +
                "Price=" + super.getPrice();
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }
    // you may add your own code here
}
