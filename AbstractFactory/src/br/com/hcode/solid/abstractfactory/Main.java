package br.com.hcode.solid.abstractfactory;

import br.com.hcode.solid.abstractfactory.app.Application;
import br.com.hcode.solid.abstractfactory.factories.BoatTransport;
import br.com.hcode.solid.abstractfactory.factories.ITransportFactory;
import br.com.hcode.solid.abstractfactory.factories.NineNineTransport;
import br.com.hcode.solid.abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "boat";

        if(company == "uber"){
            factory = new UberTransport();
        }else if(company == "99"){
            factory = new NineNineTransport();
        }else {
            factory = new BoatTransport();
        }
        app = new Application(factory);

        return app;

    }

    public static void main(String[] args) {
	    Application app = configureApplication();
	    app.startRoute();
    }
}
