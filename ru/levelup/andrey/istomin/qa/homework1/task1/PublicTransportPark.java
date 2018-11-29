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
        PrintListOfTransport(buses);
        System.out.println("Список минибасов (маршруток):");
        PrintListOfTransport(miniBuses);
        System.out.println("Список троллейбусов:");
        PrintListOfTransport(trolleybuses);
        System.out.println("Список трамваев:");
        PrintListOfTransport(trams);

        //расчет суммарной стоимости автопарка

        int sumCost = 0;

        sumCost += calculateTransportSumCost(buses);
        sumCost += calculateTransportSumCost(miniBuses);
        sumCost += calculateTransportSumCost(trolleybuses);
        sumCost += calculateTransportSumCost(trams);

        System.out.println("Суммарная стоимость автопарка: " + sumCost + " рублей");
        System.out.println("==============================================");

        // сортировка автобусов по расходу топлива

        System.out.println("Сортировка всех типов автобусов по расходу топлива:");
        List<FuelTransport> allBuses;

        // объединение списков автобусов

        allBuses = ListOfAllBuses(buses, miniBuses);

        // сортировка списка

        PrintSortedBusesByFuelConsumption(allBuses);

        // нахождение автобусов, соответсвующих заданным параметрам
        // максимальные и минимальные параметры

        int maxConsumption = 25;
        int minConsumption = 14;
        int maxCost = 1200000;
        int minCost = 650000;

        PrintBusesMatchingParameters(allBuses, maxConsumption, minConsumption, maxCost, minCost);
    }

    private static int calculateTransportSumCost(List<? extends Transport> transports) {
        int sum = 0;
        for (Transport transport: transports) {
            sum += transport.getCost();
        }
        return sum;
    }

    private static void PrintListOfTransport(List<? extends Transport> transports) {
        for (Transport transport: transports) {
            System.out.println(transport);
        }
        System.out.println("==============================================");
    }

    private static List<FuelTransport> ListOfAllBuses (List<Bus> buses, List<MiniBus> miniBuses) {
        List<FuelTransport> allBuses = new ArrayList<>();
        for (FuelTransport bus: buses) {
            allBuses.add(bus);
        }
        for (FuelTransport bus: miniBuses) {
            allBuses.add(bus);
        }
        return allBuses;
    }

    private static void PrintSortedBusesByFuelConsumption (List<FuelTransport> allBuses) {
        for (int i = allBuses.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (allBuses.get(j).getFuelConsumption() < allBuses.get(j + 1).getFuelConsumption()) {
                    allBuses.add(j, allBuses.get(j + 1));
                    allBuses.remove(j + 2);
                }
            }
        }
        for (FuelTransport bus: allBuses) {
            System.out.println(bus);
        }
        System.out.println("==============================================");
    }

    private static void PrintBusesMatchingParameters (List<FuelTransport> allBuses, int maxConsumption,
                                                      int minConsumption, int maxCost, int minCost) {
        boolean withinCostRange, withinFuelConsumptionRange;

        System.out.println("Список всех автобусов, удовлетворяющих заданным параметрам:");

        for (FuelTransport tempBus : allBuses) {
            withinCostRange = (tempBus.getCost() <= maxCost) && (tempBus.getCost() >= minCost);
            withinFuelConsumptionRange = (tempBus.getFuelConsumption() <= maxConsumption) &&
                    (tempBus.getFuelConsumption() >= minConsumption);
            if (withinCostRange && withinFuelConsumptionRange) {
                System.out.println(tempBus);
            }
        }
    }

}
