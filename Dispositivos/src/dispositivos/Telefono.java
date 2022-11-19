package dispositivos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Telefono extends DispositivosElectronicos implements OperacionesAritmeticas2{
    
    public String modelo(){
        return "Nokia 420";
    }
    
    @Override
    public String encender(){
        return "Telefono Encendido";
    }
    public String hacerLlamada(int numero){
        return "Llamando "+Integer.toString(numero);
    }
    public String hacerLlamada(String contacto){
        return "Llamando "+contacto;
    }
    public String terminaLlamada(){
        return "La llamada ha sido finalizada...";
    }
    public String buscarContacto(String contacto){
        return "El contacto encontrado es : "+ contacto;
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
}
