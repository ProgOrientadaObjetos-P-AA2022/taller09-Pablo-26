
package paquete2;

public class InstitucionEducativa {
    
    protected String nombre;
    protected String siglas;
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerSiglas(String sig){
        siglas = sig;
    }
    
    public String obtenerNombre(){
        return nombre;  
    }
    
    public String obtenerSiglas(){
        return siglas;  
    }
}
