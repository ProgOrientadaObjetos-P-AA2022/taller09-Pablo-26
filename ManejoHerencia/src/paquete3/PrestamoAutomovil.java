
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo{
    
    String tipoAuto;
    String marcaAuto;
    Persona garante;
    double valorAuto;
    double pagoMensual;
    
    public PrestamoAutomovil(Persona p, int t, String c, String tipo, 
            String marca, double v){
        super(p, t, c);
        tipoAuto = tipo;
        marcaAuto = marca;
        valorAuto = v;
    }
    
    @Override
    public void establecerCiudad(String n){
        ciudad = n.toLowerCase(); 
    }
    
    public void establecerGarante(Persona n){
        garante = n;
    }
    public void establecerTipoAuto(String n){
        tipoAuto = n;
    }
    
    public void establecerMarcaAuto(String n){
        marcaAuto = n;
    }
    
    public void establecerValorAuto(double v){
        valorAuto = v;
    }
    
    public void calcularPagoMensual(){
        pagoMensual = valorAuto / tiempoMes;
    }
    
    public String obtenerTipoAuto(){
        return tipoAuto;
    }
    
    public String obtenerMarcaAuto(){
        return marcaAuto;
    }
    
    public Persona obtenerGarante(){
        return garante;
    }
    public double obtenerValorAuto(){
        return valorAuto;
    }
    
    public double obtenerPagoMensual(){
        return pagoMensual;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        
        cadenaFinal = String.format("%s\n"
                + "Tipo de Auto: %s\n"
                + "Marca del Auto: %s\n"
                + "Valor del Auto: %.2f\n"
                + "Pago del prestamos en meses: %.2f\n",
                cadenaFinal,
                tipoAuto,
                marcaAuto,
                valorAuto,
                pagoMensual);
        
        return cadenaFinal;
    }
}
