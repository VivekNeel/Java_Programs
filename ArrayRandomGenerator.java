 import java.util.Random;
 
public class ArrayRandomGenerator {
  
	
	
	public static void main(String[] args){
		
		Random  arrayGenerator = new Random() ;
		int[] a =  new int[40]; 
		 
		for(int roll = 0 ; roll < 180 ; roll++){
			++a[arrayGenerator.nextInt(30)] ;
			
		}
		
		System.out.println("Index\tRandomValues");
		for(int index= 0 ; index < a.length ; index++){
			System.out.println(index + "\t" + a[index]);
		}
	}
}
