package gato;

import Control.ControlAplicacion;
import Vista.Ventana;

/**
 *
 * @author Raquel Lugo
 */
public class Gato {

    public static void main(String args[]) {
        Gato interfaz = new Gato();
        interfaz.mostrarInterfaz("Juego Gato");
    }
    
    public void mostrarInterfaz(String s) {
        ControlAplicacion gestor = new ControlAplicacion();
        Ventana vistaPrincipal = new Ventana(s, gestor);
        vistaPrincipal.iniciar_vista();
        vistaPrincipal.setVisible(true);
    }
}
