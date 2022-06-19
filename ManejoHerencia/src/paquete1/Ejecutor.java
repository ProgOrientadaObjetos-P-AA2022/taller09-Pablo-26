
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String continuar;
        
        do{
            System.out.println("Prestamo Automovil  [1]");
            System.out.println("Prestamo Educativo  [2]");
            System.out.println("Ingrese el tipo de prestamo que desee: ");
            int opc = sc.nextInt();
            
            if(opc == 1 || opc == 2){
                sc.nextLine();
                System.out.println("Ingrese el nombre del usuario: ");
                String nom = sc.nextLine();
                System.out.println("Ingrese el apellido del usuario: ");
                String ape = sc.nextLine();
                System.out.println("Ingrese el UserName del usuario: ");
                String user = sc.nextLine();
                
                switch(opc){
                    case 1:
                        System.out.println("Ingrese el tipo de automovil: ");
                        String tipo = sc.nextLine();
                        System.out.println("Ingrese la marca del auto: ");
                        String marca = sc.nextLine();
                        System.out.println("Ingrese la ciudad de residencia: ");
                        String ciudad = sc.nextLine();
                        System.out.println("Ingrese el valor del auto: ");
                        double valor = sc.nextDouble();
                        System.out.println("Ingrese el numero de meses "
                                + "del prestamo: ");
                        int meses = sc.nextInt();
                        
                        Persona garante1 = new Persona();
                        garante1.establecerNombres(nom);
                        garante1.establecerApellido(ape);
                        garante1.establecerUserName(user);
                        
                        PrestamoAutomovil auto1 = new PrestamoAutomovil(
                                garante1, meses,ciudad, tipo, marca, valor);
                        
                        auto1.calcularPagoMensual();
                        
                        System.out.printf("%s\n", auto1);
                        
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre de la "
                                + "institucion: ");
                        String inst = sc.nextLine();
                        System.out.println("Ingrese las siglas: ");
                        String siglas = sc.nextLine();
                        System.out.println("Ingrese el nivel de estudio: ");
                        String nivel = sc.nextLine();
                        System.out.println("Ingrese el valor de la carrera: ");
                        double valCarrera = sc.nextDouble();
                        System.out.println("Ingrese el numero de meses "
                                + "del prestamo: ");
                        meses = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese la ciudad de residencia: ");
                        ciudad = sc.nextLine();
                        
                        InstitucionEducativa inst1 = new InstitucionEducativa();
                        inst1.establecerNombre(inst);
                        inst1.establecerSiglas(siglas);
                        
                        Persona ben1 = new Persona();
                        ben1.establecerNombres(nom);
                        ben1.establecerApellido(ape);
                        ben1.establecerUserName(user);
                        
                        PrestamoEducativo centro1 = new PrestamoEducativo(inst1,
                            ben1, meses, ciudad, nivel, valCarrera);
                        
                        System.out.printf("%s\n", centro1);
                        break;
                    default: break;
                }
            }else{
                System.out.println("Error, opción no válida.");
            }
            System.out.println("Desea ingresar más estudiantes. Digite la letra"
                    + " S para continuar o digite la letra N para salir");
            sc.nextLine();
            continuar = sc.nextLine();
        }while(continuar.equals("S"));
    }
}
