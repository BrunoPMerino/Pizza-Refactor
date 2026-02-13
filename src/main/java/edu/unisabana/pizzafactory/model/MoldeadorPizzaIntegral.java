package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.factory.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaIntegral implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO,
                        "[O] Moldeando pizza pequena integral (base rustica).");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaIntegral.class.getName())
                .log(Level.INFO,
                        "[O] Moldeando pizza mediana integral (base rustica mediana).");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
