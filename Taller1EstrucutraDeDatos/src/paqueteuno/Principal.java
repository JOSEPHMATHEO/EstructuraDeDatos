package paqueteuno;

import java.util.Arrays;
import java.util.Scanner;
import static paquetedos.Metodos.*;

import static paquetedos.Metodos.presentacion;

public class Principal {
    
    public static void main(String[] args) {
        
        // Declaracion de Varaibles y Objetos
        
        int opcion;
        Scanner lm = new Scanner(System.in);
        
        
        // Llamamos al metodo del paquetedos que contiene la 
        // presentacion del programa 
         
        presentacion();

        // Creamos y Dimensionamos el arreglo
        
        System.out.println("Que desea hacer con su arreglo?");
        opcion = lm.nextInt();
        
        while(true){
        
            switch(opcion){
            
                case 1: 
                    
                    
            
            
            
            
            }
        
        
        
        
        }
        
        presentacion1();
        int array[] = new int[ peticion()];
        
        // Llamamos a la funcion que contiene el metodo de 
        // peticion de Datos 
       
        dataRequest(array);
        
        // Presentamos el Arreglo
        
        System.out.println("\nSu Arreglo es: ");
        System.out.println(Arrays.toString(array));
        
        // Buscamos un Elemento dentro de Arreglo 
        
        presentacion2();
        int s = elementSearch();
        
        // Presentamos la posisicion del elemento dentro del arreglo
        
        System.out.println("La posisicion del elementos es: " + positionSearch(array,s));
        
        // Eliminamos un numero dentro del Arreglo
        
        presentacion3();
        int e = elementDelete();
        
        // Presentamos el Arreglo con el numero eliminado
        
        System.out.println("El arreglo sin el elemento seleccionado es: ");
        
        arrayWotElement(array,e);
        System.out.println(Arrays.toString(array));
        
        // Presentacion del arreglo ordenado por el metodo Burbuja
        
        presentacion4();
        System.out.println(Arrays.toString(OrdenarVector(array)));
        
        // Presentacion del arreglo ordenado por el metodo Burbuja
        
        presentacion5();
        quickSort(array,0, array.length - 1);
        System.out.println(Arrays.toString(array));
        
    }
    
}
