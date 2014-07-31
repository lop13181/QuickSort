/*
 *  Universidad del Valle de Guatemala
 *  Algoritmos y estructura de datos
 *  Hoja de trabajo 3
 *  Método de ordenamiento QuickSort
 *  Programación Java by Enrique García Hernández
 *  http://puntocomnoesunlenguaje.blogspot.com.es
 */
package quicksort;

/*
 * @author Alberto
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void quicksort(int A[], int left, int right){
    
        int pivote = A[left];   // Toma el primer elemento del Array como pivote
        int i = left;           // Realiza la búsqueda de izquierda a derecha
        int j = right;          // Realiza la búsqueda de derecha a izquierda
        int intercambiar;
        
        while(i<j){             // Mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j){
                i++;            // Busca el elemento mayor que el pivote
            }
            while (A[j] > pivote){
                j--;            // Busca el elemento menor que el pivote
            }
            
            if (i<j){           // Si no se han cruzado los intercambia
                
                intercambiar = A[i];    // Los intercambia
                A[i] = A[j];
                A[j] = intercambiar;
            }               
        }
        
        A[left] = A[j];         // Se coloca el pivote justo en medio, para tener los
        A[j] = pivote;          // menores a la izquierda y los mayores a la derecha
        
        if (left < j-1)
            quicksort(A, left, j-1);    // Ordena el array que quedó a la izquierda
        
        if (j+1 < right)
            quicksort(A, j+1, right);   // Ordena el array que quedó a la derecha 
        }
    }
