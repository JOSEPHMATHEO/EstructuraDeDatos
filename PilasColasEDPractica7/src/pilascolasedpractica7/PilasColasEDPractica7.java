package pilascolasedpractica7;
import pilascolasedpractica7.ClasePilaArray.*;


public class PilasColasEDPractica7 {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        ClasePilaArray pila = new ClasePilaArray(5);
        
        pila.insertarPila();
        pila.insertarPila();
      
        pila.imprimePilaTope();
        
        pila.eliminarPila();
        pila.imprimePilaTope();
        
        System.out.print("\n======================\n");
        pila.imprimePilaMax();
        
    }
    
}
