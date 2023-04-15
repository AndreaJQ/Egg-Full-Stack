/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.pruebawebaplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author andreajalil
 */
@Controller
public class pruebawebappForm {
    
    @RequestMapping("/muestraForm")
    public String muestraFormulario(){
        return "HolaFormulario";
    }
    
    
    @RequestMapping("/muestraForm")
    public String procesarForm(){
        return "HolaNombreSpring";
    }
}
