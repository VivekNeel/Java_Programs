
public class PolyList  {
   
	
	  Polyparent theList[] = new Polyparent[3];
	  
	  private int i = 0 ;
	  public void addObject(Polyparent x){
		  if(i<theList.length){
			  theList[i] = x;
			  System.out.printf("Objected added at index %d" , i);
			  i++;
		  }
		  
		  
		  
	  }
}
