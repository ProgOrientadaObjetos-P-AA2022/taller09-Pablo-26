
package paquete2;

public class Prestamo {
    
    protected Persona beneficiario;
    protected int tiempoMes;
    protected String ciudad;
    
    public Prestamo(Persona p, int t, String c){
        beneficiario = p;
        tiempoMes = t;
        ciudad = c;
    }
    
    public void establecerBeneficiario(Persona n){
        beneficiario = n;
    }
    
    public void establecerTiempoMese(int t){
        tiempoMes = t;
    }
    
    public void establecerCiudad(String c){
        ciudad = c;
    }
    
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    
    public int obtenerTiempoMeses(){
        return tiempoMes;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "UserName: %s\n"
                + "Tiempo del prestamo en meses: %d\n"
                + "Ciudad de residencia: %s\n",
                beneficiario.obtenerNombres(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUserName(),
                tiempoMes,ciudad);
        return cadena;
    }
}
