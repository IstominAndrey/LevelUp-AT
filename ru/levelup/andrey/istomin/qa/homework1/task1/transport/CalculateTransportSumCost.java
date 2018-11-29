package ru.levelup.andrey.istomin.qa.homework1.task1.transport;

import java.util.List;

public class CalculateTransportSumCost {

    public int calculateTransportSumCost (List<Transport> transports) {
        int sum = 0;
        for (Transport transport: transports) {
            sum += transport.getCost();
        }
        return sum;
    }
}
