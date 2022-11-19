/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Usuario
 */
public class Gato extends Animal{
    
    public Gato(){
        
    }
    public Gato(String comida){
        System.out.println(this.comer(comida));
    }
    private String raza;
    
    public String maullar(){
        return "Sonido: Miau";
    }
    
    private String comer(String comida){
        return "El gato esta comiendo "+comida;
    }

    @Override
    public String caminar(double caminar) {
        return "El gato ha caminado: "+Double.toString(caminar);
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}
