/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Usuario
 */
public class Gorrion extends Animal{
    public Gorrion(){
        
    }
    public Gorrion(String comida){
        System.out.println(this.comer(comida));
    }
    
    private String sexo;
    public String gorjeo(){
        return "Ha emitido un sonido";
    }
    
    private String comer(String comida){
        return "El gorreon esta comiendo: "+comida;
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
        return "El gorrion se ha desplazado: "+ Double.toString(caminar);
    }
    
    
    
    

}
