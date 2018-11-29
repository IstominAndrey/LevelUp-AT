package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

//троллейбусы

public class Trolleybus extends ElectricalTransport {

    public Trolleybus(int cost, String routeNumber, String model, int power) {
        super(cost, routeNumber, model, power);
    }

    @Override
    public String toString() {
        return "Стоимость: " + this.cost + " рублей, маршрут: " + this.routeNumber + ", модель " + this.model +
                ", мощность: " + this.power;
    }


}
