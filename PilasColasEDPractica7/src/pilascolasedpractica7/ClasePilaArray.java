package pilascolasedpractica7;

import java.util.Scanner;


public class ClasePilaArray {
    
    int[] pila;
    int tope;
    int max;
    
    Scanner lm = new Scanner(System.in);
    
    // Crrar clase y valor max
    
    public ClasePilaArray(int m){
    
        tope = -1;
        max = m;
        pila = new int[max];
        
    }
    
    public int getTope(){
    
        return tope;
    
    }
    
    public void vaciarPila(){
    
        tope = -1;
    
    }
    
    public boolean pilaLlena(){
    
        if ((max - 1) == tope){
        
            return true;
            
        }else{
        
            return false;
        
        }
    
    }
    
    public boolean pilaVacia(){
    
        if(tope == -1){
        
          return true;  
        
        }else{
        
        return false;
        
        }
    
    }
    
    public void insertarPila(){
    
        if(pilaLlena()){
        
            System.out.println("Pila Llena");
            
        }else{
        
            int item;
            System.out.print("Ingrese item a insertar: ");
            item = lm.nextInt();
            tope ++;
            pila[tope] = item;
            System.out.println("El item " + item + " se ha insertado");
            
        }
        
    }
    
    public void eliminarPila(){
    
        if(pilaVacia()){
        
            System.out.println("Pila Vacia");
            
        }else{
        
            int item = pila[tope];
            tope --;
            System.out.println("\nEl item " + item + " se ha eliminado");
        
        }
    
    }
    
    public void imprimePilaTope(){
    
        for(int i=0; i <= tope; i++ ){
        
        System.out.print(pila[i] + " ");
        
        }
    
    
    }
    
    public void imprimePilaMax(){
    
        for(int i=0; i < max; i++ ){
        
        System.out.print(pila[i] + " ");
        
        }
        
    }
}
