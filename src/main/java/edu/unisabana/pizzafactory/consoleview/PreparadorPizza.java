package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.factory.*;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {

    private final PizzaFactory factory;

    public PreparadorPizza(PizzaFactory factory) {
        this.factory = factory;
    }

    public static void main(String args[]) {
        try {
            Ingrediente[] ingredientes = new Ingrediente[]{
                    new Ingrediente("queso", 1),
                    new Ingrediente("jamon", 2)
            };


            // PizzaFactory factory = new PizzaDelgadaFactory();
            PizzaFactory factory = new PizzaGruesaFactory();
            // PizzaFactory factory = new PizzaIntegralFactory();

            PreparadorPizza pp = new PreparadorPizza(factory);
            pp.prepararPizza(ingredientes, Tamano.MEDIANO);

        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName())
                    .log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
    }

    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {

        Amasador am = factory.crearAmasador();
        Moldeador mp = factory.crearMoldeador();
        Horneador h = factory.crearHorneador();

        am.amasar();

        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de pizza invalido:" + tam);
        }

        aplicarIngredientes(ingredientes);
        h.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}",
                        Arrays.toString(ingredientes));

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
