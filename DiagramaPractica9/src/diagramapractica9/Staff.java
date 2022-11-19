/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramapractica9;

/**
 *
 * @author Usuario
 */
public class Staff extends Person{
    private String school;
    private double pay;
    
    public Staff(String name, String address, String school, double pay){
        super(name, address);
    }
    
    public String getSchool(){
        return school;
    }
    
    public void setSchool(String school){
        this.school=school;
    }
    
    public double getPay(){
        return pay;
    }
    
    public void setPay(double pay){
        this.pay=pay;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+super.getName()+"- Direccion: "+super.getAddress()+
                "- Escuela: "+school+"- Paga: "+pay;
    }
}
