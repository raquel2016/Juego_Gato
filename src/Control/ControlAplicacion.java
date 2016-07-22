/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        this(new Modelo());
    }
    
    private Modelo datos;
    
}
