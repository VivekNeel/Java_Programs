
public class MultiDArray {
   public static void main(String[] arg){
	
	int a[][] = {{1,2,3,4}, {2,3,4,5,6} , {4,5,6}};
	int b[][] = {{1,2,3,4}, {2,3,4,5,6} , {4,5,6}};
	System.out.print("a array\n");
	display(a);
	System.out.printf("B array");
	display(b);
   }
   
   public static void display(int x[][]){
	   
	   for(int row=0 ; row < x.length ; row++){
		   for(int c = 0 ; c<x[row].length ; c++){
			   System.out.print(x[row][c] + "\t");
		   }
		   System.out.println();
	   }
   }
}
