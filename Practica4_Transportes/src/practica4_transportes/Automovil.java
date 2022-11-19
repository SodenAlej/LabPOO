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
public class Automovil extends Vehiculos implements VehiculoGasto{

    

   public Automovil(){
       
   }
   public Automovil(int gas){
       System.out.println(this.encenderAutomovil(gas));
       System.out.println(this.avanzarAutomovil(gas));
   }
   public Automovil(double energia){
       System.out.println(this.encenderAutomovil(energia));
       System.out.println(this.avanzarAutomovil(energia));
   }
   private String encenderAutomovil(double energia){
       if(energia>1)
           return "Automovil encendido";
       else
           return "Automovil sin energia";
   }
   private String encenderAutomovil(int gas){
       if(gas>1)
           return "Automovil encendido";
       else
           return "Automovil sin gas";
    }
   private String avanzarAutomovil(int gas){
       if (gas>1&&gas<10)
           return "Bajo combustible";
       else
           return "Combustible suficiente";
   }
   private String avanzarAutomovil(double energia){
       if (energia>1&&energia<10)
           return "Energia baja";
       else
           return "Energia suficiente";
   
   }

    @Override
    public String gastoGas(double kilometro, int gas) {
        double gasRestante = gas - kilometro*12;
        if(gasRestante<10)
            return "Combustible bajo";
        else
            return "El gas restante es:" + gasRestante;
    }

    @Override
    public String gastoEnergia(double kilometro, double energia) {
        double energiaRestante = energia - kilometro*6;
        if(energiaRestante<10)
            return "Baja energia";
        else
            return "La energia restante es restante es:" + energiaRestante;
    }
}

