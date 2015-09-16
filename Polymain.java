
public class Polymain  {
   
	
	
	public static void main(String[] args){
		
		Polyparent po[] = new Polyparent[2];
		Polyparent pos = new Polyparent();
		PolyList plo = new PolyList();
		
		plo.addObject(po[0]);
		plo.addObject(po[1]);
		po[0] = new Polysub();
		po[1] = new Polysub2();
		Polyargument poo = new Polyargument();
		poo.ar(pos);
		
		for(int i = 0 ; i <2 ; i++){
			po[i].display();
		}
		
	}
} 
