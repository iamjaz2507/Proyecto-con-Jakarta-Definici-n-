package com.investigacion.domain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


@Named
@RequestScoped
public class Investigacion {

    private String titulo;
    private String descripcion;
    private String referencia;
    private String foto;  

    public Investigacion() {
        this.titulo = "Investigación Científica";
        this.descripcion = "La investigación científica es un procedimiento de reflexión, control y crítica que busca aportar nuevos datos, hechos, relaciones o leyes en cualquier ámbito del conocimiento científico.\n";
        this.referencia = "https://concepto.de/investigacion-cientifica/";
        this.foto = "/src/main/webapp/resource/images/investigacion.jpg"; 
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
