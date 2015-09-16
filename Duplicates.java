import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Duplicates {
   
	
	public static void main(String[] a){
		 
		int n ;
		Scanner number = new Scanner(System.in);
		String[] names = new String[16];
		n = number.nextInt();
		for(int i = 0 ; i < 16 ;  i++){
			 names[i]=  number.next();
				}  
		 
		List<String>  list = Arrays.asList(names); 
		Set<String>  set = new HashSet<String>(list);
		
		System.out.print(set);
		
	}
}
