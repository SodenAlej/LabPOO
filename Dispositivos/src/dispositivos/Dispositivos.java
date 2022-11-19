/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dispositivos;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Dispositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Telefono tel=new Telefono();
        String marca= "Nokia";
        String color= "Rojo";
        tel.setMarca(marca);
        tel.setColor(color);
        System.out.println("\t Telefono");
        System.out.println("Marca: "+ tel.getMarca()+ " Color: "+tel.getColor()+ "   Modelo: "+ tel.modelo());
        String contacto=input.nextLine();
        String buscarCont=tel.buscarContacto(contacto);
        System.out.println(buscarCont);
        System.out.println(tel.hacerLlamada(contacto));
        System.out.println(tel.terminaLlamada());
        System.out.println("\t Calculadora Basica");
        System.out.print("Introduzca el primer digito:  ");
        double v1 = input.nextDouble();
        System.out.print("Introduzca el segundo digito:  ");
        double v2 = input.nextDouble();
        double r=tel.suma(v1, v2);
        System.out.println("Suma de " + v1 + " + " + v2 + " = " + r );
        r = tel.resta(v1,v2);
        System.out.println("Resta de " + v1 + " - " + v2 + " = " + r );
        r = tel.div(v1,v2);
        System.out.println("Div de " + v1 + " / " + v2 + " = " + r );
        r = tel.multi(v1,v2);
        System.out.println("Multi de " + v1 + " * " + v2 + " = " + r +"\n");
        
        Calculadora cassio=new Calculadora();
        String modelo= "Cassio-265";
        marca= "Cassio";
        color= "Negro";
        cassio.setMarca(marca);
        cassio.setColor(color);
        cassio.setModelo(modelo);
        System.out.println("Marca: "+ cassio.getMarca()+ " Color: "+cassio.getColor()+ "   Modelo: "+ cassio.getModelo());
        
         System.out.print("Introduzca el primer digito:  ");
        v1 = input.nextDouble();
        System.out.print("Introduzca el segundo digito:  ");
        v2 = input.nextDouble();
        r=cassio.suma(v1, v2);
        System.out.println("Suma de " + v1 + " + " + v2 + " = " + r );
        r = cassio.resta(v1,v2);
        System.out.println("Resta de " + v1 + " - " + v2 + " = " + r );
        r = cassio.div(v1,v2);
        System.out.println("Div de " + v1 + " / " + v2 + " = " + r );
        r = cassio.multi(v1,v2);
        System.out.println("Multi de " + v1 + " * " + v2 + " = " + r +"\n");
        
        System.out.print("Introduzca un digito:  ");
        double d1 = input.nextDouble();
        r=cassio.cua(d1);
        System.out.println("Cuadrado de " + d1 + " = " + r );
        r=cassio.raiz(d1);
        System.out.println("La raiz cuadrada de " + d1 + " = " + r +"\n");

        System.out.println("Ingrese la abscisa de la coordenada 1: ");
        double x1=input.nextDouble();
        System.out.println("Ingrese la ordenada de la coordenada 1: ");
        double y1=input.nextDouble();
        System.out.println("Ingrese la abscisa de la coordenada 2: ");
        double x2=input.nextDouble();
        System.out.println("Ingrese la ordenada de la coordenada 2: ");
        double y2=input.nextDouble();
        
        r=cassio.distancia(x1,y1,x2,y2);
        
        System.out.println("La distancia entre (" + x1 + ", " + y1 +") y ("+ x1+", "+ y2+") es : "+r);
    }    
        
}
