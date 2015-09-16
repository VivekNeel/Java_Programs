
 public class StaticExampleMain  {
	 
	 
	 public static void main(String[] args){
		 StaticClass object = new StaticClass("vivek" , "kumar" );
		 
		 StaticClass object1 = new StaticClass("vivek" , "kumar" );
		 StaticClass object2 = new StaticClass("vivek" , "kumar" );
		 
		 System.out.printf("%d" , object.getMembers());
		 System.out.println("\n" +StaticClass.getMembers());
			
	 }

}
