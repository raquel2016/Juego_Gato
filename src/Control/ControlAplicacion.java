
package Control;

import Modelo.Modelo;

/**
 *
 * @author Raquel Lugo
 */
public class ControlAplicacion {
    public ControlAplicacion(Modelo nuevosDatos) {
        datos = nuevosDatos;
    }

    public ControlAplicacion() {
        this.datos = new Modelo();
    }
    
    public int getGanador(){
        return datos.getGanador();
    }
    
    public boolean casillaOcupada(){
       return datos.getBandera_error();
    }
    
    public String movimiento(int posicion){
       return datos.movimiento(posicion);
    }
    
    public void limpiarTablero(){
       datos.limpiarTablero();
    }
    
    public void setError(boolean valor){
       datos.setBandera_error(valor);
    }
    
    public void setGanador(int valor){
       datos.setGanador(valor);
    }
    
    public void setJugador(int valor){
       datos.setJugador(valor);
    }
    
    
    private Modelo datos;
    
}
