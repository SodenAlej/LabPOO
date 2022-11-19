/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivo;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Archivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String folder="C:\\Users\\Usuario\\OneDrive\\Escritorio\\";
        System.out.println("Ingrese el nombre del archivo:");
        String archivo= input.nextLine();
        File arch=new File(folder+archivo);
        System.out.println("Texto a añadir al archivo: ");
        String txt= input.nextLine();
        ClassFiles write=new ClassFiles(folder+archivo, txt);
        ClassFiles read=new ClassFiles(folder+archivo);
    }
    
}
