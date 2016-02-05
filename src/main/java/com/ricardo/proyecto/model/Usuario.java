package com.ricardo.proyecto.model;

import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ricardotoledo
 */
@Entity
@Table(name="Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="usuario_id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apepat")
    private String apepat;
    @Column(name="apemat")
    private String apemat;
    private static final Logger LOG = Logger.getLogger(Usuario.class.getName());

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apepat, String apemat) {
        this.id = id;
        this.nombre = nombre;
        this.apepat = apepat;
        this.apemat = apemat;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }
    
    
}
