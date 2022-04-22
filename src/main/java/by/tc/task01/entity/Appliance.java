package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {
    private int id;
    private double price;

    Appliance(int id, double price){
        this.id = id;
        this.price = price;
    }

    Appliance(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Appliance appliance = (Appliance) o;
        return id == appliance.id && Double.compare(appliance.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + "Id=" + id + ", Price=" + price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

}
