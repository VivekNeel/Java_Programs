import java.util.Scanner;


public class BasicCalci {
	
	public static void main(String[] args){
		
		double a , b, c;
		System.out.println("Enter the Inputs:");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
	    b = input.nextDouble();
	    c = a + b;
	    System.out.print("The addition of " +a+ "and" +b+ "is" + c);
	    
	}

}

/*http://www.androidbegin.com/tutorial/android-search-filter-listview-images-and-texts-tutorial/ */