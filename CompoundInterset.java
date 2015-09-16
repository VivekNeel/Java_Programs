
public class CompoundInterset  {
	
	public static void main(String[] args){
		
		// formula  , a = p(1+R)^n 
		
		double a ;
		double p = 9000 ;
		double r = 0.02 ;
		for(int i = 1 ; i <=30 ; i++){
			
			a = p*Math.pow(1+r, i);
			System.out.println("Day: "  + i + " Interest: " + a);
		}
		
	}

}
