package paqueteuno;

// @author JosephMatheo

import java.util.Scanner;
import java.util.Arrays;

public class Metodos {
    
    public static void presentacion(){
        
        //Presentacion del Programa
        
        System.out.println("==================================================");
        System.out.println("Programa que trabaja con Arreglos Unidimensionales");
        System.out.println("==================================================\n");
        
    }
    
    public static void peticion(){
        
        Scanner lm = new Scanner(System.in);


            System.out.print("\nIngrese el numero de elemntos que desea en su arreglo: ");
            int elem = lm.nextInt();
            
            int [] array3 = new int[elem];

            // LLenado de Matriz

            System.out.println(" ");

            fillMatriz(array3);
            
            System.out.println(" ");
            
            cuadrado(array3);
            
            System.out.println(" ");
            
    }
    
    public static void fillMatriz(int[] array2){
    
        int contadorp = 0;
        int contadori = 0;
    // Llenado de la Matriz 
    
    Scanner lm = new Scanner(System.in);
        
        for(int i = 0; i < array2.length; i++){
            
            System.out.print("Ingrese el valor de la matriz en la poscicion: [" + (i + 1) + "]: ");
            array2[i] = lm.nextInt();
                
                if( (array2[i] % 2) == 0 ){
                    
                    contadorp++;
                
                }else{
                    
                    contadori++;
                    
                }
                
        }
        
        
        printMatriz(array2);
        
        System.out.println(" ");
        
        System.out.println("El Arreglo consta de " + contadorp + " numero pares y " + contadori + " numeros impares ");
        
    }
    
    public static void printMatriz(int array[]){
    
        System.out.println("\n-----Arreglo-----");
        System.out.println(" ");
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++){

            System.out.print( array[i] + " ");
                
            
        }
        
        System.out.print("]");
        
        System.out.println();
        
        }
    
    public static void cuadrado(int array[]){
        
        System.out.println("----Aregglo con numeros ^2-----");
        
        System.out.println("\n[ ");
        for(int i = 0; i < array.length; i++){
            
            array[i] = array[i] * array[i];
            System.out.print(array[i] + " ");  
        }
        
        System.out.println("] ");
    }
    
}
