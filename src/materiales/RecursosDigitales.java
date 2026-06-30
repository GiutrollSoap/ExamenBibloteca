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
public class RecursosDigitales extends Materiales{

    
    private String formato;
    private int tamaño;
    private String enlace = null;

    public RecursosDigitales(String codigo, String título, String autor, LocalDate fechaPublicación, int categoria, String disponibilidad) {
        super(codigo, título, autor, fechaPublicación, categoria, disponibilidad);
    }

   

    public String getFormato() {
        return formato;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    
}
