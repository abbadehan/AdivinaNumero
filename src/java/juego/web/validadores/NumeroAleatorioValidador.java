/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.web.validadores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author SISTEMAS
 */
@FacesValidator("miValidador")
public class NumeroAleatorioValidador implements  Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        System.out.println(" valido valor "+value ); 
        System.out.println(" valido valor "+value.getClass() ); 
        Integer valor = (Integer) value;
       if (valor <=0 || valor > 20){
           throw new ValidatorException(
                   new FacesMessage("El numero debe ir de 1 a 20")
           );
       }
    }
    
}
