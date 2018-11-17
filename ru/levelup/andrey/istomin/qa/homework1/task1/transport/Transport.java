package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

// абстрактный класс Транспорт

public abstract class Transport {
    protected int cost;             //стоимость
    protected String routeNumber;   //номер маршрута
    protected String model;         //название модели

    public Transport(int cost, String routeNumber, String model) {
        this.cost = cost;
        this.routeNumber = routeNumber;
        this.model = model;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        model = model;
    }

}
