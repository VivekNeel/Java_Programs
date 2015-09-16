   

import java.util.EnumSet;
public class EnumerationMain {
    
	public static void main(String[] args){
		
		for(Enumeration e :EnumSet.range(Enumeration.samsung, Enumeration.oneplus)){
			  
			System.out.printf("%s %s \n" , e , e.getDesc() );
		}
	}
}
