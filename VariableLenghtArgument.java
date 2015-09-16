
public class VariableLenghtArgument {
	
	public static void main(String[] args){
		
		int a[] = {1,2,3,4 };
		System.out.print(printAverage(a));
		
				}
	
	public static int printAverage(int...numbers){
       int total = 0 ;
		for(int x : numbers){
			total = total + x;
		}
		
		return total/numbers.length ;
	}
}
		
	


