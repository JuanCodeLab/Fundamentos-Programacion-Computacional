/*
 *          Modulo: Fundamentos de Programacion Computacional
 *          Profesor: Carlos Emmott
 *          Estudiante: Juan Carlos Diaz Palma
 *          Semana: 7
*/

package Aeropuerto;

import java.util.Random;

/**
 *
 * @author jdiaz
 */

public class Avion {

    private int id;
    private int pasajeros;
    private int maxpasajeros;
    private boolean estado;
        
    /*Constructor, ahora se pueden crear Aviones
    
    Estructura;
    
        - id  = Avion.
        - mpas  = Maximo de pasajeros disponibles.
        - pas = Pasajeros a bordo.
        - est = Estado del Avion: true: en vuelo. false: en aeropuerto.
    */

        
    public Avion(int i, int mpas, int pas, boolean est){
        id=i;
        pasajeros=pas;
        maxpasajeros=mpas;
        estado=est;
    }
    
    //  Contructor de Aviones random, considerado id y estado
    
    public Avion(int i, boolean est){

        Random random = new Random();
        int randompas = random.nextInt(12);
     
        Random maxrandom = new Random();
        int randomaxpas = maxrandom.nextInt(30-10+1)+10;
        

        if(randomaxpas <= randompas){
            randomaxpas = maxrandom.nextInt(30-10+1)+10;  
        }else{
            this.id = i;
            this.maxpasajeros = randomaxpas;
            this.pasajeros = randompas;
            this.estado = est;
        }
    }
    
    //  Contructor de avion totalmente aleatoreo
    //  se considera estado de vuelo por defecto = false.
    
    public Avion(){

        Random idrandom = new Random();
        int randomid = idrandom.nextInt(100);

        Random random = new Random();
        int randompas = random.nextInt(10);
        
        Random maxrandom = new Random();
        int randomaxpas = maxrandom.nextInt(30-10+1)+10;  
        
        if(randomaxpas <= randompas)
        {
            randomaxpas = maxrandom.nextInt(30-10+1)+10;  
        }else{
            this.id = randomid;
            this.maxpasajeros = randomaxpas;
            this.pasajeros = randompas;
            this.estado = false;
        }

    }
    
/*------------------------------------------------------------------------------
    
                                  getters
    
------------------------------------------------------------------------------*/
    
    public int getId() {
        return id;
    }

    public int getMaxpasajeros() {
        return maxpasajeros;
    }
    
    public int getPasajeros() {
        return pasajeros;
    }
    
     /*Metodo de estado basado en string considerandose asi como:
    
        false   =   Avion en tierra o Aeropuerto
        true    =   Avion en Vuelo.
    
    */

    public String getEstado() {
        
        String a;
        
        if(this.estado == false)
        {
            a="Avion en Aeropuerto.";
        }else{
            a="Avion en Vuelo.";
        }
        return a;
    }
    
    public String getAvion() {
        
        String info;
        
        info="\n--------- Informacion de Vuelo nro: "+this.id+" ---------\n"
                + "Pasajeros Maximos soportados: "+this.maxpasajeros+"\n"
                + "Pasajeros a Bordo: "+this.pasajeros+"\n"
                + "Estado del Avion: "+this.getEstado()+"\n";
        
        return info;
    }
    
    public int getPasajerosrestantes() {
        int i;       
        i = maxpasajeros - pasajeros;     
        return i;
    }
    
/*------------------------------------------------------------------------------
    
                                  setters
    
------------------------------------------------------------------------------*/
    
    public void setId(int id) {
        this.id = id;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setMaxpasajeros(int maxpasajeros) {
        this.maxpasajeros = maxpasajeros;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
/*------------------------------------------------------------------------------
    
                            bajar y subir pasajeros
    
------------------------------------------------------------------------------*/

    public void Bajarpasajeros(int i){ //recibe numero de pasajeros a bajar.
       if(i>this.pasajeros){        //Evitar numeros negativos.
            System.out.println("No puedes bajar mas pasajeros de los que hay abordo.");
       }else{
            this.pasajeros = this.pasajeros - i;
            System.out.println("\nPasajeros despachados correctamente!\n");
       }
    }
    
    public void Subirpasajeros(int i){ //recibe numero de pasajeros a subir.
       if(this.pasajeros == this.maxpasajeros){ 
    //Avion lleno.
            System.out.println("No puede subir mas pasajeros, avion lleno.");
       }else if((i + this.pasajeros) > this.maxpasajeros ){ 

        /* Si el numero entregado es mayor al maximo permitido por el avion, considerando
        directamente la inclusion de nuestros pasajeros actuales. */

           System.out.println("\nNo puedes subir tal cantidad de pasajeros");
       }else{
            System.out.println("\nPasajeros agregados correctamente!\n");
           this.pasajeros = this.pasajeros + i;
       }
    }    
    
}
