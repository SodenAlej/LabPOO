/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramapractica9;

/**
 *
 * @author Usuario
 */
public class Student extends Person{
    private String program;
    private int year;
    private double fee;
    
    public Student(String name, String address, String program, int year, double fee){
        super(name,address);
    }

    public String getProgram(){
        return program;
    }
    
    public void setProgram(String program){
        this.program=program;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year=year;
    }
    
    public double getFee(){
        return fee;
    }
    
    public void setFee(double fee){
        this.fee=fee;
    }
    @Override
    public String toString(){
        return "Nombre: "+super.getName()+"- Direccion: "+super.getAddress()+
                "- Programa: "+program+"- Anio: "+year+"- Fee:"+fee;
    }
}
