/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_transportes;
import Vehiculos.*;
/**
 *
 * @author Usuario
 */
public class Avion extends Vehiculos implements VehiculoGasto{
    public Avion(){
       
   }
   public Avion(int gas){
       System.out.println(this.encenderAvion(gas));
       System.out.println(this.avanzarAvion(gas));
   }
   public Avion(double energia){
       System.out.println(this.encenderAvion(energia));
       System.out.println(this.avanzarAvion(energia));
   }
   private String encenderAvion(double energia){
       if(energia>1)
           return "Avion encendido";
       else
           return "Avion sin energia";
   }
   private String encenderAvion(int gas){
       if(gas>1)
           return "Avion encendido";
       else
           return "Avion sin gas";
   }
   
   private String avanzarAvion(int gas){
       if (gas>1&&gas<10)
           return "Bajo combustible";
       else
           return "Combustible suficiente";
   }
   private String avanzarAvion(double energia){
       if (energia>1&&energia<10)
           return "Energia baja";
       else
           return "Energia suficiente";
   }
   @Override
    public String gastoGas(double kilometro, int gas) {
        double gasRestante = gas - kilometro*22;
        if(gasRestante<10)
            return "Combustible bajo";
        else
            return "El gas restante es:" + gasRestante;
    }

    @Override
    public String gastoEnergia(double kilometro, double energia) {
        double energiaRestante = energia - kilometro*12;
        if(energiaRestante<10)
            return "Energia baja";
        else
            return "la energia restante es:" + energiaRestante;
    }

}
