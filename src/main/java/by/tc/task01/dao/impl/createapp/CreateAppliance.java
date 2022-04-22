package by.tc.task01.dao.impl.createapp;

import by.tc.task01.dao.impl.createbuilder.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.Map;

public class CreateAppliance {


    public Appliance createLaptop(Map<String, Object> laptopFeature){
        Appliance appliance = new LaptopBuilder()
                .setId(Integer.parseInt((String)laptopFeature.get(SearchCriteria.Laptop.PRICE.toString())))
                .setBatteryCapacity(Double.parseDouble((String)laptopFeature.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())))
                .setOS(Double.parseDouble((String)laptopFeature.get(SearchCriteria.Laptop.OS.toString())))
                .setMemoryROM(Double.parseDouble((String)laptopFeature.get(SearchCriteria.Laptop.MEMORY_ROM.toString())))
                .setSystemMemory(Double.parseDouble((String)laptopFeature.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())))
                .setCPU(Double.parseDouble((String)laptopFeature.get(SearchCriteria.Laptop.CPU.toString())))
                .setDisplayInches(Double.parseDouble((String)laptopFeature.get(SearchCriteria.Laptop.DISPLAY_INCHES.toString())))
                .setPrice(Double.parseDouble((String)laptopFeature.get(SearchCriteria.Laptop.PRICE.toString())))
                .build();
        return appliance;
    }

    public Appliance createOven(Map<String, Object> ovenFeature){
        Appliance appliance = new OvenBuilder()
                .setId(Integer.parseInt((String)ovenFeature.get(SearchCriteria.Oven.ID.toString())))
                .setPowerConsumption(Double.parseDouble((String)ovenFeature.get(Oven.POWER_CONSUMPTION.toString())))
                .setWeight(Double.parseDouble((String)ovenFeature.get(Oven.WEIGHT.toString())))
                .setCapacity(Double.parseDouble((String)ovenFeature.get(Oven.CAPACITY.toString())))
                .setDepth(Double.parseDouble((String)ovenFeature.get(Oven.DEPTH.toString())))
                .setHeight(Double.parseDouble((String)ovenFeature.get(Oven.HEIGHT.toString())))
                .setWidth(Double.parseDouble((String)ovenFeature.get(Oven.WIDTH.toString())))
                .setPrice(Double.parseDouble((String)ovenFeature.get(Oven.PRICE.toString())))
                .build();
        return appliance;
    }

    public Appliance createRefrigerator(Map<String, Object> refrigeratorFeature){
        Appliance appliance = new RefrigeratorBuilder()
                .setId(Integer.parseInt((String)refrigeratorFeature.get(SearchCriteria.Refrigerator.ID.toString())))
                .setPowerConsumption(Double.parseDouble((String)refrigeratorFeature.get(Refrigerator.POWER_CONSUMPTION.toString())))
                .setWeight(Double.parseDouble((String)refrigeratorFeature.get(Refrigerator.WEIGHT.toString())))
                .setFreezerCapacity(Double.parseDouble((String)refrigeratorFeature.get(Refrigerator.FREEZER_CAPACITY.toString())))
                .setOverallCapacity(Double.parseDouble((String)refrigeratorFeature.get(Refrigerator.OVERALL_CAPACITY.toString())))
                .setHeight(Double.parseDouble((String)refrigeratorFeature.get(Refrigerator.HEIGHT.toString())))
                .setWidth(Double.parseDouble((String)refrigeratorFeature.get(Refrigerator.WIDTH.toString())))
                .setPrice(Double.parseDouble((String)refrigeratorFeature.get(Refrigerator.PRICE.toString())))
                .build();
        return appliance;
    }

    public Appliance createSpeakers(Map<String, Object> speakersFeature){
        Appliance appliance = new SpeakersBuilder()
                .setId(Integer.parseInt((String)speakersFeature.get(SearchCriteria.Speakers.ID.toString())))
                .setPowerConsumption(Double.parseDouble((String)speakersFeature.get(Speakers.POWER_CONSUMPTION.toString())))
                .setNumberOfSpeakers(Double.parseDouble((String)speakersFeature.get(Speakers.NUMBER_OF_SPEAKERS.toString())))
                .setFrequencyRange((String) speakersFeature.get(Speakers.FREQUENCY_RANGE.toString()))
                .setCordLength(Double.parseDouble((String)speakersFeature.get(Speakers.CORD_LENGTH.toString())))
                .setPrice(Double.parseDouble((String)speakersFeature.get(SearchCriteria.Speakers.PRICE.toString())))
                .build();
        return appliance;
    }

    public Appliance createTabletPC(Map<String, Object> tabletPCFeature){
        Appliance appliance = new TabletPCBuilder()
                .setId(Integer.parseInt((String)tabletPCFeature.get(SearchCriteria.TabletPC.ID.toString())))
                .setPrice(Double.parseDouble((String)tabletPCFeature.get(TabletPC.PRICE.toString())))
                .setBatteryCapacity(Double.parseDouble((String)tabletPCFeature.get(TabletPC.BATTERY_CAPACITY.toString())))
                .setDisplayInches(Double.parseDouble((String)tabletPCFeature.get(TabletPC.DISPLAY_INCHES.toString())))
                .setMemoryROM(Double.parseDouble((String)tabletPCFeature.get(TabletPC.MEMORY_ROM.toString())))
                .setFlashMemoryCapacity(Double.parseDouble((String)tabletPCFeature.get(TabletPC.FLASH_MEMORY_CAPACITY.toString())))
                .setColor((String)tabletPCFeature.get(TabletPC.COLOR.toString()))
                .build();
        return appliance;
    }

    public Appliance createVacuumCleaner(Map<String, Object> vacuumCleanerFeature){
        Appliance appliance = new VacuumCleanerBuilder()
                .setId(Integer.parseInt((String)vacuumCleanerFeature.get(SearchCriteria.VacuumCleaner.ID.toString())))
                .setPrice(Double.parseDouble((String)vacuumCleanerFeature.get(VacuumCleaner.PRICE.toString())))
                .setPowerConsumption(Double.parseDouble((String)vacuumCleanerFeature.get(VacuumCleaner.PRICE.toString())))
                .setFilterType((String)vacuumCleanerFeature.get(VacuumCleaner.PRICE.toString()))
                .setBagType((String)vacuumCleanerFeature.get(VacuumCleaner.PRICE.toString()))
                .setWandType((String)vacuumCleanerFeature.get(VacuumCleaner.PRICE.toString()))
                .setMotorSpeedRegulation(Double.parseDouble((String)vacuumCleanerFeature.get(VacuumCleaner.PRICE.toString())))
                .setCleaningWidth(Double.parseDouble((String)vacuumCleanerFeature.get(VacuumCleaner.PRICE.toString())))
                .build();
        return appliance;
    }

}
