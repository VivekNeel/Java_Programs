
public class Polymorphmain {
	
	public static void main(String[] args){
		
		Animal theList[]  = new Animal[2];
		
		theList[0] = new DOg();
		theList[1] = new Fish() ;
		for(Animal x : theList){
			x.bark();
		}
	}

}
