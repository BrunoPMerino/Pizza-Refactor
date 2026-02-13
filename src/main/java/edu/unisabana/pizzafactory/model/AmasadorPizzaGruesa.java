package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.factory.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO,
                        "[@@] Amasando la pizza gruesa (masa tipo pan, mayor hidratacion y tiempo).");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
