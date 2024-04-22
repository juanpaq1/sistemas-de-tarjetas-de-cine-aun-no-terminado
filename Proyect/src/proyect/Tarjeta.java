/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyect;

/**
 *
 * @author HP
 */
public class Tarjeta extends Usuario implements Metodos{
    
    
    private double saldo;
    private double saldoop;
    private double valRecarga;
    private double saldofinal;

    public Tarjeta() {
    }

    public Tarjeta(double saldo, double valRecarga, String Nombre, String Apellido, int ID) {
        super(Nombre, Apellido, ID);
        this.saldo = saldo;
        this.valRecarga = valRecarga;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValRecarga() {
        return valRecarga;
    }

    public void setValRecarga(double valRecarga) {
        this.valRecarga = valRecarga;
    }

    public double sumarsaldo() {
        
        return this.saldo+ this.valRecarga;
                
    }
 
    @Override
    public String toString() {
        return "Tarjeta" + "\n"+
                super.toString()+"\n"+
                " SALDO " + this.saldo +"\n"+ 
                " VALOR DE RECARGA " + valRecarga;
               
              
    }

    @Override
    public double restarsaldopboletas() {
        saldofinal= sumarsaldo()- totalpedido();
        
    return saldofinal;
    }

    @Override
    public double totalpedido() {
        return saldofinal;
    }

    

   

    
    
      
      
   
    
  
    
    

}
