/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runpractica10;
import Lib.Calculadora;
/**
 *
 * @author Usuario
 */
public class Calculador extends Calculadora{

    @Override
    public double suma(double a, double b) {
        return a + b;
    }

    @Override
    public double resta(double a, double b) {
        return a - b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double multi(double a, double b) {
        return a * b;
    }
    
    
}
