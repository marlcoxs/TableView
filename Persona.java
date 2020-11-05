/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableViewSimple;

/**
 *
 * @author FP Mañana A
 */
public class Persona {
     String nombres,apellido,email;

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(String nombre, String apellido, String email) {
        this.nombres = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
}
