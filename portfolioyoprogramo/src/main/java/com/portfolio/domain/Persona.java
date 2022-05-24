package com.portfolio.domain;

import java.io.Serializable;
import javax.persistence.*;
//import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;

//@Data
@Entity
@Table(name="persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    
    @NotEmpty
    private String apellido; //45
    
    @NotEmpty
    private String nombre; //45
    
    @NotEmpty
    @Email
    private String email; //45
    
    @NotEmpty
    private String dni; //8
    
    private String telefono; //20
    //private img imagen;
    
    public Persona() {
    }
    
    public Persona(Long id_persona, String apellido, String nombre, String email, String dni, String telefono) {
        this.id_persona = id_persona;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_persona=" + id_persona + ", apellido=" + apellido + ", nombre=" + nombre + ", email=" + email + ", dni=" + dni + ", telefono=" + telefono + '}';
    }
    
}
