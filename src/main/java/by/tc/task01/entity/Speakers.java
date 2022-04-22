package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers(int id, double price, double powerConsumption, double numberOfSpeakers, String frequencyRange, double cordLength) {
        super(id, price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }
    public Speakers(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption
                && numberOfSpeakers == speakers.numberOfSpeakers
                && cordLength == speakers.cordLength
                && Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + "\n" +
                "PowerConsumption=" + powerConsumption + "\n" +
                "NumberOfSpeakers=" + numberOfSpeakers + "\n" +
                "FrequencyRange='" + frequencyRange + "\n" +
                "CordLength=" + cordLength + "\n" +
                "Price=" + super.getPrice();
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }
    // you may add your own code here
}
