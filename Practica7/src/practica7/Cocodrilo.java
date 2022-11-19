/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author Usuario
 */
public class Cocodrilo extends Animal{
    public Cocodrilo(){
        
    }
    public Cocodrilo(String comida){
        System.out.println(this.comer(comida));
    }
    
    private String sexo;
    public String lloro(){
        return "Ha emitido un sonido";
    }
    
    private String comer(String comida){
        return "El cocodrilo esta comiendo: "+comida;
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
        return "El cocodrilo se ha desplazado: "+ Double.toString(caminar);
    }
    
    
}
