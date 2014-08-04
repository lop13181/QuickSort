import java.util.Random;
public class Grandom{
    
    public int[] randomList;
    
    public Grandom(){
        randomList = new int[2000];
        generarRandom();
    }
    public int[] generarRandom(){
       Random randomGenerator = new Random();
       for (int i = 0; i < 2000; ++i){
       int randomInt = randomGenerator.nextInt(9999);
	   System.out.println(randomInt);
       randomList[i] = randomInt;
       }
       return randomList;
    }
   public int[] getGenerarRandom(){
       return randomList;
   }
}