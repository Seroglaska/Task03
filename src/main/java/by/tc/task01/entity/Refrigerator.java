package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public Refrigerator(int id, double price, double powerConsumption, double weight, double freezerCapacity, double overallCapacity, double height, double width) {
        super(id, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }
    public Refrigerator(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption
                && weight == that.weight
                && freezerCapacity == that.freezerCapacity
                && Double.compare(that.overallCapacity, overallCapacity) == 0
                && height == that.height
                && width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + "\n" +
                "powerConsumption=" + powerConsumption + "\n" +
                "weight=" + weight + "\n" +
                "freezerCapacity=" + freezerCapacity + "\n" +
                "overallCapacity=" + overallCapacity + "\n" +
                "height=" + height + "\n" +
                "width=" + width + "\n" +
                "Price=" + super.getPrice();
    }


    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    // you may add your own code here
}
