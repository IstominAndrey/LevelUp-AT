package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

//трамваи

public class Tram extends ElectricalTransport implements TransportOutput{
    public Tram(int cost, String routeNumber, String model, int power) {
        super(cost, routeNumber, model, power);
    }

    @Override
    public void Output() {
        System.out.println("Стоимость: " + this.cost + " рублей, маршрут: " + this.routeNumber + ", модель " + model +
                ", мощность: " + this.power);
    }
}
