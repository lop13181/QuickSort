public class BubbleSort {
    private int[] numero;
    public BubbleSort( int [ ] num )
{
    numero = num; 
    int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < numero.length -1;  j++ )
            {
                   if ( numero[ j ] > numero[j+1] )   // change to > for ascending sort
                   {
                           temp = numero[ j ];                //swap elements
                           numero[ j ] = numero[ j+1 ];
                           numero[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred 
                  }
            }
      }
}
  public int[] getBubbleSort(){
      return numero;
  }
   
}