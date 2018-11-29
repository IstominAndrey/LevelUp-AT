package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

import ru.levelup.andrey.istomin.qa.homework1.task1.transport.enums.FuelType;

//класс транспорта, потребляющих топливо

public class FuelTransport extends Transport {
    protected FuelType fuelType;               //тип топлива
    protected int fuelConsumption;             //расход топлива литр/км

    public FuelTransport(int cost, String routeNumber, String model, FuelType fuelType, int fuelConsumption) {
        super(cost, routeNumber, model);
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }



    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

}
