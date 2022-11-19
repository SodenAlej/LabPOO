/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5.vehiculo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica5Vehiculo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        Automovil[] auto=new Automovil[5];
        double gas;
        String marca;
        String modelo;
        String color;
        double precio;
        for(int i=0; i<auto.length; i++){
             auto[i]= new Automovil();
            System.out.println("\t[ Automovil ]");
            System.out.println("Gas: ");
            do{
               gas=input.nextDouble();
               if(gas<0||gas>65)
                    System.out.println("Ingrese un valor valido");
             }while(gas<0||gas>65);
            auto[i].setGas(gas);
            System.out.println("Marca: ");
            marca=input.nextLine();
            auto[i].setMarca(marca);
            System.out.println("Modelo: ");
            modelo=input.nextLine();
            auto[i].setModelo(modelo);
            System.out.println("Color: ");
            color=input.nextLine();
            auto[i].setColor(color);
            System.out.println("Precio: ");
            precio=input.nextDouble();
            auto[i].setPrecio(precio);         
        }
        for(Automovil audi:auto){
            System.out.println("\t[ Automovil ]");
            System.out.println(audi.getMarca());
            System.out.println(audi.getModelo());
            System.out.println(audi.getColor());
            System.out.println(audi.getPrecio());
            System.out.println(audi.encenderAutomovil());
            System.out.println(audi.avanza());
            System.out.println(audi.acelerar());
            System.out.println(audi.avanzaDerecha());
            System.out.println(audi.avanzaIzquierda());
            System.out.println(audi.frenar());
            System.out.println(audi.apagarAutomovil());
            
        }
       
    }
    
}
