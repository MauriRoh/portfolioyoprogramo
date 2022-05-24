package com.portfolio.domain;

import java.io.Serializable;
import javax.persistence.*;
//import lombok.Data;
import javax.validation.constraints.NotEmpty;


//@Data
@Entity
@Table(name="profesion")
public class Profesion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profesion;
    
    @NotEmpty
    private String descrip_profesion; //500

    public Profesion() {
    }

    public Profesion(Long id_profesion, String descrip_profesion) {
        this.id_profesion = id_profesion;
        this.descrip_profesion = descrip_profesion;
    }

    public Long getId_profesion() {
        return id_profesion;
    }

    public void setId_profesion(Long id_profesion) {
        this.id_profesion = id_profesion;
    }

    public String getDescrip_profesion() {
        return descrip_profesion;
    }

    public void setDescrip_profesion(String descrip_profesion) {
        this.descrip_profesion = descrip_profesion;
    }

    @Override
    public String toString() {
        return "Profesion{" + "id_profesion=" + id_profesion + ", descrip_profesion=" + descrip_profesion + '}';
    }
    
}
