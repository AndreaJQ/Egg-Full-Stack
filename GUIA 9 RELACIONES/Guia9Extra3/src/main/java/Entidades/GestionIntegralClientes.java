/*
En este módulo vamos a registrar la información personal de cada cliente que posea 
pólizas en nuestra empresa. Nombre y apellido, documento, mail, domicilio, teléfono.
*/
package Entidades;

import java.util.HashMap;

/**
 *
 * @author andreajalil
 */
public class GestionIntegralClientes {
    private String Nombre, Apellido, mail;
    private Integer Dni, telefono;
    private HashMap<String, Integer> domicilio;

    public GestionIntegralClientes() {
    }

    public GestionIntegralClientes(String Nombre, String Apellido, String mail, Integer Dni, Integer telefono, HashMap<String, Integer> domicilio) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.mail = mail;
        this.Dni = Dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getDni() {
        return Dni;
    }

    public void setDni(Integer Dni) {
        this.Dni = Dni;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public HashMap<String, Integer> getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(HashMap<String, Integer> domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "GestionIntegralClientes{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", mail=" + mail + ", Dni=" + Dni + ", telefono=" + telefono + ", domicilio=" + domicilio + '}';
    }
    
    
    
}
