package edu.unisabana.pizzafactory.factory;

public interface PizzaFactory {
    Amasador crearAmasador();
    Moldeador crearMoldeador();
    Horneador crearHorneador();
}
