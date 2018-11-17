/*
курс: автоматизированное тестирование
студент: Истомин Андрей
домашнее задание №1
объектная модель: парк общественного транспорта
*/
package ru.levelup.andrey.istomin.qa.homework1.task1;

import ru.levelup.andrey.istomin.qa.homework1.task1.transport.*;

import java.util.ArrayList;
import java.util.List;

import static ru.levelup.andrey.istomin.qa.homework1.task1.transport.enums.FuelType.DIESEL;
import static ru.levelup.andrey.istomin.qa.homework1.task1.transport.enums.FuelType.PETROL;

public class PublicTransportPark {
    public static void main(String[] args) {

        //объявление списков данных

        List<Bus> buses = new ArrayList<>();
        List<MiniBus> miniBuses = new ArrayList<>();
        List<Trolleybus> trolleybuses = new ArrayList<>();
        List<Tram> trams = new ArrayList<>();

        //добавление обектов в списки

        buses.add(new Bus(1200000, "102", "ЛиАЗ-5256" , PETROL, 20));
        buses.add(new Bus(1350000, "98", "ЛиАЗ-5256" , PETROL, 25));
        buses.add(new Bus(1250000, "176", "ЛиАЗ-5293" , DIESEL, 30));
        miniBuses.add(new MiniBus(600000, "К-102", "ПАЗ-3204" , PETROL, 16));
        miniBuses.add(new MiniBus(650000, "К-103", "ПАЗ-3204" , PETROL, 14));
        miniBuses.add(new MiniBus(500000, "К-58", "ПАЗ-4234" , DIESEL, 18));
        trolleybuses.add(new Trolleybus(800000,"6","Тролза-6206" , 170));
        trolleybuses.add(new Trolleybus(850000,"31","ТролЗа-5275.0" , 180));
        trolleybuses.add(new Trolleybus(750000,"32","ТролЗа-5275.0" , 180));
        trams.add(new Tram(900000,"51","71-623-02" , 450));
        trams.add(new Tram(950000,"100","71-623-03" , 450));
        trams.add(new Tram(1000000,"57","71-633" , 300));


        //вывод списков на экран

        System.out.println("Список автобусов:");
        for (int i = 0; i < buses.size(); i++) {
            buses.get(i).Output();
        }
        System.out.println("==============================================");

        System.out.println("Список мини-автобусов (маршруток):");
        for (int i = 0; i < miniBuses.size(); i++) {
            miniBuses.get(i).Output();
        }
        System.out.println("==============================================");

        System.out.println("Список троллейбусов:");
        for (int i = 0; i < trolleybuses.size(); i++) {
            trolleybuses.get(i).Output();
        }
        System.out.println("==============================================");

        System.out.println("Список трамваев:");
        for (int i = 0; i < trams.size(); i++) {
            trams.get(i).Output();
        }
        System.out.println("==============================================");

        //расчет стоимости автопарка

        int sumCost = 0;                               // суммарная стоимость

        for (int i = 0; i < buses.size(); i++) {
            sumCost += buses.get(i).getCost();
        }
        for (int i = 0; i < miniBuses.size(); i++) {
            sumCost += miniBuses.get(i).getCost();
        }
        for (int i = 0; i < trolleybuses.size(); i++) {
            sumCost += trolleybuses.get(i).getCost();
        }
        for (int i = 0; i < trams.size(); i++) {
            sumCost += trams.get(i).getCost();
        }
        System.out.println("Суммарная стоимость автопарка: " + sumCost + " рублей");
        System.out.println("==============================================");

        // сортировка автобусов по расходу топлива

        System.out.println("Сортировка всех типов автобусов по расходу топлива:");
        List<FuelTransport> allBuses = new ArrayList<>();

        // объединение списков

        for (int i = 0; i < buses.size(); i++) {
            allBuses.add(buses.get(i));
        }
        for (int i = 0; i < miniBuses.size(); i++) {
            allBuses.add(miniBuses.get(i));
        }

        // сортировка списка

        for (int i = allBuses.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (allBuses.get(j).getFuelConsumption() < allBuses.get(j + 1).getFuelConsumption()) {
                    allBuses.add(j, allBuses.get(j + 1));
                    allBuses.remove(j + 2);
                }
            }
        }

        for (int i = 0; i < allBuses.size(); i++) {
            allBuses.get(i).Output();
        }
        System.out.println("==============================================");

        // нахождение автобусов, соответсвующих заданным параметрам

        int minConsumtion, maxConsumption, maxCost, minCost;        // максимальные и минимальные параметры
        minConsumtion = 14;
        maxConsumption = 25;
        maxCost = 1200000;
        minCost = 650000;

        System.out.println("Список всех автобусов, удовлетворяющих заданным параметрам:");

        for (FuelTransport tempBus : allBuses) {
            if ((tempBus.getCost() <= maxCost) && (tempBus.getCost() >= minCost) &&
               (tempBus.getFuelConsumption() <= maxConsumption) && (tempBus.getFuelConsumption() >= minConsumtion)) {
               tempBus.Output();
            }
        }
    }
}
