import java.util.*;
public class ArrayTable {
 
	
	public static void main(String[] args){
		
		
		System.out.println("Index\tValues");
		int[] a = new int[5];
		Scanner b =  new Scanner(System.in);
		for(int i = 0 ; i < a.length ; i++){
			a [i] = b.nextInt();
			System.out.println(i +"\t" + a[i]);
		}
	}
}
