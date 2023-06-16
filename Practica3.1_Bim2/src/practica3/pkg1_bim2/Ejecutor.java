package practica3.pkg1_bim2;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        DoublyLinkedList dList = new DoublyLinkedList();
        
        System.out.println("--Elemntos de la Lista--\n");
        dList.insert(5);
        dList.insert(2);
        dList.insert(3);
        dList.insert(14);
        dList.insert(1);
        
        dList.print(dList);
        
    }
    
}
