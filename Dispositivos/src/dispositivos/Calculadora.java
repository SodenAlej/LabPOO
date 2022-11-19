/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author Usuario
 */
public class Calculadora extends DispositivosElectronicos implements OperacionesAritmeticas2,OperacionesAvanzadas{

    @Override
    public String encender() {
        return "Calculadora encendida";
    }
     private String modelo;
     
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
    

    @Override
    public double suma(double a, double b) {
        return a+b;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    @Override
    public double div(double a, double b) {
        return a/b;
    }

    @Override
    public double multi(double a, double b) {
        return a*b;
    }

    @Override
    public double cua(double a) {
        return Math.pow(a,2);
    }

    @Override
    public double raiz(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double distancia(double a, double b, double c, double d) {
        return Math.sqrt(Math.pow(a-c,2)+Math.pow(b-d,2));
    }

  
}
