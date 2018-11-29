package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

//класс транспорта, работающих на электричестве

public class ElectricalTransport extends Transport{
    protected int power;         //мощность двигателя, КВт

    public ElectricalTransport(int cost, String routeNumber, String model, int power) {
        super(cost, routeNumber, model);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
