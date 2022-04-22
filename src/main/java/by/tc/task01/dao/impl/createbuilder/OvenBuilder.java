package by.tc.task01.dao.impl.createbuilder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenBuilder {
    private int id;
    private double price;
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public OvenBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public OvenBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public OvenBuilder setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public OvenBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public OvenBuilder setCapacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    public OvenBuilder setDepth(double depth) {
        this.depth = depth;
        return this;
    }

    public OvenBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public OvenBuilder setWidth(double width) {
        this.width = width;
        return this;
    }
    public Appliance build(){
        Oven oven = new Oven(id, price, powerConsumption, weight, capacity, depth, height, width);
        return oven;
    }
}
