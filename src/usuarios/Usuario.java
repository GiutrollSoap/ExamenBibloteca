package usuarios;

import java.time.LocalDate;
import java.time.Period;

public abstract class Usuario {
    private int id;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String correoElectronico;
    private String direccion;

    public Usuario(int id, LocalDate fechaNacimiento, String telefono, String correoElectronico, String direccion) {
      this.id = id;
      this.fechaNacimiento = fechaNacimiento;
      this.telefono = telefono;
      this.correoElectronico = correoElectronico;
      this.direccion = direccion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

  
    public boolean esMayorDeEdad() {
       if (this.fechaNacimiento != null) {
         int edad = Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
          System.out.println("edad calcualda: " + edad + " años");
          return edad >= 18;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", direccion=" + direccion + '}';
    }
    
}

