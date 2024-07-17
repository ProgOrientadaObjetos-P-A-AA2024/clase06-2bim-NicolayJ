/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {

        String[] ciudades = {"Quito", "Guayaquil", "Manta", "Machala"};
        int[] poblaciones = {245000, 345000, 125001, 45300};
        Enlace c = new Enlace();
        
        for (int i = 0; i < ciudades.length; i++) {
            Ciudad ciudad = new Ciudad(ciudades[i], poblaciones[i]);
            c.insertarCiudad(ciudad);
        }

        for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
            System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }
    }
}
