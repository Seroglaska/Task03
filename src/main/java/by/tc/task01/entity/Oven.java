package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(int id, double price, double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        super(id, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption
                && weight == oven.weight
                && capacity == oven.capacity
                && depth == oven.depth
                && Double.compare(oven.height, height) == 0
                && Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + "\n" +
                "Id=" + super.getId() + "\n" +
                "PowerConsumption=" + powerConsumption + "\n" +
                "Weight=" + weight + "\n" +
                "Capacity=" + capacity + "\n" +
                "Depth=" + depth + "\n" +
                "Height=" + height + "\n" +
                "Width=" + width + "\n" +
                "Price=" + super.getPrice();
    }


    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    // you may add your own code here
}
