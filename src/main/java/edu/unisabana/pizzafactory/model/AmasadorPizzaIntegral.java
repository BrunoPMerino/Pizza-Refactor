package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.factory.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaIntegral implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO,
                        "[@@] Amasando la pizza integral (harina integral, mayor elasticidad).");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
