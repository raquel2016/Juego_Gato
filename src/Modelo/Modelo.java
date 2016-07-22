package Modelo;

/**
 *
 * @author Raquel Lugo
 */
public class Modelo {

    public Modelo() {
    }

    public String movimiento(int pos) {

        String marca;

        if (jugador == 1) {
            marca = marcarPosicion(pos, this.equiz);
            jugador = 2;
            if (obtenerGanador(this.tableroMatriz, this.equiz)) {
                this.ganador = 1;
            } else if (empate()) {
                this.ganador = 3;
            }

        } else {

            marca = marcarPosicion(pos, this.circulo);
            jugador = 1;
            if (obtenerGanador(this.tableroMatriz, this.circulo)) {
                this.ganador = 2;
            } else if (empate()) {
                this.ganador = 3;
            }

        }

        return marca;
    }

    public String marcarPosicion(int pos, String marca) {

        String aux_marca = "";

        switch (pos) {
            case 1:
                aux_marca = validarPosicion(0, 0, marca);
                break;
            case 2:
                aux_marca = validarPosicion(0, 1, marca);
                break;
            case 3:
                aux_marca = validarPosicion(0, 2, marca);
                break;
            case 4:
                aux_marca = validarPosicion(1, 0, marca);
                break;
            case 5:
                aux_marca = validarPosicion(1, 1, marca);
                break;
            case 6:
                aux_marca = validarPosicion(1, 2, marca);
                break;
            case 7:
                aux_marca = validarPosicion(2, 0, marca);
                break;
            case 8:
                aux_marca = validarPosicion(2, 1, marca);
                break;
            case 9:
                aux_marca = validarPosicion(2, 2, marca);
                break;
        }

        return aux_marca;
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

        if (tableroMatriz[0][0].equals(marca) && tableroMatriz[1][1].equals(marca) && tableroMatriz[2][2].equals(marca)) {
            return true;
        }

        if (tableroMatriz[1][1].equals(marca) && tableroMatriz[0][2].equals(marca) && tableroMatriz[2][0].equals(marca)) {
            return true;
        }

        return false;
    }

    private boolean empate() {
        int tam = this.tableroMatriz.length;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (this.tableroMatriz[i][j].equals("")) {
                    return false;
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

    public boolean getBandera_error() {
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

    public void limpiarTablero() {
        int tam = tableroMatriz.length;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                tableroMatriz[i][j] = "";
            }
        }
    }

    private int ganador = 0;
    private String equiz = "X";
    private String circulo = "O";
    private boolean bandera_error = false;
    private String tableroMatriz[][] = {{"", "", ""},
    {"", "", ""},
    {"", "", ""}
    };

    private int jugador = 1;

}
