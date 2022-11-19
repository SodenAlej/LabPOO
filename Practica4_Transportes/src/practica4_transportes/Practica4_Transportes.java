/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4_transportes;

/**
 *
 * @author Usuario
 */
public class Practica4_Transportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gas=-2;
       
        System.out.println("\t\t[ AUTOMOVIL ]");
        Automovil auto= new Automovil(gas);
        
        System.out.println(auto.marca("Audi"));
        System.out.println(auto.modelo("Audi A3"));
        System.out.println(auto.color("Rojo"));
        double distancia= 20;
        System.out.println("Estado despues de avanzar: " + auto.gastoGas(distancia, gas));
        
        System.out.println("\t\t[ TREN ]" );
        gas=20;
        Tren tren= new Tren(gas);
        
        System.out.println(tren.marca("Feve"));
        System.out.println(tren.modelo("Feve 3600"));
        System.out.println(tren.color("Negro"));
        System.out.println("Estado despues de avanzar" +tren.gastoGas(distancia, gas));

        System.out.println("\t\t[ Avion ]");
        gas=60;
        Avion avion=new Avion(gas);
        
        System.out.println(avion.marca("Airbus"));
        System.out.println(avion.modelo("Airbus 360"));
        System.out.println(avion.color("Azul"));
        System.out.println("Estado despues de avanzar: " + avion.gastoGas(distancia, gas));

       
        double energia=9;
        System.out.println("\t\t[ AUTOMOVIL ]");
        Automovil auto2= new Automovil(energia);
      
        System.out.println(auto2.marca("Audi"));
        System.out.println(auto2.modelo("Audi A6"));
        System.out.println(auto2.color("Negro"));
        System.out.println("Estado despues de avanzar: " + auto2.gastoEnergia(distancia, energia));

        
        System.out.println("\t\t[ TREN ]" );
        energia=50;
        Tren tren2= new Tren(energia);
        
        System.out.println(tren2.marca("Ave"));
        System.out.println(tren2.modelo("Ave-2H4"));
        System.out.println(tren2.color("Blanco"));
        System.out.println("Estado despues de avanzar: " + tren2.gastoEnergia(distancia, energia));

        System.out.println("\t\t[ Avion ]");
        energia=30;
        Avion avion2=new Avion(energia);
        
        System.out.println(avion2.marca("Boeing"));
        System.out.println(avion2.modelo("Boeing-A3B2"));
        System.out.println(avion2.color("Gris"));
        System.out.println("Estado despues de avanzar: " + avion2.gastoEnergia(distancia, energia));

    }
    
}
