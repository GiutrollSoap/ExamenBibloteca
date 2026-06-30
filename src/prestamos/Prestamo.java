/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamos;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Prestamo {
    private Usuario usuario;
    private Material material;
    private LocalDate fechaPrestamo;
    private LocalDate fechaMax;
    private LocalDate fechaDevolucion;
    private boolean estaAtrasado;
    private String diasAtrasado;

    public Prestamo(Usuario usuario, Material material, LocalDate fechaPrestamo, LocalDate fechaMax, LocalDate fechaDevolucion, boolean estaAtrasado, int diasAtrasado) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaMax = fechaMax;
        this.fechaDevolucion = null;
        this.estaAtrasado = false;
        this.diasAtrasado = "0";
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaMax() {
        return fechaMax;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isEstaAtrasado() {
        return estaAtrasado;
    }

    public String getDiasAtrasado() {
        return diasAtrasado;
    }

   

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaMax(LocalDate fechaMax) {
        this.fechaMax = fechaMax;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

 
    
    
    
    private void calcularSiAtraso(LocalDate fechaMax,boolean estaAtrasado){
        if(fechaMax.isAfter(LocalDate.now())){
           estaAtrasado = true;
        }
         estaAtrasado = false;
    }
    
    private void calcularDiasAtraso(LocalDate fechaMax,String diasAtrasado){
        if(fechaMax.isAfter(LocalDate.now())){
            diasAtrasado=fechaMax.until(LocalDate.now()).toString();
        }
    }

    @Override
    public String toString() {
        return "Prestamo{" + "usuario=" + usuario + ", material=" + material + ",Se hizo el prestamo=" + fechaPrestamo + ", Maxima fecha a devolver=" + fechaMax + ", Dia que devolvio=" + fechaDevolucion + ",Esta Atrasado?=" + estaAtrasado + ", Tiene dias de atraso" + diasAtrasado + '}';
    }
    
    
    
}
