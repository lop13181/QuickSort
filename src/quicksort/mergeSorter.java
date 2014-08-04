public class mergeSorter{

public Comparable[] mergeSort(Comparable[] array){
  int length = array.length;
  //si tamano es 1, arreglo ya esta ordenado por definicion
  if(length<=1){
    return array;
  }
  
  else{
	//nuevo arreglo de tamano length para guardar arreglo ordenado
    Comparable[] sorted = new Comparable[length];
    //encontrar punto medio del arreglo
	int middle = length/2;
	//rest es el indice para empezar segundo mitad
    int rest = length-middle;
	//crear dos arreglos, uno para primer mitad, otro para segundo
    Comparable[] left = new Comparable[middle];
    Comparable[] right = new Comparable[rest];
	//copiar los dos mitades a los nuevos arreglos
	//arraycopy(source, sourceStartingIndex, destination, destinationStartingIndex, length)
    System.arraycopy(array, 0, left, 0, middle);
    System.arraycopy(array, middle, right, 0, rest);
    //llamada reflexiva para seguir dividiendo arreglos hasta que son de tamano 1
	left = this.mergeSort(left);
    right = this.mergeSort(right);
	//llamar a merge para sort y juntar los arreglos divididos
    sorted = merge(left, right);
    return sorted;
  }
}
 
 //metodo para merge, en donde arreglos son sorteado
public Comparable[] merge(Comparable[] L, Comparable[] R){
  int lengthL = L.length;
  int lengthR = R.length;
  //crear nuevo arreglo para guardar resultados del merge
  Comparable[] merged = new Comparable[lengthL+lengthR];
  //dos contadores	
  int i = 0;
  int j = 0;
  //hasta que llega al fin de los dos arreglos
  while(i<lengthL||j<lengthR){
    //si todavia no ha llegado al fin de algun arreglo
    if(i<lengthL & j<lengthR){
      //comparar los numeros en cada indice
	  if(L[i].compareTo(R[j])<=0){
		//si numero en L es mas pequeno, guardar en merged[i+j]
		//suma de los dos indices es indice actual de merged
        merged[i+j] = L[i];
        //incrementar i
		i++;
      }
	  //si no, guardar numero de R[j] y incrementar j
      else{
        merged[i+j] = R[j];
        j++;
      }
    }
	//si uno de los dos arreglos ya esta vacia
	//si L todavia tiene algo, guardar numero en merged y incrementar indice
    else if(i<lengthL){
      merged[i+j] = L[i];
      i++;
    }
	//si R todavia tiene algo, guardar numero en merged y incrementar indice
    else if(j<lengthR){
      merged[i+j] = R[j];
      j++;
     }
   }
   //return arreglo ordenado
   return merged;
}
}