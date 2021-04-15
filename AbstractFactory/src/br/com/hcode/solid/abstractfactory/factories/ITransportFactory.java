package br.com.hcode.solid.abstractfactory.factories;

import br.com.hcode.solid.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.solid.abstractfactory.boats.IBoat;
import br.com.hcode.solid.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
