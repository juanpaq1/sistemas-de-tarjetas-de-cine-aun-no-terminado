/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Proyect {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre, apellido;
        String rta = "s";
        int id;
        int opc;
        int opcformat;
        int opcrefri;
        int opccombo=0;
        int cantidadcombos=0;
        double valrecarga = 0;
        int Nboletas = 0;

        System.out.println("DIFITE EL NOMBRE DEL USUARIO.");
        nombre = teclado.nextLine();

        System.out.println("DIFITE EL APELLIDO DEL USUARIO.");
        apellido = teclado.nextLine();

        System.out.println("DIGITE LA IDENTFICACION DEL USUARIO:");
        id = teclado.nextInt();

        teclado.nextLine();
        System.out.println("DESEA HACER UNA RECARGA A SU SALDO?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opc = teclado.nextInt();

        if (opc == 1) {
            System.out.println("DIGITE EL SALDO QUE DESEA AGREGAR");
            valrecarga = teclado.nextDouble();

        }

        Tarjeta A = new Tarjeta(0, valrecarga, nombre, apellido, id);
        if (valrecarga != 0) {
            System.out.println("____________________________");
            System.out.println("RECARGA REALIZADA CON EXITO NUEVO SALDO ES: ");
            A.sumarsaldo();
            System.out.println(A.sumarsaldo());
            System.out.println("______________________________");
        } else {
            
            System.out.println("______________________________");
            System.out.println("SU SALDO ES");
            A.sumarsaldo();
            System.out.println(A.sumarsaldo());
            System.out.println("_______________________________");

        }

        System.out.println("QUE PELICULA DESEA VER?");
        System.out.println("pelicula 1");
        System.out.println("pelicula 2");
        System.out.println("pelicula 3");
        System.out.println("pelicula 4");

        System.out.println("FORMATO Y PRECIO DE PELICULAS?");
        System.out.println("1. 2D............8000");
        System.out.println("2. 3D............10000");
        opcformat = teclado.nextInt();

        if (opcformat == 1) {

            System.out.println("DIGITE LA CANTIDAD DE BOLETAS 2D");
            Nboletas = teclado.nextInt();

        } else if (opcformat == 2) {
            System.out.println("DIGITE LA CANTIDAD DE BOLETAS 3D");
            Nboletas = teclado.nextInt();
        }
        Boleta bol = new Boleta(opcformat, Nboletas, 0);
        System.out.println("___________________________");
        System.out.println(bol.toString());
        System.out.println("EL TOTAL DE A PAGAR POR LAS BOLETAS ES:");
        System.out.println(bol.totalpedido());
       //System.out.println("EL SALDO LUEGO DEL PAGO DE LA BOLETAS ES: ");
       // System.out.println(bol.restarsaldopboletas());
        System.out.println("____________________________");

        System.out.println("______________________________");
        System.out.println(A);
        System.out.println("___________-----____________-----_________----");

        System.out.println("QUIERE COMPRAR RFRIGERIOS?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        opcrefri = teclado.nextInt();
        
        
//falta realizar esta parte de aqui para abajo


        if (opcrefri == 1) {

            ArrayList<Refrigerio> refri = new ArrayList();
             
             do{
                System.out.println("DIGITE EL NUMERO DEL COMBO");
                System.out.println("1. combo pequeño......................17000");
                System.out.println("2. combo mediano......................22000");
                System.out.println("3. combo grande.......................28000");
                System.out.println("4. combo mediano doble................30000");

                opccombo = teclado.nextInt();

                System.out.println(" CUANTOS COMBOS DESEA COMPRAR?");
                cantidadcombos = teclado.nextInt();
                Refrigerio ref = new Refrigerio(0, opccombo, cantidadcombos);
                refri.add(ref);
                
                teclado.nextLine();
                System.out.println("DESEA AGREGAR OTRO COMBO?S/N");
                rta = teclado.nextLine();
                
                
            }while (rta == "S" || rta == "s");
            System.out.println(refri);
            System.out.println("_______----__________----__");
           
        }

      
        //System.out.println(A.restarsaldo());
        

    }

}
