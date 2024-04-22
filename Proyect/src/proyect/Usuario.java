/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author HP
 */
public class Usuario {
    private String Nombre;
    private String apellido;
    private int ID;

    public Usuario() {
    }

    public Usuario(String Nombre, String Apellido, int ID) {
        this.Nombre = Nombre;
        this.apellido= Apellido;
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return  "NOMBRE  " + Nombre +"\n"+
                "APELLIDO " + apellido + "\n"+
                "ID " + ID ;
    }
    
    
    
}
