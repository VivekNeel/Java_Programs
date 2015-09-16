import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CollectionSort {
 
	public static void main(String arg[]){
		
		String[] s = {"apple" , "b" , "c" , "d"};
		List<String> list = Arrays.asList(s);
		
		Collections.sort(list);
		System.out.println("%s\n" +list);
		Collections.sort(list , Collections.reverseOrder());
		System.out.println(list);
		
		
		
	}
}
