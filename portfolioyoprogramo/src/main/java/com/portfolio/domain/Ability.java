package com.portfolio.domain;

import java.io.Serializable;
import javax.persistence.*;
//import lombok.Data;
import javax.validation.constraints.NotEmpty;


//@Data
@Entity
@Table(name="ability")
public class Ability implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_habilidad;
    
    @NotEmpty
    private String habilidad; //50
    
    @NotEmpty
    private String grado_dominio; //50

    public Ability() {
    }

    public Ability(Long id_habilidad, String habilidad, String grado_dominio) {
        this.id_habilidad = id_habilidad;
        this.habilidad = habilidad;
        this.grado_dominio = grado_dominio;
    }

    public Long getId_habilidad() {
        return id_habilidad;
    }

    public void setId_habilidad(Long id_habilidad) {
        this.id_habilidad = id_habilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getGrado_dominio() {
        return grado_dominio;
    }

    public void setGrado_dominio(String grado_dominio) {
        this.grado_dominio = grado_dominio;
    }

    @Override
    public String toString() {
        return "Ability{" + "id_habilidad=" + id_habilidad + ", habilidad=" + habilidad + ", grado_dominio=" + grado_dominio + '}';
    }

    
}
