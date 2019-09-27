/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author s109e17
 */
public class Contacto {
    
    String nomContacto;
    long telContacto;
    String correoContacto;
    
    public Contacto(String nomContacto, long telContacto, String correoContacto){
    this.nomContacto = nomContacto;
    this.telContacto = telContacto;
    this.correoContacto = correoContacto;           
       
    }

    public String getNomContacto() {
        return nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public long getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(long telContacto) {
        this.telContacto = telContacto;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }
}

