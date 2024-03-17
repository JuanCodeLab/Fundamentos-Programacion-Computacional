/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculos;

/**
 *
 * @author jdiaz
 */
public class Calculadora {

    private int numero1, numero2;
        
    public Calculadora(int numero1,int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int Sumar(){
        int Suma = this.numero1 + this.numero2;
        return Suma;
    }
    
    public int Restar(){
        int Resta = this.numero1 - this.numero2;
        return Resta;
    }
    
    public int Multiplicar(){
        int Multiplo = this.numero1 * this.numero2;
        return Multiplo;
    }
    
    public int Dividir(){
        int Divisor = this.numero1 / this.numero2;
        return Divisor;
    }
    
}
