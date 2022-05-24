package com.portfolio.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
//import lombok.Data;
import java.time.LocalDate;
import javax.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

//@Data
@Entity
@Table(name="experiencia")
public class Experiencia implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_experiencia;
    
    @NotEmpty
    private String nombre_experiencia; //100
    
    private String puesto; //100
    
    private String lugar; //100
    
    private String descrip_experiencia; //500
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    @PastOrPresent
    private LocalDate date_experiencia;
    
    public Experiencia() {
    }

    public Experiencia(Long id_experiencia, String nombre_experiencia, String puesto, String lugar, String descrip_experiencia, LocalDate date_experiencia) {
        this.id_experiencia = id_experiencia;
        this.nombre_experiencia = nombre_experiencia;
        this.puesto = puesto;
        this.lugar = lugar;
        this.descrip_experiencia = descrip_experiencia;
        this.date_experiencia = date_experiencia;
    }

    public Long getId_experiencia() {
        return id_experiencia;
    }

    public void setId_experiencia(Long id_experiencia) {
        this.id_experiencia = id_experiencia;
    }

    public String getNombre_experiencia() {
        return nombre_experiencia;
    }

    public void setNombre_experiencia(String nombre_experiencia) {
        this.nombre_experiencia = nombre_experiencia;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescrip_experiencia() {
        return descrip_experiencia;
    }

    public void setDescrip_experiencia(String descrip_experiencia) {
        this.descrip_experiencia = descrip_experiencia;
    }

    public LocalDate getDate_experiencia() {
        return date_experiencia;
    }

    public void setDate_experiencia(LocalDate date_experiencia) {
        this.date_experiencia = date_experiencia;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id_experiencia=" + id_experiencia + ", nombre_experiencia=" + nombre_experiencia + ", puesto=" + puesto + ", lugar=" + lugar + ", descrip_experiencia=" + descrip_experiencia + ", date_experiencia=" + date_experiencia + '}';
    }
    
}
