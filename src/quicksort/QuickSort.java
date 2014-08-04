/*
 *  Universidad del Valle de Guatemala
 *  Algoritmos y estructura de datos
 *  Hoja de trabajo 3
 *  Método de ordenamiento QuickSort
 *  Professors de les assignatures PRG i EDA, dsic-etsia, UPV
 */
package quicksort;

/*
 * @author Alberto
 */
public class QuickSort {

      private static void intercambiar(Object a[], int ind1, int ind2 )	
   {
       Object tmp = a[ind1];	
       a[ind1] = a[ind2];
       a[ind2] = tmp;	
   }
   // QUICK SORT ------------------------------------------------------------------------------------
	
    /**
     *  Metodo para calculo de la Mediana de 3, devuelve el valor del pivote (Comparable)	
     */
   private static Comparable mediana3(Object  a[], int izq, int der )	
   {	
       int c=(izq+der)/2;	
       if (((Comparable)a[c]).compareTo((Comparable)a[izq])<0)   intercambiar (a,izq,c);
       if (((Comparable)a[der]).compareTo((Comparable)a[izq])<0) intercambiar (a,izq,der);
       //if (((Comparable)a[der]).compareTo((Comparable)a[c])<0)   intercambiar (a,c,der);
       
       if (((Comparable)a[der]).compareTo(a[c])<0)   intercambiar (a,c,der);
       // (ocultar el pivote en la posicion der-1
       intercambiar(a,c,der-1);
       return (Comparable)a[der-1];
   }
	
    /** 
     *  Algoritmo de ordenacion quicksort (Hoare -1963-)
     *  Utiliza el algoritmo de particion debido a Weiss, con mediana de 3
     *  para el calculo del pivote. 
     *  Los elementos del array a, de tipo Object, deben implementar el interfaz Comparable
     */
   public static void quickSort(Object a[]) {
       quickSort(a,0,a.length-1);
   }
   private static void quickSort(Object a[], int izq, int der )
   {
       if( izq<der )
       {
             Comparable pivot=mediana3(a,izq,der);
             int i=izq;

             int j=der-1;
             for( ; i<j; )
             {    // while(((Comparable)a[++i]).compareTo(pivot)<0) {}
                  // while(((Comparable)a[--j]).compareTo(pivot)>0) {}
                  while(pivot.compareTo(a[++i])>0) {}
                  while(pivot.compareTo(a[--j])<0) {}
                  intercambiar (a,i,j);
             }
             intercambiar (a,i,j);     // Deshacer el ultimo cambio
             intercambiar (a,i,der-1); // Restaurar el pivote
             quickSort(a,izq,i-1);     // Ordenar recursivamente los elementos menores
             quickSort(a,i+1,der);     // Ordenar recursivamente los elementos mayores
       }
   }
    // Metodos de comprobacion y auxialiares 

    /** 
     *  Para determinar si un array de Object, que implementen el interfaz Comparable  
     *  esta o no ordenado (ascen/descen)dentemente. 
     *  Si ascendente es true/false se comprueba la ordenacion ascendente/descendente
     *  a Sus elementos deben implementar el interfaz Comparable
     *  ascendentetrue/false --> comprobacion de orden ascendente/descendente 
     */
    public static boolean estaOrdenado(Object a[], boolean ascendente) {
	for (int i=0; i<a.length-1; i++) if (ascendente && (((Comparable)a[i]).compareTo(a[i+1])>0)) return false;
	else if (!ascendente && (((Comparable)a[i]).compareTo(a[i+1])<0)) return false;
        return true;
    }
}
