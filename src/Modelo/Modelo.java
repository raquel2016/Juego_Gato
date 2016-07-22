package Modelo;

import java.util.Observable;

/**
 *
 * @author Raquel Lugo
 */
public class Modelo {

    public Modelo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tableroMatriz[i][j] = "";
            }
        }
    }

    public String movimiento(int pos) {

        String marca = "";

        if (jugador == 1) {
            marca = marcarPosicion(pos, this.equiz);
            jugador = 2;
            if (obtenerGanador(this.tableroMatriz, this.equiz)) {
                this.ganador = 1;
            } //falta cuando no hay gane, empate

        } else {

            marca = marcarPosicion(pos, this.circulo);
            jugador = 1;
            if (obtenerGanador(this.tableroMatriz, this.circulo)) {
                this.ganador = 2;
            } //falta cuando no hay gane, empate

        }

        return marca;
    }

    public String marcarPosicion(int pos, String marca) {

        String aux_marca = "";

        switch (pos) {
            case 1:
                validarPosicion(0, 0, marca);
                break;
            case 2:
                validarPosicion(0, 0, marca);
                break;
            case 3:
                validarPosicion(0, 0, marca);
                break;
            case 4:
                validarPosicion(0, 0, marca);
                break;
            case 5:
                validarPosicion(0, 0, marca);
                break;
            case 6:
                validarPosicion(0, 0, marca);
                break;
            case 7:
                validarPosicion(0, 0, marca);
                break;
            case 8:
                validarPosicion(0, 0, marca);
                break;
            case 9:
                validarPosicion(0, 0, marca);
                break;
        }

        return marca;
    }

    //Verifica que la casilla seleccionada este disponible
    private String validarPosicion(int i, int j, String marca) {

        String aux = "";
        this.bandera_error = false;

        if (this.tableroMatriz[i][j].equals("")) {
            tableroMatriz[i][j] = marca;
            aux = marca;
        } else {
            aux = this.tableroMatriz[i][j];
            this.bandera_error = true;
        }

        return aux;
    }

    //Obtiene ganador cuando encuentra 3 en raya, en filas, colums o diagonales
    public boolean obtenerGanador(String gato[][], String marca) {

        int tamanio = gato.length;

        for (int j = 0; j < tamanio; j++) {
            int cont = 0;
            for (int i = 0; i < tamanio; i++) {
                if (gato[i][j].equals(marca)) {
                    cont++;
                }
                if (cont == 3) {
                    return true;
                }
            }
        }

        for (int i = 0; i < tamanio; i++) {
            int cont = 0;
            for (int j = 0; j < tamanio; j++) {
                if (gato[i][j].equals(marca)) {
                    cont++;
                }
                if (cont == 3) {
                    return true;
                }
            }
        }

        for (int i = 0; i < tamanio; i++) {
            int cont = 0;
            for (int j = 0; j < tamanio; j++) {
                if (i == j) {
                    if (gato[i][j].equals(marca)) {
                        cont++;
                    }
                    if (cont == 3) {
                        return true;
                    }
                }
            }
        }

        for (int i = tamanio; i > 0; i--) {
            int cont = 0;
            for (int j = tamanio; j > 0; j--) {
                if (i == j) {
                    if (gato[i][j].equals(marca)) {
                        cont++;
                    }
                    if (cont == 3) {
                        return true;
                    }
                }
            }
        }

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

    public String getJugador() {
        return (this.jugador == 1) ? "Primer Jugador 'X'" : "Segundo Jugador 'O'";
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
