package com.example.designpattern.factory.abstrac;

import lombok.extern.slf4j.Slf4j;

interface Transport {
    public void delivery();
}

@Slf4j
class Truck implements Transport {
    @Override
    public void delivery() {
        log.info("Truck delivery");
    }
}

@Slf4j
class Ship implements Transport {
    @Override
    public void delivery() {

        log.info("Ship delivery");
    }
}

abstract class Logistics {
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();

        transport.delivery();
    }
}

class RoadLogistic extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        Logistics roadLogistic = new RoadLogistic();
        roadLogistic.planDelivery();

        Logistics seaLogistic = new SeaLogistics();
        seaLogistic.planDelivery();
    }
}
