package br.com.hcode.solid.abstractfactory.boats;

public class Boat implements IBoat {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a viagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Cruzando o Atlântico!");
    }
}
