/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */

public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        double suma=0;  
        ArrayList<Double> animal=new ArrayList<Double>();
        System.out.println("\t [ Gato ]");
        Gato cat=new Gato("Atun");
        cat.setRaza("Siberiano");
        System.out.println(cat.getRaza());
        System.out.println(cat.maullar());
        double caminado=25;
        System.out.println(cat.caminar(caminado));
        animal.add(caminado);
        
        System.out.println("\t [ Perro ]");
        Perro dog=new Perro("Pedigri");
        System.out.println(dog.color("Negro"));
        System.out.println(dog.ladrar());
        caminado=15;
        System.out.println(dog.caminar(caminado));
        animal.add(caminado);
        
        System.out.println("\t [ Gorrion ]");
        Gorrion bird=new Gorrion("Gusano");
        bird.setSexo("Masculino");
        System.out.println(bird.getSexo());
        System.out.println(bird.gorjeo());
        caminado=8;
        System.out.println(bird.caminar(caminado));
        animal.add(caminado);
        
        System.out.println("\t [ Cocodrilo ]");
        Cocodrilo croc=new Cocodrilo("Carne");
        croc.setSexo("Femenino");
        System.out.println(croc.getSexo());
        System.out.println(croc.lloro());
        caminado=32;
        System.out.println(croc.caminar(caminado));
        animal.add(caminado);
        
        System.out.println("\t [ Jaguar ]");
        Jaguar gatote=new Jaguar("Carne");
        gatote.setSexo("Masculino");
        System.out.println(gatote.getSexo());
        System.out.println(gatote.rugido());
        caminado=60;
        System.out.println(gatote.caminar(caminado));
        animal.add(caminado);
        
        for(Object o:animal){
            suma+= animal.get(n);
            n++;
        }
        double promedio=suma/n;
        System.out.println("\nEl promedio de lo caminado por "
                + "todos los animales es " +promedio);
    }
    
}
