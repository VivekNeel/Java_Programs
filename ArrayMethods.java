
public class ArrayMethods {
	
	public static void main(String[] args){
		
		int a [] = {1,2,3,4,5,6};
		System.out.print(displaySum(a));
	}
 
	public static int displaySum(int add[]){
		int total =0;
		for(int x : add){
			total = total + x;
		}
		return total;
		
		
	}
}
