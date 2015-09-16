import java.util.*;
public class OverloadingMethods {
 
	
	public static void main(String[] a){
		
		 Integer[] intege = {1,2,3,4,5,6,7};
		String[] string = {"aaa" , "dddd" , "ddddddgd"};
		
		printSorted(intege);
		printSorted(string);
		
	}
	
	public static void printSorted(Integer[] b){
		
		List<Integer> list = Arrays.asList(b);
		Collections.sort(list);
		System.out.printf("%s", list);
		System.out.println();
		
		
		
	}
	

	public static void printSorted(String[] b){
		
		List<String> list = Arrays.asList(b);
		Collections.sort(list);
		System.out.printf("%s", list);
		System.out.println();
		Collections.reverse(list);
		System.out.printf("%s", list);
		System.out.println();
		
		
		
	}
}
