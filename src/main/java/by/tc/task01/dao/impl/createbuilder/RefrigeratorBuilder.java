package by.tc.task01.dao.impl.createbuilder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder {
    private int id;
    private double price;
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public RefrigeratorBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public RefrigeratorBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public RefrigeratorBuilder setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public RefrigeratorBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public RefrigeratorBuilder setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
        return this;
    }

    public RefrigeratorBuilder setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public RefrigeratorBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public RefrigeratorBuilder setWidth(double width) {
        this.width = width;
        return this;
    }
    public Appliance build(){
        Refrigerator refrigerator = new Refrigerator(id, price, powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
        return refrigerator;
    }
}
