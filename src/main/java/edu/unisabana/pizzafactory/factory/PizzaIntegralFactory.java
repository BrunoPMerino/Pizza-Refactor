package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaIntegral;

public class PizzaIntegralFactory implements PizzaFactory {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }
}
