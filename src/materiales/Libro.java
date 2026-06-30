/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materiales;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Libro extends Materiales {
    
  
    private int cantTotal;
    private String editorial;
    private int numpaginas;

    public Libro(String codigo, String título, String autor, LocalDate fechaPublicación, int categoria, String disponibilidad) {
        super(codigo, título, autor, fechaPublicación, categoria, disponibilidad);
    }

    public int getCantTotal() {
        return cantTotal;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setCantTotal(int cantTotal) {
        this.cantTotal = cantTotal;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }
    
    public String verificarEspacio(String cantTotal){
      return cantTotal;  
    }
public int RegistroTotal(){
    Scanner teclado =new Scanner (System.in);
   
        return cantTotal;
    
}
    public void registroEditorial (String editorial){
        System.out.println("Digite la Editorial");
        Scanner teclado =new Scanner (System.in);
        editorial =teclado;
        System.out.println("La editorial registrada es: "+ editorial);
        
       
    }
}
