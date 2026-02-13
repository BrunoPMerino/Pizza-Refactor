package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.factory.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
                .log(Level.INFO,
                        "[~~] Horneando pizza integral (control de humedad y temperatura).");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
