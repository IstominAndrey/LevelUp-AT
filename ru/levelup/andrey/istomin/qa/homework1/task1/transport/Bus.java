package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

import ru.levelup.andrey.istomin.qa.homework1.task1.transport.enums.FuelType;

//автобусы

public class Bus extends FuelTransport {
    public Bus(int cost, String routeNumber, String model, FuelType fuelType, int fuelConsumption) {
        super(cost, routeNumber, model, fuelType, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Стоимость: " + this.cost + " рублей, маршрут: " + this.routeNumber + ", модель " + this.model +
                           ", тип топлива: " + this.fuelType + ", расход топлива: " + this.fuelConsumption;
    }
}
