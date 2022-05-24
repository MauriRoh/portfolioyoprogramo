package com.portfolio.domain;

import java.io.Serializable;
import javax.persistence.*;
//import lombok.Data;
import javax.validation.constraints.NotEmpty;


//@Data
@Entity
@Table(name="idioma")
public class Idioma implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_idioma;
    
    @NotEmpty
    private String name_idioma; //50
    
    @NotEmpty
    private String oral; //10
    
    @NotEmpty
    private String escrito; //10

    public Idioma() {
    }

    public Idioma(Long id_idioma, String name_idioma, String oral, String escrito) {
        this.id_idioma = id_idioma;
        this.name_idioma = name_idioma;
        this.oral = oral;
        this.escrito = escrito;
    }

    public Long getId_idioma() {
        return id_idioma;
    }

    public void setId_idioma(Long id_idioma) {
        this.id_idioma = id_idioma;
    }

    public String getName_idioma() {
        return name_idioma;
    }

    public void setName_idioma(String name_idioma) {
        this.name_idioma = name_idioma;
    }

    public String getOral() {
        return oral;
    }

    public void setOral(String oral) {
        this.oral = oral;
    }

    public String getEscrito() {
        return escrito;
    }

    public void setEscrito(String escrito) {
        this.escrito = escrito;
    }

    @Override
    public String toString() {
        return "Idioma{" + "id_idioma=" + id_idioma + ", name_idioma=" + name_idioma + ", oral=" + oral + ", escrito=" + escrito + '}';
    }
    
}
