/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.web.beans;

import java.util.Date;
import java.util.Random;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import juego.web.conversores.DNI;

/**
 *
 * @author SISTEMAS
 */
@Named(value = "adivina")
@RequestScoped //ambito request
public class AdivinaManagedBean {
//atributos
   private  int numeroAdivinar ; //tiene un atributo 0 y si es un String es null  y si es boolean es false automaticamente si no lo indicamos
   private int numero=5; //es el numero que intrducimos nosotros, si no introduzco nada va a ser 0
   private boolean ganador; //para saber si he ganado o no en la pagina resultado
   private Date fecha; //
  private DNI miDni;
    public AdivinaManagedBean() {
        System.out.println("....instanciando un nuevo AdivinaManagedBean....");
       
    }
    //si no hacemos un get la propiedad numeroAdivinar no es localizado en la parte xhtml

    public int getNumeroAdivinar() {
        System.out.println(".... estoy en getNumeroAdivinar");
        return numeroAdivinar;
    }

    public int getNumero() {
          System.out.println(".... estoy en getNumero");
        return numero;
    }

    public void setNumero(int numero) {
        System.out.println("....se necesita el set para introducirlo en index.xhtml");
        this.numero = numero;
    }

    public boolean isGanador() {
        return ganador;
    }

 

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMiDni(DNI miDni) {
        this.miDni = miDni;
    }

    public DNI getMiDni() {
        return miDni;
    }
    
    
    //ACTION
    public String adivinar(){
//        Random random= new Random();        
//        this.numeroAdivinar= random.nextInt(20)+1;// me devuelve un numero del 1 al 20
        System.out.println(".....adivinar....");
        if (numeroAdivinar ==numero){
            ganador=true;
        }
        return "resultado"; //vista a renderizar
    }
}
