package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(int id, double price, double powerConsumption, String filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(id, price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }
    public VacuumCleaner(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption
                && motorSpeedRegulation == that.motorSpeedRegulation
                && cleaningWidth == that.cleaningWidth
                && Objects.equals(filterType, that.filterType) && Objects.equals(bagType, that.bagType)
                && Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation,
                cleaningWidth);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + "\n" +
                "PowerConsumption=" + powerConsumption + "\n" +
                "FilterType='" + filterType + "\n" +
                "BagType='" + bagType + "\n" +
                "WandType='" + wandType + "\n" +
                "MotorSpeedRegulation=" + motorSpeedRegulation + "\n" +
                "CleaningWidth=" + cleaningWidth + "\n" +
                "Price=" + super.getPrice();
    }


    public double getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }
}
