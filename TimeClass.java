
public class TimeClass {
	
	public static void main(String[] args){
		
    MultipleConstructor  MCO = new MultipleConstructor(2,3 ,6);
	SetTimeClass setTimeClassObject  = new SetTimeClass();
	setTimeClassObject.setTime(3, 45, 4);
	System.out.print(setTimeClassObject.toMilitaryTime());
	System.out.println("\n"+MCO.displayTime());
	
	
		
	}

}
