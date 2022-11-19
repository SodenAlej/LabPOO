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
public class Tren extends Vehiculos implements VehiculoGasto{
    public Tren(){
       
   }
   public Tren(int gas){
       System.out.println(this.encenderTren(gas));
       System.out.println(this.avanzarTren(gas));
   }
   public Tren(double energia){
       System.out.println(this.encenderTren(energia));
       System.out.println(this.avanzarTren(energia));
   }
   private String encenderTren(double energia){
       if(energia>1)
           return "Tren encendido";
       else
           return "Tren sin energia";
   }
   private String encenderTren(int gas){
       if(gas>1)
           return "Tren encendido";
       else
           return "Tren sin gas";
   }
   private String avanzarTren(int gas){
       if (gas>1&&gas<10)
           return "Bajo combustible";
       else
           return "Combustible suficiente";
   }
   private String avanzarTren(double energia){
       if (energia>1&&energia<10)
           return "Energia baja";
       else
           return "Energia suficiente";
   }
   @Override
    public String gastoGas(double kilometro, int gas) {
        double gasRestante = gas - kilometro*8;
        if(gasRestante<10)
            return "Combustible bajo";
        else
            return "El gas restante es:" + gasRestante;
    }

    @Override
    public String gastoEnergia(double kilometro, double energia) {
        double energiaRestante = energia - kilometro*5;
        if(energiaRestante<10)
            return "Baja energia";
        else
            return "La energia restante es:" + energiaRestante;
    }

}
