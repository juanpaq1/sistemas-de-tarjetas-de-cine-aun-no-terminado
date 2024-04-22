/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author HP
 */
public class Pedido extends Tarjeta {

    protected int Nboletas;
    protected int Ncombo;
    private double totalpedido;
    

    public Pedido() {
    }

    public Pedido(int Nboletas, int Ncombo) {
        this.Nboletas = Nboletas;
        this.Ncombo = Ncombo;
    }
    
    public int getNboletas() {
        return Nboletas;
    }

    public void setNboletas(int Nboeltas) {
        this.Nboletas = Nboeltas;
    }

    public int getNcombo() {
        return Ncombo;
    }

    public void setNcombo(int Ncombo) {
        this.Ncombo = Ncombo;
    }
    
    public void totalapagarpedido(double total1, double total){
        totalpedido = total1+total;
        
    }
    
}
