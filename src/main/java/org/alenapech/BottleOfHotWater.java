package org.alenapech;

public class BottleOfHotWater extends BottleOfWater{
    private int temperature;

    public BottleOfHotWater(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "BottleOfHotWater{" +
                "name='" + getName() + '\'' +
                ", cost=" + getCost() + '\'' +
                ", volume=" + getVolume() + '\'' +
                ",temperature=" + temperature +
                '}';

    }
}
