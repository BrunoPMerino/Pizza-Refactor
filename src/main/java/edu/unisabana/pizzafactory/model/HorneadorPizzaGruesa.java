package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.factory.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaGruesa implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaGruesa.class.getName())
                .log(Level.INFO,
                        "[~~] Horneando pizza gruesa (temperatura moderada y mayor tiempo).");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
