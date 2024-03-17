/*
 *          Modulo: Fundamentos de Programacion Computacional
 *          Profesor: Carlos Emmott
 *          Estudiante: Juan Carlos Diaz Palma
 *          Semana: 7
 */

package Aeropuerto;

/*
 *
 * @author jdiaz
 */

public class Aeropuerto {

    private Avion[] aviones;
    final int nmaximoActividad = 5;
    private int cantAviones;
    private int a;
    
    String nombreA;
    String str ="n";

    /*
    Constructor, se pueden crear Aeropuertos
    
    Estructura:
    
        - nm  = Nombre Aeropuerto.
        - Avion = Listado de aviones.
        - cantidad = cantidad de aviones del aeropuerto.
     */
    
    //Aeropuerto con nombre, aviones presentes y cantidad maxima de aviones.

    public Aeropuerto(String nm, Avion avion, int cantidad) {
        nombreA = nm;
        aviones = new Avion[cantidad];
        aviones[0] = avion;
        cantAviones = 1;
    }

    //Aeropuerto con nombre y cantidad maxima de aviones
    public Aeropuerto(String nm, int cantidad) {
        nombreA = nm;
        aviones = new Avion[cantidad];
        cantAviones = 0;
    }

    //Aeropuerto totalmente random, con una maxima cantidad de 5 aviones.

    public Aeropuerto() {
        nombreA = "Aeropuerto Mala Suerte";
        aviones = new Avion[nmaximoActividad];

        for (int i = 0; i < nmaximoActividad; i++) {
            aviones[i] = new Avion(i, false);
            cantAviones = nmaximoActividad;
        }
    }

/*------------------------------------------------------------------------------
    
                                  getters
    
------------------------------------------------------------------------------*/
   
    //Obtener aviones del Aeropuerto.
    public void getAvionesInfo() {
        for (int i = 0; i < this.cantAviones; i++) {
            System.out.println(this.aviones[i].getAvion());
        }
    }

    public void getAvionInfo(int i) {
        System.out.println(this.aviones[i].getAvion());
    }
    
    //Tuve que convertirlos en void para evitar problemas en return null.
    public void getAllpasajeros() {
        for (int i = 0; i < this.cantAviones; i++) {
            a = a + this.aviones[i].getPasajeros();        
        }
        System.out.println(a);
    }
    
    public void getAllpasrestantes() {
        for (int i = 0; i < this.cantAviones; i++){    
            a = a + this.aviones[i].getPasajerosrestantes();     
        }
        System.out.println(a);
    }
    
    public void getPasajeros(int i){ //recibe numero de id.
        System.out.println(this.aviones[i].getPasajeros());
    } 
    
    public void getMaxpasajeros(int i){ //recibe numero de id.
        System.out.println(this.aviones[i].getMaxpasajeros());
    }
    
    public void getPasajerosrestantes(int i){ //recibe numero de id.
        System.out.println(this.aviones[i].getPasajerosrestantes());
    }
        
    public void getAllid() {
        for (int i = 0; i < this.cantAviones; i++) {
            a = this.aviones[i].getId();
            System.out.println(a);
        }       
    }

    public int getCantAviones() {
        return this.cantAviones;
    }

    public String getNombreA() {
        return this.nombreA;
    }

/*------------------------------------------------------------------------------
    
                              Agregar Aviones
    
------------------------------------------------------------------------------*/
    
    Avion[] AgregarAvion(Avion avion) {
        this.aviones[this.cantAviones] = avion;
        this.aviones[this.cantAviones] = new Avion();
        this.cantAviones++;
        return aviones;
    }
/*------------------------------------------------------------------------------
    
                                Bajar y subir pasajeros
    Metodo perteneciente a Clase Avion sobreccargada en esta clase, para asi integrar id.
    
------------------------------------------------------------------------------*/

    public void Bajarpasajeros(int id, int i){ //recibe numero de pasajeros a bajar.
        
        /*int pas = this.aviones[id].getPasajeros();
        
        if (this.aviones[id] == null){ 
            System.out.println("Ese id no existe!");
        }else 
        
            Prueba fallida de numero inexistente.
        
        */
        
        if(i>this.aviones[id].getPasajeros()){ //Evitar numeros negativos.
             System.out.println("No puedes bajar mas pasajeros de los que hay abordo.");
        }else{
             this.aviones[id].setPasajeros(this.aviones[id].getPasajeros() - i);
        }
    }
    
    public void Subirpasajeros(int id, int i){ //recibe numero de pasajeros a subir.
        
       if(this.aviones[id].getPasajeros() == this.aviones[id].getMaxpasajeros()){ 
        //Avion lleno.
            System.out.println("No puede subir mas pasajeros, avion lleno.");
       }else if((i + this.aviones[id].getPasajeros()) > this.aviones[id].getMaxpasajeros() ){ 
           
        /*  Si el numero entregado es mayor al maximo permitido por el avion, considerando
            directamente la inclusion de nuestros pasajeros actuales.*/
        
           System.out.println("No puedes subir tal cantidad de pasajeros");
       }else{
           this.aviones[id].setPasajeros(this.aviones[id].getPasajeros() + i);
       }
    }
}
