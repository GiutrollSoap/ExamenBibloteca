/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materiales;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public abstract class Materiales {
    private String codigo;
    private String título;
    private String autor;
    private LocalDate fechaPublicación;
    private int categoria;
    private String disponibilidad;

    public Materiales(String codigo, String título, String autor, LocalDate fechaPublicación, int categoria, String disponibilidad) {
        this.codigo = codigo;
        this.título = título;
        this.autor = autor;
        this.fechaPublicación = fechaPublicación;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFechaPublicación() {
        return fechaPublicación;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaPublicación(LocalDate fechaPublicación) {
        this.fechaPublicación = fechaPublicación;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

  
    
    
}
