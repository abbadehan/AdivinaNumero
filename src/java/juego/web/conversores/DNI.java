/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.web.conversores;

import java.io.Serializable;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author SISTEMAS
 */

public class DNI implements Serializable {
    private String numeros;
    private String letra;

    public DNI(String numeros, String letra) {
        this.numeros = numeros;
        this.letra = letra;
    }

    public String getNumeros() {
        return numeros;
    }

    public String getLetra() {
        return letra;
    }

    @Override
    public String toString() {
        return "DNI{" + "numeros=" + numeros + ", letra=" + letra + '}';
    }
    
}
