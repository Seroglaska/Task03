package by.tc.task01.dao.impl.createbuilder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder {
    private int id;
    private double price;
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleanerBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public VacuumCleanerBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public VacuumCleanerBuilder setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public VacuumCleanerBuilder setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    public VacuumCleanerBuilder setBagType(String bagType) {
        this.bagType = bagType;
        return this;
    }

    public VacuumCleanerBuilder setWandType(String wandType) {
        this.wandType = wandType;
        return this;
    }

    public VacuumCleanerBuilder setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
        return this;
    }

    public VacuumCleanerBuilder setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
        return this;
    }

    public Appliance build(){
        VacuumCleaner vacuumCleaner= new VacuumCleaner(id, price, powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
        return vacuumCleaner;
    }
}
