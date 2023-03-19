package com.ap.ap.models;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;

@Data
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String fotoPerfil;
    private String email;

    private String localidad;

    private String fechaNac;

    private String fotoHeader;

    private String profesionHeader;

    private String password;

    public  Usuario(){}

    public Usuario(String nombre , String email , String password){
        this.nombre = nombre;
        this.email = email;
        this.password= password;

    }
}