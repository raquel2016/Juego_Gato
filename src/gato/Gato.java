package gato;

import Control.ControlAplicacion;
import Vista.Ventana;

/**
 *
 * @author Raquel Lugo
 */
public class Gato {

    public static void main(String args[]) {
        ControlAplicacion gestor = new ControlAplicacion();
        Ventana vistaPrincipal = new Ventana("Juego Gato", gestor);
        vistaPrincipal.iniciar_vista();
        vistaPrincipal.setVisible(true);

    }
}
