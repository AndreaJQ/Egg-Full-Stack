/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author andreajalil
 */
public class Ciudad {
    private Integer cp;
    private String ciudad;

    public Ciudad() {
    }

    public Ciudad(Integer cp, String ciudad) {
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "cp=" + cp + ", ciudad=" + ciudad + '}';
    }
    

    
    
}
