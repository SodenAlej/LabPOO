/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class ClassFiles {
    
    public ClassFiles(String fileN){
        this.rfile(fileN);
    }
    public ClassFiles(String fileN, String txt){
        this.wfile(fileN,txt);
    }
    
    private void wfile(String fileN, String txt){
        try
        {
            FileWriter fw=new FileWriter(fileN);
            fw.write(txt);
            fw.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            
        }
          
    }
    
    private void rfile(String fileN){
        try
        {
            FileReader fr=new FileReader(fileN);
            int valor=fr.read();
            while(valor!=-1){
                System.out.println((char)valor);
                valor=fr.read();
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            
        }
                
    }
}
