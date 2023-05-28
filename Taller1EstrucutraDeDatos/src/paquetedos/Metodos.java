package paquetedos;
import java.util.Scanner;

public class Metodos {
    
    public static void presentacion(){
        
        //Presentacion del Programa
        
        System.out.println("================================================");
        System.out.println("Programa que traba con Arreglos Unidimensionales");
        System.out.println("================================================\n");
        
    }
    
    public static void presentacion1(){
        
        //Presentacion del Programa
        
        System.out.println("\n=====================");
        System.out.println("Creacion del Arreglo");
        System.out.println("=====================");
        
    }
    
    public static void presentacion2(){
        
        //Presentacion del Programa
        
        System.out.println("\n====================================");
        System.out.println("Busqueda de un numero en el Arreglo ");
        System.out.println("====================================");
        
    }
    
    public static void presentacion3(){
        
        //Presentacion del Programa
        
        System.out.println("\n====================================");
        System.out.println("Eliminacion de un numero del Arreglo ");
        System.out.println("====================================");
        
    }
    
    public static void presentacion4(){
        
        //Presentacion del Programa
        
        System.out.println("\n==========================================");
        System.out.println("Ordenamiento del Arreglo - Metodo Burbuja");
        System.out.println("==========================================");
        
    }
    
     public static void presentacion5(){
        
        //Presentacion del Programa
        
        System.out.println("\n=====================================");
        System.out.println("Ordenamiento del Arreglo - Quick-Sort");
        System.out.println("======================================");
        
    }
    
    
    
    public static int peticion(){
        
        // Declaracion de variables y Creacion de objetos

        Scanner lm = new Scanner(System.in);
        int num;
        
        // Peticion de Datos 

        System.out.print("Ingrese el numero de elementos que desea en su arreglo: ");
        num = lm.nextInt(); 
        
        return num;
    } 
    
    public static void dataRequest(int[] array){
    
        // LLenamos el Arreglo
        
        Scanner lm = new Scanner(System.in);
        
        System.out.println(" ");
        for(int i = 0; i < array.length ;i++ ){
        
            System.out.print("Ingrese los datos del arreglo en la posicion [" + (i+1) + "]: ");
            array[i] = lm.nextInt();
        
        }
   
    }
    
    public static int elementSearch(){
        
        // Declaracion de Objetos y Variables 
        
        Scanner lm = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese el numero que desea buscar en el arreglo: ");
        n = lm.nextInt(); 
        
        return n;
    
    }
    
    public static int positionSearch(int arreglo[],int element){
    
        for (int i = 0; i < arreglo.length; i++){
            
            if (arreglo[i] == element){
            
                return i;
            
            }
    
        }
        
        return -1;
        
    }
    
    public static int elementDelete(){
    
    // Declaracion de Objetos y Variables 
        
        Scanner lm = new Scanner(System.in);
        int n;
        
        System.out.print("Ingrese el numero que desea eliminar en el arreglo: ");
        n = lm.nextInt(); 
        
        return n;
    
    }
    
    public static void arrayWotElement(int arreglo [], int eleDel){
    
        int index = positionSearch(arreglo,eleDel);
        
        if(index != -1){
        
            for(int i = index; i < arreglo.length - 1; i++){
            
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = 0;
                
            }
            
        }else
            
            System.out.println("El elemento no existe");
                     
    }
    
    public static int[] OrdenarVector(int arreglo[]) {
        
        int aux;
        
        for (int lim = arreglo.length-1; lim >= 1; lim--) {
            
            for (int i = 0; i <= lim - 1; i++) {
                
                if (arreglo[i] < arreglo[i+1]) {
                    
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = aux;
                    
                }
                
            }
            
        }
        
        return arreglo;
        
    }
    
    public static void quickSort(int arr[], int izq1, int der1){
    
    
        if(izq1 < der1){
        
            int indexQuickSort = ordenamiento(arr,izq1,der1);
            quickSort(arr,izq1,indexQuickSort);
            quickSort(arr,indexQuickSort + 1, der1);
        
        }
    
    }
    
    
    public static int ordenamiento(int A[], int izq, int der) {
    
        // Elejimos el elemento que sera nuestro pivote 
        
        int pivote = A[izq];
        
        // Cilco de comparacion 
        
        while (true){
        
            // Mientras que el elemento que viene desde la izquiera
            // sea menor al pivote, continuara avanzando el indice
    
            while(A[izq] < pivote ){
            
                izq++;
            
            }
            
            // Mientras cada elemento que viene desde la derecha
            // sea mayor al pivote, continuara disminuyendo el indice
            
            while(A[der] > pivote ){
            
                der--;
            
            }
            
        // Si el elemento de la izquiera es mayor o igual que el elemento de la derecha 
        // significa que los elementos estan en orden, por lo que no es necesaro hacer 
        // un cambio de los elementos
        
            if (izq >= der){
                
                // Se empieza a dividir el arreglo desde el indice donde se detuvo
                // y se comienza a ordenar los elementos 
                
                return der;
            
            }else{
            
            // Si el elemento de la izquiera no supera o es igual a elemento de la derecha
            // significa que los elementos no estan en orden, por lo tanto se los 
            // intercambiaran
            
                int aux = A[izq];
                A[izq] = A[der];
                A[der] = aux;
                
            // Se intercambiaron los elementos, y los indices avanzan y disminuyen una vez mas
                
                izq++;
                der--;
            
            }
            
            // El cilo while se repite hasta que izquiera >= derecha
            
        }
        
    }
      
}
