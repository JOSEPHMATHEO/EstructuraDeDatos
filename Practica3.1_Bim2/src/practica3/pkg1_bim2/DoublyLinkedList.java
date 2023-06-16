package practica3.pkg1_bim2;

public class DoublyLinkedList {
    
    class Node{
    
        int data;
        Node previus;
        Node next;
        
        public Node(int d){
        
            data = d;
        
        }
    
    }
    
    Node head = null;
    Node tail = null;
    
    public void insert(int data){
        
        Node newNode = new Node(data);
        
        if(head == null){
        
            head = tail = newNode;
            
            head.previus = null;
            tail.next = null;
            
        }else{
        
            tail.next = newNode;
            newNode.previus = tail;
            tail = newNode;
            tail.next = null;
            
        }
        
    }
    
    public void print(DoublyLinkedList list){
    
        Node current = head;
        
        if(head == null){
            
            System.out.println("Lista Vacia");
            return;
        
        }
        
        System.out.println("Doble Linked Nodes:\n");
        
        byte i = 1;
        
        while(current != null){
            
            System.out.println( i + ") " + current.data + "");
            current = current.next;
            i++;
            
        }
        
    }
   
    
    
    
    
    
    
    
    
    
    
}

