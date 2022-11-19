/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Usuario
 */
public class Perro extends Animal{
    public Perro(){
        
    }
    public Perro(String comida){
        System.out.println(this.comer(comida));
    }
    
    public String color(String color){
        return "El color del perro es: "+color;
    }
    
    public String ladrar(){
        return "Sonido: Woof";
    }
    
    private String comer(String comida){
        return "El perro esta comiendo: "+comida;
    }

    @Override
    public String caminar(double caminar) {
        return "El perro ha caminando: "+Double.toString(caminar);
    }
    
    
}
