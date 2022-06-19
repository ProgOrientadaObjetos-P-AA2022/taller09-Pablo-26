
package paquete4;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo{
    
    String nivelEstudio;
    InstitucionEducativa centroEducativo;
    double valorCarrera;
    double valorMensual;
    
    public PrestamoEducativo(InstitucionEducativa i, Persona p, int t, String c, 
            String nE, double v){
        super(p, t, c);
        centroEducativo = i;
        nivelEstudio = nE;
        valorCarrera = v;
    }
    
    @Override
    public void establecerCiudad(String n){
        ciudad = n.toUpperCase(); 
    }
    
    public void establecerNivelEstudio(String n){
        nivelEstudio = n;
    }
    
    public void establecerInstitucion(InstitucionEducativa c){
        centroEducativo = c;
    }
    
    public void establecerValorCarrera(double v){
        valorCarrera = v;
    }
    
    public void calcularValorMensual(){
        valorMensual = (valorCarrera / tiempoMes) - 
                ((valorCarrera / tiempoMes) * 0.10);
    }  
    
    public String obtenerNivelEstudio(){
        return nivelEstudio;
    }
    
    public InstitucionEducativa obtenerInstitucion(){
        return centroEducativo;
    }
    
    public double obtenerValorCarrera(){
        return valorCarrera;
    }
    
    public double obtenerValorMensual(){
        return valorMensual;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        
        cadenaFinal = String.format("%s\n"
                + "Nivel de Estudio: %s\n"
                + "Nombre del Centro Educativo: %s\n"
                + "Siglas: %s\n"
                + "Valor de la Carrera: %.2f\n"
                + "Valor Mensual: %.2f\n",
                cadenaFinal,
                nivelEstudio,
                centroEducativo.obtenerNombre(),
                centroEducativo.obtenerSiglas(),
                valorCarrera,
                valorMensual);
        
        return cadenaFinal;
    }
}
