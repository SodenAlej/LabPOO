/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramapractica9;

/**
 *
 * @author Usuario
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    
    public String toString(){
        return "Nombre: "+name+"- Direccion: "+address;
    }
}
