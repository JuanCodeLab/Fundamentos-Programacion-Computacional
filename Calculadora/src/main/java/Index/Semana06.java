/*
 *          Modulo: Fundamentos de Programacion Computacional
 *          Profesor: Aida Lorena Villamar Gallardo
 *          Estudiante: Juan Carlos Diaz Palma
 *          Semana: 6
*/

package Index;

import java.util.Scanner;
import Calculos.Calculadora;

/**
 *
 * @author jdiaz
 */

public class Semana06 {
    
    public static void main(String[] args) {

        System.out.println("Bienvenido a Calculadora en Java");
        System.out.println("Por favor introduzca un numero:\n");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Calculo de Ecuacion 2° Grado");
        System.out.println("6. Salir\n");

        int opcion;
        int n1;
        int n2;

        Scanner Seleccionado = new Scanner(System.in);
        opcion = Seleccionado.nextInt();

        switch (opcion) //Menu de seleccion
        {
            case 1: //Suma
                try{
                    System.out.println("\nSuma");
                    System.out.println("Ingrese el primer numero:");
                    Scanner Numero_s1 = new Scanner(System.in);
                    n1 = Numero_s1.nextInt();

                    System.out.println("\nIngrese el segundo numero:");
                    Scanner Numero_s2 = new Scanner(System.in);
                    n2 = Numero_s2.nextInt();

                    Calculadora CalcSuma = new Calculadora(n1, n2);
                    int Suma = CalcSuma.Sumar();
                    System.out.println("La suma de ambos digitos es: " + Suma);
                    System.exit(0);
                    
                }catch(ArithmeticException ae){
                    System.out.println("No se puede usar 0");
                }
            case 2: //Resta
                try{
                    System.out.println("\nResta");
                    System.out.println("Ingrese el primer numero:");
                    Scanner Numero_r1 = new Scanner(System.in);
                    n1 = Numero_r1.nextInt();

                    System.out.println("\nIngrese el segundo numero:");
                    Scanner Numero_r2 = new Scanner(System.in);
                    n2 = Numero_r2.nextInt();

                    Calculadora CalcResta = new Calculadora(n1, n2);
                    int Resta = CalcResta.Restar();
                    System.out.println("La resta de ambos digitos es: " + Resta);
                    System.exit(0);
                    
                }catch(ArithmeticException ae){
                    System.out.println("No se puede usar 0");
                }
            case 3: //Multiplicacion
                try{
                    System.out.println("\nMultiplicacion");
                    System.out.println("Ingrese el primer numero:");
                    Scanner Numero_m1 = new Scanner(System.in);
                    n1 = Numero_m1.nextInt();

                    System.out.println("\nIngrese el segundo numero:");
                    Scanner Numero_m2 = new Scanner(System.in);
                    n2 = Numero_m2.nextInt();

                    Calculadora CalcMulti = new Calculadora(n1, n2);
                    int Multiplicacion = CalcMulti.Multiplicar();
                    System.out.println("La multiplicacion de ambos digitos es: " + Multiplicacion);
                    System.exit(0);
                }catch(ArithmeticException ae){
                    System.out.println("No se puede usar 0");
                }
            case 4: //Division
                try{
                    System.out.println("\nDivision");
                    System.out.println("Ingrese el primer numero:");
                    Scanner Numero_d1 = new Scanner(System.in);
                    n1 = Numero_d1.nextInt();

                    System.out.println("\nIngrese el segundo numero:");
                    Scanner Numero_d2 = new Scanner(System.in);
                    n2 = Numero_d2.nextInt();

                    Calculadora CalcDivi = new Calculadora(n1, n2);
                    int Division = CalcDivi.Dividir();
                    System.out.println("La division de ambos digitos es: " +Division);
                    System.exit(0);
                }catch(ArithmeticException ae){
                    System.out.println("No se puede usar 0");
                }
            case 5: //Ecuacion
                
                try{
                    
                    int a, b, c;
                    System.out.println("\nEcuacion de Segundo Grado");
                    System.out.println("Ingrese el valor de 'a':");
                    Scanner Numero_e1 = new Scanner(System.in);
                    a = Numero_e1.nextInt();

                    System.out.println("\nIngrese el valor de 'b'");
                    Scanner Numero_e2 = new Scanner(System.in);
                    b = Numero_e2.nextInt();

                    System.out.println("\nIngrese el valor de 'c'");
                    Scanner Numero_e3 = new Scanner(System.in);
                    c = Numero_e3.nextInt();

                    if(b*b<4*a*c){
                        System.out.println("Solucion perteneciente al campo de los numeros complejos.");
                    }
                    else if(a!=0&&b*b>4*a*c){
                        System.out.println("La primera solucion es "+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
                        System.out.println("La segunda solucion es "+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
                        // Esta funcion Math.sqrt toma la raiz cuadrada de un numero.
                    }
                    else {
                        System.out.println("Esta ecuacion no es de segundo grado.");
                    }
                }catch(ArithmeticException ae){
                    System.out.println("No se puede usar 0");
                }
            case 6: System.out.println("Saliendo del programa...");
        }
    }
}

/* 
Conclusiones: Se que el codigo es bastante mas largo que de lo que me esperaba pero aun asi
me siento satisfecho de haber logrado, pensado e investigado como lograr este trabajo.

El sistema de calculadora lo pense relacionando lo aprendido en el video de clases de la semana,
eso incluyendo las aritmeticas basicas y su Package.

El sistema try y catch para crear una excepcion lo encontre en un video relacionado a la eliminacion
de 0 en aritmetica, si bien no entiendo bien el conecpto, tengo una idea de mas o menos cuando usarse
pero no conozco sus capacidades y comandos aun...
*/