/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Student
 */
public class Actividad {
    
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private int cupomax;

    public Actividad(String nombre, LocalDate fecha, LocalTime hora, int cupomax) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.cupomax = cupomax;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getCupomax() {
        return cupomax;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setCupomax(int cupomax) {
        this.cupomax = cupomax;
    }
    
public void verificarCuposLibres(int cupomax){
    boolean TieneCampo;
    if(cupomax==0){
        TieneCampo = false; 
    }
   TieneCampo=true;
}

}
