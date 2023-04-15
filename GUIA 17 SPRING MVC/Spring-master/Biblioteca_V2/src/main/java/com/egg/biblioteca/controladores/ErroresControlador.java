
package com.egg.biblioteca.controladores;

import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ErroresControlador implements ErrorController {

    //el REQUESTMAPPING ESTÁ A NIVEL DEL MÉTODO, NO DE LA CLASE
    //que entre todo recurso con "/error" va a ingresar en el metodo.
    //recuperamos el código de error que viene del servidor
    @RequestMapping(value = "/error", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView renderErrorPage(HttpServletRequest httpRequest) {
//trabaja como un modelmap solo que este retorna el modelo y la vista
        //recibe una petición httpRequest
        //en base a eso creamos una pagina de error (es el html)
        ModelAndView errorPage = new ModelAndView("error");

        //inicializar el error
        String errorMsg = "";
        //el entero en base al error que genere
                                //traemos el error con un metodo ->abajo
        int httpErrorCode = getErrorCode(httpRequest);

        //según el error
        switch (httpErrorCode) {
            case 400: {
                errorMsg = "El recurso solicitado no existe.";
                break;
            }
            case 403: {
                errorMsg = "No tiene permisos para acceder al recurso.";
                break;
            }
            case 401: {
                errorMsg = "No se encuentra autorizado.";
                break;
            }
            case 404: {
                errorMsg = "El recurso solicitado no fue encontrado.";
                break;
            }
            case 500: {
                errorMsg = "Ocurrió un error interno.";
                break;
            }
        }

        //inyección
        errorPage.addObject("codigo", httpErrorCode);
        errorPage.addObject("mensaje", errorMsg);
        return errorPage;
    }

    //recibe la peticion, trae el atributo del codigo y lo castea en un Integer
    private int getErrorCode(HttpServletRequest httpRequest) {
        return (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
    }


    public String getErrorPath() {
        return "/error.html";
    }

}