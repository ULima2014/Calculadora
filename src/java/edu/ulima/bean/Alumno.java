package edu.ulima.bean;

import java.io.Serializable;

public class Alumno implements Serializable{
    
    private int codigo;
    private String nombre;
    private String apellido;
    private int nivel;
    public Alumno() {
    }

    public Alumno(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(int codigo, String nombre, String apellido, int nivel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivel = nivel;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
}
