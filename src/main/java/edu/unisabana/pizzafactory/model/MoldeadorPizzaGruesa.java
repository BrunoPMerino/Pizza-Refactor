package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.factory.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements Moldeador {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO,
                        "[O] Moldeando pizza pequena gruesa (base mas alta y esponjosa).");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO,
                        "[O] Moldeando pizza mediana gruesa (mayor espesor).");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
