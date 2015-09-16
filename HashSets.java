import java.util.*;



public class HashSets {

	
	public static void main(String[] a){
		
		String[] collection = {"onePlus" , "Motorola" , "Samsung" , "onePlus"};
		List<String> list =  Arrays.asList(collection);
		
	    
	    System.out.printf("%s", list);
	    System.out.println();
	    Set<String> set = new HashSet<String>(list);
	    System.out.printf("%s", set);
	    System.out.println();
		
		
	}
}
