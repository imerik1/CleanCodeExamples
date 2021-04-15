package br.com.hcode.builder.builders;

import br.com.hcode.builder.cars.Car;
import br.com.hcode.builder.cars.Truck;
import br.com.hcode.builder.components.CarType;
import br.com.hcode.builder.components.Engine;
import br.com.hcode.builder.components.Transmission;

public class TruckBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;



    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(String color) {
    }

    public Truck getresult(){
        return new Truck(carType, seats, engine, transmission);
    }
}
