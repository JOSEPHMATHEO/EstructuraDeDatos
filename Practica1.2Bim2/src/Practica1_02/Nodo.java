package Practica1_02;

public class Nodo {
    
    int dato;
    Nodo next;
    
    public Nodo(){
        
        dato = 0;
        next = null;
        
    }
    
    public Nodo(int a ){
        
        dato = a;
        next = null;
        
    }
    
    public void enlazamiento( Nodo n){
        
        next = n;
        
    }
    
    public void mostrarEnlazamiento(){
    
        System.out.printf("Dato: %d\n"
               +"Next: %s\n",
                dato,
                next);
        
    }
    
}
