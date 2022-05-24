package com.portfolio.domain;

import java.io.Serializable;
import javax.persistence.*;
//import lombok.Data;
import java.time.LocalDate;
import javax.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;


//@Data
@Entity
@Table(name="educacion")
public class Educacion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_educacion;
    
    @NotEmpty
    private String carrera; //50
    
    @NotEmpty
    private String institucion; //100
    
    private String descrip_educacion; //500
    
    @NotEmpty
    private String titulo; //100
    
    @NotEmpty
    private String estado; //20
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    @PastOrPresent
    private LocalDate date_educacion;
    
    public Educacion() {
    }

    public Educacion(Long id_educacion, String carrera, String institucion, String descrip_educacion, String titulo, String estado, LocalDate date_educacion) {
        this.id_educacion = id_educacion;
        this.carrera = carrera;
        this.institucion = institucion;
        this.descrip_educacion = descrip_educacion;
        this.titulo = titulo;
        this.estado = estado;
        this.date_educacion = date_educacion;
    }

    public Long getId_educacion() {
        return id_educacion;
    }

    public void setId_educacion(Long id_educacion) {
        this.id_educacion = id_educacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDescrip_educacion() {
        return descrip_educacion;
    }

    public void setDescrip_educacion(String descrip_educacion) {
        this.descrip_educacion = descrip_educacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getDate_educacion() {
        return date_educacion;
    }

    public void setDate_educacion(LocalDate date_educacion) {
        this.date_educacion = date_educacion;
    }

    @Override
    public String toString() {
        return "Educacion{" + "id_educacion=" + id_educacion + ", carrera=" + carrera + ", institucion=" + institucion + ", descrip_educacion=" + descrip_educacion + ", titulo=" + titulo + ", estado=" + estado + ", date_educacion=" + date_educacion + '}';
    }
    
}
