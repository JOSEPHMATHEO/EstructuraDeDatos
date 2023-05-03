package paqueteuno;

import paquetedos.Ordenamiento;

public class Ejecutor {

    public static void main(String[] args) {
        
        // Creacion de variables 
        
        int array[] = {8,40,15,10,32,5,7};
        // Crear Objeto
        
        Ordenamiento od = new Ordenamiento();
        
        // LLamamos a la funcion ordenarQuickSort
        
        od.ordenarQuickSort(array);// pasamos como parametro el array
        
        // Presentacion del arreglo ordenado 
        
        System.out.print("[");
        
        for(int i = 0; i < array.length; i++){
        
            System.out.print(array[i] + ",");
        
        }
        
        System.out.print("]");
        
    }
    
}
