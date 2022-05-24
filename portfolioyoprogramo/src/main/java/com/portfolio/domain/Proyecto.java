package com.portfolio.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
//import lombok.Data;
import java.time.LocalDate;
import javax.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;


//@Data
@Entity
@Table(name="proyecto")
public class Proyecto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proyecto;
    
    @NotEmpty
    private String name_proyecto; //50
    
    @NotEmpty
    private String estado; // 20
    
    private String descrip_proyecto; //500
    
    private String link_proyecto; //1000
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    @PastOrPresent
    private LocalDate date_proyecto;
    
    //@Lob
    //private byte [] imagen;
    private String imagen_proyecto;
    
    public Proyecto() {
    }

    public Proyecto(Long id_proyecto, String name_proyecto, String estado, String descrip_proyecto, String link_proyecto, LocalDate date_proyecto, String imagen_proyecto) {
        this.id_proyecto = id_proyecto;
        this.name_proyecto = name_proyecto;
        this.estado = estado;
        this.descrip_proyecto = descrip_proyecto;
        this.link_proyecto = link_proyecto;
        this.date_proyecto = date_proyecto;
        this.imagen_proyecto = imagen_proyecto;
    }

    public Long getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Long id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getName_proyecto() {
        return name_proyecto;
    }

    public void setName_proyecto(String name_proyecto) {
        this.name_proyecto = name_proyecto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescrip_proyecto() {
        return descrip_proyecto;
    }

    public void setDescrip_proyecto(String descrip_proyecto) {
        this.descrip_proyecto = descrip_proyecto;
    }

    public String getLink_proyecto() {
        return link_proyecto;
    }

    public void setLink_proyecto(String link_proyecto) {
        this.link_proyecto = link_proyecto;
    }

    public LocalDate getDate_proyecto() {
        return date_proyecto;
    }

    public void setDate_proyecto(LocalDate date_proyecto) {
        this.date_proyecto = date_proyecto;
    }
    
    @Override
    public String toString() {
        return "Proyecto{" + "id_proyecto=" + id_proyecto + ", name_proyecto=" + name_proyecto + ", estado=" + estado + ", descrip_proyecto=" + descrip_proyecto + ", link_proyecto=" + link_proyecto + ", date_proyecto=" + date_proyecto + '}';
    }

    public String getImagen_proyecto() {
        return imagen_proyecto;
    }

    public void setImagen_proyecto(String imagen_proyecto) {
        this.imagen_proyecto = imagen_proyecto;
    }
    
}
