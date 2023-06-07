package Practica1_02;

public class Practica12Bim2 {
    
    public static void main(String[] args) {
        
        // 
        
        Nodo obtA = new Nodo(8);
        System.out.println(obtA);
        
        Nodo obtB = new Nodo();
        System.out.println(obtB);
        
        
        obtA.enlazamiento(obtB);
        System.out.println("Next A: " + obtA.next+"\n");
        obtA.mostrarEnlazamiento();
    }
    
    
    
}
