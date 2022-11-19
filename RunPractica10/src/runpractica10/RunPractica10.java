/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runpractica10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RunPractica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input= new Scanner(System.in);
        
        Calculador cassio = new Calculador();
        System.out.print("Introduzca el primer digito:  ");
        double v1 = input.nextDouble();
        System.out.print("Introduzca el segundo digito:  ");
        double v2 = input.nextDouble();
        System.out.println("Suma de " + v1 + " + " + v2 + " = " + cassio.suma(v1, v2) );
        System.out.println("Resta de " + v1 + " - " + v2 + " = " + cassio.resta(v1, v2) );
        System.out.println("Div de " + v1 + " / " + v2 + " = " + cassio.div(v1, v2) );
        System.out.println("Multi de " + v1 + " * " + v2 + " = " + cassio.multi(v1, v2));
    }
    
}
