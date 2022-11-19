/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagramapractica9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DiagramaPractica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("\t [ Student ]");
        System.out.println("Ingrese su nombre: ");
        String name= input.nextLine();
        System.out.println("Ingrese su direccion: ");
        String address= input.nextLine();
        String program="";
        int year=0;
        double fee= 0.0;
       
        Student stdt=new Student(name,address,program,year,fee);
        
        System.out.println("Ingrese su programa: ");
        program=input.nextLine();
        stdt.setProgram(program);
        System.out.println("Ingrese el anio: ");
        year=input.nextInt();
        stdt.setYear(year);
        System.out.println("Ingrese fee: ");
        fee=input.nextDouble();
        input.nextLine();
        stdt.setFee(fee);
        
        System.out.println("\t [ Staff ]");
        System.out.println("Ingrese su nombre: ");
        String name2= input.nextLine();
        System.out.println("Ingrese su direccion: ");
        address= input.nextLine();
        String school= "";
        double pay=0.0;
        
        Staff stf=new Staff(name2,address,school,pay);
        
        System.out.println("Ingrese su escuela: ");
        school=input.nextLine();
        stf.setSchool(school);
        System.out.println("Ingrese su paga: ");
        pay=input.nextDouble();
        stf.setPay(pay);
        
        System.out.println(stdt.toString());
        System.out.println(stf.toString());

        
    }
    
}
