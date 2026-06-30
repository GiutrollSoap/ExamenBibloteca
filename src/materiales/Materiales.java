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
    private LocalDate Cumpleaños;
    private String telefono;
    private String correo;
    private String dirección;

    public Materiales(String codigo, LocalDate Cumpleaños, String telefono, String correo, String dirección) {
        this.codigo = codigo;
        this.Cumpleaños = Cumpleaños;
        this.telefono = telefono;
        this.correo = correo;
        this.dirección = dirección;
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getCumpleaños() {
        return Cumpleaños;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCumpleaños(LocalDate Cumpleaños) {
        this.Cumpleaños = Cumpleaños;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    
}
