package com.spring.formapi.domain.models;

public class User {
    private String titulo;
    private String nombre;
    private String apellido;
 
    public User() {
    }
 
    public User(String titulo, String nombre, String apellido) {
       this.titulo = titulo;
       this.nombre = nombre;
       this.apellido = apellido;
    }
 
    public String getTitulo() {
       return this.titulo;
    }
 
    public void setTitulo(String titulo) {
       this.titulo = titulo;
    }
 
    public String getNombre() {
       return this.nombre;
    }
 
    public void setNombre(String nombre) {
       this.nombre = nombre;
    }
 
    public String getApellido() {
       return this.apellido;
    }
 
    public void setApellido(String apellido) {
       this.apellido = apellido;
    }
 }
