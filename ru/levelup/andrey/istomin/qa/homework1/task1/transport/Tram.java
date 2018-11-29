package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

//трамваи

public class Tram extends ElectricalTransport {
    public Tram(int cost, String routeNumber, String model, int power) {
        super(cost, routeNumber, model, power);
    }


    @Override
    public String toString() {
        return "Стоимость: " + this.cost + " рублей, маршрут: " + this.routeNumber + ", модель " + this.model +
                ", мощность: " + this.power;
    }
}
