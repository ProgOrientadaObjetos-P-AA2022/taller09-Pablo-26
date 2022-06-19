
package paquete2;

public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected String userName;
    
    public void establecerNombres(String nom){
        nombre = nom;
    }
  
    public void establecerApellido(String ape){
        apellido = ape;
    }
    
    public void establecerUserName(String name){
        userName = name;
    }
    
    public String obtenerNombres(){
        return nombre;  
    }
 
    public String obtenerApellido(){
        return apellido; 
    }
    
    public String obtenerUserName(){
        return userName; 
    }
}
