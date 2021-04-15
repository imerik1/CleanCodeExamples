package br.com.hcode.builder.cars;

import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;

public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final String color;

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission, String color){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getCarType(){
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
