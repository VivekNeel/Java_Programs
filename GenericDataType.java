  
public class GenericDataType {
 
	
	public static void main(String[] args){
		
		System.out.print(printMax(22 ,55,66));
		System.out.println();
		System.out.print(printMax("Oneplus" ,  "sony" , "samsungss"));
		System.out.println();
	}
	
	public static <T extends Comparable<T>> T printMax(T a , T  b , T c){
		
		T maximum = a ;
		if(b.compareTo(maximum) > 0)
			maximum  = b ;
		if(c.compareTo(maximum) > 0 )
			maximum  = c ;
			
			return maximum ;
          		
		
		
	}
}
