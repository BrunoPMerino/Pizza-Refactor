package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaGruesa;

public class PizzaGruesaFactory implements PizzaFactory {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }
}
