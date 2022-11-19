package practica5.vehiculo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Automotor {
    private String modelo;
    private double gas;
    private String marca;

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    /**
     * @return the gas
     */
    public double getGas() {
        return gas;
    }

    /**
     * @param gas the gas to set
     */
    public void setGas(double gas) {
        this.gas = gas;
    }
    
    public String acelerar(){
         double gasolina=this.getGas();
         if (gasolina>1&&gasolina<10)
           return "Bajo combustible";
        else{
            gasolina-=1;
            this.setGas(gasolina);
            return "Acelerando. Gas restante: "
                    +this.getGas();
 
        }
    }
    public String frenar(){
        return "Frenando";
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
