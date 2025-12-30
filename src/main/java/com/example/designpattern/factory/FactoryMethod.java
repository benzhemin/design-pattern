package com.example.designpattern.factory;

interface Transport {
  void deliver();
}

// Delivery by truck
class Truck implements Transport {
  @Override
  public void deliver() {
    System.out.println("Truck delivering");
  }
}

// Delivery by ship
class Ship implements Transport {
  @Override
  public void deliver() {
    System.out.println("Ship delivering");
  }
}

// Abstract class define behavior of factory method
// Concrete classes implement the factory method to create objects
abstract class Logistics {
  public abstract Transport createTransport();

  public void planDelivery() {
    Transport transport = createTransport();
    transport.deliver();
  }
}

class RoadLogistics extends Logistics {
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

public class FactoryMethod {

  public static void main(String[] args) {
    Logistics logistics = new RoadLogistics();
    logistics.planDelivery();

    logistics = new SeaLogistics();
    logistics.planDelivery();
  }
}
