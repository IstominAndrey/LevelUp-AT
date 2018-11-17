package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

import ru.levelup.andrey.istomin.qa.homework1.task1.transport.enums.FuelType;

//автобусы

public class Bus extends FuelTransport implements TransportOutput{
    public Bus(int cost, String routeNumber, String model, FuelType fuelType, int fuelConsumption) {
        super(cost, routeNumber, model, fuelType, fuelConsumption);
    }

    @Override
    public void Output() {
        System.out.println("Стоимость: " + this.cost + " рублей, маршрут: " + this.routeNumber + ", модель " + model +
                           ", тип топлива: " + this.fuelType + ", расход топлива: " + this.fuelConsumption);
    }
}
