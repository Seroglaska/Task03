package by.tc.task01.dao.impl.createbuilder;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersBuilder {
    private int id;
    private double price;
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public SpeakersBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public SpeakersBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public SpeakersBuilder setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public SpeakersBuilder setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
        return this;
    }

    public SpeakersBuilder setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
        return this;
    }

    public SpeakersBuilder setCordLength(double cordLength) {
        this.cordLength = cordLength;
        return this;
    }

    public Appliance build(){
        Speakers speakers = new Speakers(id, price, powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
        return speakers;
    }
}
