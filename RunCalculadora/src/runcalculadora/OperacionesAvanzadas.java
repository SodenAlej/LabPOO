/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runcalculadora;

/**
 *
 * @author Usuario
 */
public class OperacionesAvanzadas {
    public double cua(double a){
        return a*a;
    }
    public double raiz(double a){
        double r= Math.sqrt(a);
        return r;
    }
    public double distancia(double a, double b, double c, double d){
        double r= Math.sqrt( Math.pow(a-c,2)+Math.pow(b-d,2));
        return r;
    }
    
    
}
