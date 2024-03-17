/*
 *          Modulo: Fundamentos de Programacion Computacional
 *          Profesor: Aida Lorena Villamar Gallardo
 *          Estudiante: Juan Carlos Diaz Palma
 *          Semana: 7
*/

package Aeropuerto;
import java.util.Scanner; //Se agrega Scanner

/**
 *
 * @author jdiaz
 */

public class Semana07 {

    public static void main(String[] args) {
        
        Aeropuerto Semana07;
        Semana07 = new Aeropuerto();
            
        String tecla = null;
	Scanner scanner = new Scanner (System.in);
        
        //DESARROLLO GENERAL.
	do {
            System.out.println("\n------------------------------------------------------------------------");
            System.out.println("                Bienvenido a "+Semana07.getNombreA());
            System.out.println("------------------------------------------------------------------------\n");
            System.out.println("Por favor introduzca un numero para navegar:\n");
            System.out.println("1. Ver lista de id de Aviones creados "
                    + "(Cantidad Actual: "+Semana07.getCantAviones()+")");

            System.out.println("2. Cantidad de Pasajeros Actuales Totales");
            System.out.println("3. Cantidad de asientos disponibles Totales");
            System.out.println("4. Informacion de Avion respecto a su id");
            System.out.println("5. Subir pasajeros a un Avion");
            System.out.println("6. Bajar pasajeros a un Avion");
            System.out.println("7. Salir del menu\n");
            
	int opcion = scanner.nextInt();
        
        int ia1;
        int ia2;
        
        Scanner Seleccionado = new Scanner(System.in);
        Scanner Seleccionado2 = new Scanner(System.in);
        
	boolean opc = (opcion <= 7);

	if (opc) {
		switch (opcion) {
		case 1: //DESARROLLO 1.
			System.out.println("\n------------------------------------------------------------------------");
                        System.out.println("                Listado de id de Aviones disponibles");
                        System.out.println("------------------------------------------------------------------------\n");
                        Semana07.getAllid();
                        System.out.println();
			break;
		case 2: //DESARROLLO 2.
			System.out.println("\n------------------------------------------------------------------------");
                        System.out.println("        Cantidad total de Pasajeros actuales en "+Semana07.getCantAviones()+" Aviones");
                        System.out.println("------------------------------------------------------------------------\n");
                        Semana07.getAllpasajeros();
                        System.out.println();
			break;
		case 3: //DESARROLLO 3.
                        System.out.println("\n------------------------------------------------------------------------");
                        System.out.println("        Cantidad total de asientos disponibles en "+Semana07.getCantAviones()+" Aviones");
                        System.out.println("------------------------------------------------------------------------\n");
                        Semana07.getAllpasrestantes();
                        System.out.println();
			break;
		case 4: //DESARROLLO 4.
                        System.out.println("\n------------------------------------------------------------------------");
                        System.out.println("                Informacion del Avion respectivo a su id");
                        System.out.println("------------------------------------------------------------------------\n");
                        System.out.println("Porfavor ingrese una id del Avion que desea ver...");

                        ia1 = Seleccionado.nextInt();
                        if(ia1 >= 5){
                            System.out.println("\nVuelo inexistente!\n");
                            break;
                        }else{
                        Semana07.getAvionInfo(ia1);}
			break; 
                case 5: //DESARROLLO 5.
                        System.out.println("\n------------------------------------------------------------------------");
                        System.out.println("               Subir pasajeros a un Avion respectivo a su id");
                        System.out.println("------------------------------------------------------------------------\n");
                        System.out.println("Porfavor ingrese una id del Avion que desea subir pasajeros...");
                                              
                        ia1 = Seleccionado.nextInt();  
                        
                        if(ia1 >= 5){
                                System.out.println("\n------------------------------------------------------------------------");
                                System.out.println("\n                          Vuelo inexistente!");
                                System.out.println("\n------------------------------------------------------------------------");
                            break;
                        }else{
                        Semana07.getAvionInfo(ia1);
                        /*
                        System.out.println("Cantidad actual de Pasajeros: "); Semana07.getPasajeros(ia1);
                        System.out.println("Cantidad de Asientos Disponibles: "); Semana07.getPasajerosrestantes(ia1);
                        System.out.println("Cantidad Maxima Disponible: "); Semana07.getMaxpasajeros(ia1);
                        System.out.println("\n");
                        */
                        System.out.println("\nPorfavor ingrese la cantidad de pasajeros que desea agregar:\n");
                        ia2 = Seleccionado2.nextInt();  
                        Semana07.Subirpasajeros(ia1, ia2);
                        Semana07.getAvionInfo(ia1);}
			break;
                        
                case 6: //DESARROLLO 6.
                        System.out.println("\n------------------------------------------------------------------------");
                        System.out.println("               Bajar pasajeros a un Avion respectivo a su id");
                        System.out.println("------------------------------------------------------------------------\n");
                        System.out.println("Porfavor ingrese una id del Avion que desea subir pasajeros...");
                                              
                        ia1 = Seleccionado.nextInt();   
                        
                        if(ia1 >= 5){
                            System.out.println("\nVuelo inexistente!\n");
                            break;
                        }else{
                                System.out.println("Cantidad actual de Pasajeros: "); Semana07.getPasajeros(ia1);
                                System.out.println("Cantidad de Asientos Disponibles: "); Semana07.getPasajerosrestantes(ia1);
                                System.out.println("Cantidad Maxima Disponible: "); Semana07.getMaxpasajeros(ia1);
                                
                                System.out.println("\nPorfavor ingrese la cantidad de pasajeros que desea agregar:\n");
                                ia2 = Seleccionado2.nextInt();  
                                Semana07.Bajarpasajeros(ia1, ia2);
                                Semana07.getAvionInfo(ia1);
                        }
                        break;

                case 7: //DESARROLLO 7.
                        System.out.println("\nCerrando sistema\n");
                        System.exit(0);
                        break;
                }
	} else {
            System.out.println("Ingresa un numero del 1 al 7."); 
        }
            System.out.print("\nPresione 1 para volver al Menu principal.\n");
            tecla = new Scanner(System.in).nextLine();
                
        } 
        while (tecla.equals("1") || tecla.equals("1"));
   }
}