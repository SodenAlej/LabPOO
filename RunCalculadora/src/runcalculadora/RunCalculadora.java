/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runcalculadora;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
//Ivan Alejandro Salas Moreno #1912369
public class RunCalculadora {    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        Operaciones op = new Operaciones();
        System.out.print("Introduzca el primer digito:  ");
        double v1 = input.nextDouble();
        System.out.print("Introduzca el segundo digito:  ");
        double v2 = input.nextDouble();
        double r=op.suma(v1, v2);
        System.out.println("Suma de " + v1 + " + " + v2 + " = " + r );
        r = op.resta(v1,v2);
        System.out.println("Resta de " + v1 + " - " + v2 + " = " + r );
        r = op.div(v1,v2);
        System.out.println("Div de " + v1 + " / " + v2 + " = " + r );
        r = op.multi(v1,v2);
        System.out.println("Multi de " + v1 + " * " + v2 + " = " + r +"\n");

        OperacionesAvanzadas opav = new OperacionesAvanzadas();
        System.out.print("Introduzca un digito:  ");
        double d1 = input.nextDouble();
        r=opav.cua(d1);
        System.out.println("Cuadrado de " + d1 + " = " + r );
        r=opav.raiz(d1);
        System.out.println("La raiz cuadrada de " + d1 + " = " + r +"\n");


        System.out.println("Ingrese la abscisa de la coordenada 1: ");
        double x1=input.nextDouble();
        System.out.println("Ingrese la ordenada de la coordenada 1: ");
        double y1=input.nextDouble();
        System.out.println("Ingrese la abscisa de la coordenada 2: ");
        double x2=input.nextDouble();
        System.out.println("Ingrese la ordenada de la coordenada 2: ");
        double y2=input.nextDouble();
        
        r=opav.distancia(x1,y1,x2,y2);
        
        System.out.println("La distancia entre (" + x1 + ", " + y1 +") y ("+ x1+", "+ y2+") es : "+r);
        
    }
    
}
