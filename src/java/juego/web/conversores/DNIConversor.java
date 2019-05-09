
package juego.web.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

//@FacesConverter("DNIConversor")
@FacesConverter(forClass =DNI.class) 
public class DNIConversor implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
         if (value ==null ||  value.trim().length() <9 ){
            throw new ConverterException ("No se puede convertir a DNI el formato debe ser 8 digitos y 1 letra");
            
        }
                String numeros = value.substring(0,8);
                String letra = value.substring(8,9);
                DNI dni = new DNI  (numeros, letra);
                return dni;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
       
        DNI dni = (DNI) value;
        return dni.getNumeros()+dni.getLetra();
    }
    
}
