/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Usuario
 */
public class Jaguar extends Animal{
    public Jaguar(){
        
    }
    public Jaguar(String comida){
        System.out.println(this.comer(comida));
    }
    
    private String sexo;
    public String rugido(){
        return "Sonido: Rawr";
    }
    
    private String comer(String comida){
        return "El jaguar esta comiendo: "+comida;
    }

    /**
     * @return the genero
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param genero the genero to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String caminar(double caminar) {
        return "El jaguar se ha desplazado: "+ Double.toString(caminar);
    }
    
    
}
