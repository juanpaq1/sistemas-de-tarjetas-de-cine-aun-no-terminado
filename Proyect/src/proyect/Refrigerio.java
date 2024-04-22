/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Refrigerio extends Pedido implements Metodos {

    final double PRECIO_COMBO_1 = 17000;
    final double PRECIO_COMBO_2 = 22000;
    final double PRECIO_COMBO_3 = 28000;
    final double PRECIO_COMBO_4 = 30000;

    private ArrayList<Refrigerio> refri = new ArrayList();
    private int cantidadcombos;
    public double total = 0;

    public Refrigerio(int cantidadcombos, int Nboletas, int Ncombo) {
        super(Nboletas, Ncombo);
        this.cantidadcombos = cantidadcombos;
    }

   public ArrayList<Refrigerio> getRefri() {
        return refri;
    }

    public void setRefri(ArrayList<Refrigerio> refri) {
        this.refri = refri;
    }

    public int getCantidadcombos() {
        return cantidadcombos;
    }

    public void setCantidadcombos(int cantidadcombos) {
        this.cantidadcombos = cantidadcombos;
    }
    
    public double totalpedido(int Ncombo, int cantidadcombos) {
         
        if (Ncombo == 1) {
            total = total + (PRECIO_COMBO_1 * cantidadcombos);
            
        } else if (Ncombo == 2) {
            total = total + (PRECIO_COMBO_2 * cantidadcombos);
        } else if (Ncombo == 3) {
            total = total + (PRECIO_COMBO_3 * cantidadcombos);
        } else if (Ncombo == 4) {
            total = total + (PRECIO_COMBO_4 * cantidadcombos);
        }
        return total;
    }

    @Override
    public String toString() {
        return "Refrigerio" + "\n"+
                "EL TOTAL DE LA ORDEN DE REFRIGERIOS ES " + total ;
    }

   

    
    

}
