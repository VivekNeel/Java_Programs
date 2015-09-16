import java.util.Random;


public class RandomNumber {
    
	
	public static void main(String[] args){
		
		Random generator = new Random();
		
		int  number =0 ;
		for(int roll = 0 ; roll <50; roll++){
			number = generator.nextInt(70);
			
		}
		
		System.out.println(number);
		
	}
}
