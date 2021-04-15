package br.com.hcode.builder;

import br.com.hcode.builder.builders.CarBuilder;
import br.com.hcode.builder.builders.TruckBuilder;
import br.com.hcode.builder.cars.Car;
import br.com.hcode.builder.cars.Truck;
import br.com.hcode.builder.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getresult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhão: " +truck.result());

    }
}
