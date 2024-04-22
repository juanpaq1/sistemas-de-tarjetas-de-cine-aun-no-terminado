/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author HP
 */
public class Boleta extends Pedido {

    final double PRECIO_BOLETA_2D = 8000;
    final double PRECIO_BOLETA_3D = 10000;

    private int tipoboleta;
    private double total1 = 0;
    public Boleta() {
        
    }

    public Boleta(int tipoboleta, int Nboletas, int Ncombo) {
        super(Nboletas, Ncombo);
        this.tipoboleta = tipoboleta;
    }

    public int getTipoboleta() {
        return tipoboleta;
    }

    public void setTipoboleta(int tipoboleta) {
        this.tipoboleta = tipoboleta;
    }

    public int getNboletas() {
        return Nboletas;
    }

    public void setNboletas(int Nboletas) {
        this.Nboletas = Nboletas;
    }

    

    public double totalpedido() {
        
        if (tipoboleta == 1) {
            total1 = this.Nboletas * PRECIO_BOLETA_2D;

        } else if (tipoboleta == 2) {
            total1 = this.Nboletas * PRECIO_BOLETA_3D;

        }
        return total1;

    }
    
    @Override
    public String toString() {
        return "BOLETA " + "\n"+
                "CANTIDAD DE BOLETAS " + this.Nboletas ;
                
    }

    

    
    
    
    

}
