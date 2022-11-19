/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5.vehiculo;

/**
 *
 * @author Usuario
 */
public class Automovil extends Automotor{
    private String color;
    private double precio;
    
    public String encenderAutomovil(){
            double gas=this.getGas();
            if(gas>1)
               return "Automovil encendido";
            else
               return "Automovil sin gas";
    }
    public String apagarAutomovil(){
        return "Auto apagado";
    }
    public String avanza(){
        double gas=this.getGas();
          if (gas>1&&gas<10)
           return "Bajo combustible";
        else{
            gas-=1;
            this.setGas(gas);
            return "Avanzando. Gas restante: "
                    +this.getGas();
        }
    }
    
     public String avanzaDerecha(){
         double gas=this.getGas();
         if (gas>1&&gas<10)
           return "Bajo combustible";
        else{
            gas-=1;
            this.setGas(gas);
            return "Vuelta a la derecha. Gas restante: "
                    +this.getGas();
 
        }
    }
      public String avanzaIzquierda(){
        double gas=this.getGas();
          if (gas>1&&gas<10)
           return "Bajo combustible";
        else{
            gas-=1;
            this.setGas(gas);
            return "Vuelta a la izquierda. Gas restante: "
                    +this.getGas();
        }
  
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
