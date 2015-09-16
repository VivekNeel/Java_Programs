import java.util.Scanner;

 
public class IntroductionToArray {
 
	public static void main(String[] args){
		
		int s[] = new int[5];
		Scanner n = new Scanner(System.in);
		
		for(int i = 0 ; i <s.length ;i++){
			s[i] = n.nextInt();
			System.out.println(s);
		}
		
	}
}
