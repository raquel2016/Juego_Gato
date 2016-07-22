
package Modelo;
import java.util.Observable;

/**
 *
 * @author Raquel Lugo
 */
public class Modelo extends Observable  {
    
    
    public Modelo(){
        for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
           tableroMatriz[i][j] = "";
          }
        }
    }
    
    public String movimiento(int pos){
       
        String marca = "";
        
        if(jugador == 1){
          
        }
        
        return marca;
    }
    
    public String marcarPosicion(int pos, String marca){
             
          String aux_marca = "";
          
          switch(pos){
          
              case 1: break;
              case 2: break;
              case 3: break;
              case 4: break;
              case 5: break;
              case 6: break;
              case 7: break;
              case 8: break;
              case 9: break;
               
          }
                  
         return marca;
    }
    
    public String validarPosicion(int i, int j, String marca){
     
        return marca;
    }
    
    
    public boolean obtenerGanador(){
      
        return true;
    }
    
    
    
    
    
    
    
    
    
    public void setBandera_error(boolean bandera_error) {
        this.bandera_error = bandera_error;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public void setGanador(int ganador) {
        this.ganador = ganador;
    }

    public void setEquiz(String equiz) {
        this.equiz = equiz;
    }

    public void setCirculo(String circulo) {
        this.circulo = circulo;
    }

    public boolean isBandera_error() {
        return bandera_error;
    }

    public int getJugador() {
        return jugador;
    }

    public int getGanador() {
        return ganador;
    }

    public String getEquiz() {
        return equiz;
    }

    public String getCirculo() {
        return circulo;
    }
    
    
    private int ganador = 0;
    private String equiz = "X";
    private String circulo = "O";
    private boolean bandera_error = false;
    private String tableroMatriz[][];
    private int jugador = 1;
    
}
