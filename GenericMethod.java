import java.util.*;
public class GenericMethod {

	public static void main(String[] arg){
		
		Integer[] a = {1,3,4,5,6};
		String[] b = {"Motorola" , "Samsung" , "Iphone" , "Sony"};
		
		printSorted(a);
		printSorted(b);
	}
	
	// Generic Method 
	 
	public static <T> void printSorted(T[] a){
		
		List<T> list = Arrays.asList(a);
		Collections.shuffle(list);
		
		for(T b : a){
		   
			System.out.printf("%s", b);
	
		   System.out.println();
		}
		
		
	}
}
