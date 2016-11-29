package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	
	public static void fight(Pokemon p1, Pokemon p2){
		
		Random r = new Random();
		
		if(r.nextInt(2)==1){
			
			System.out.printf("Winner is " + p1.getNAME() + ".");
			
			p1.setCP(p1.getCP() + 500);
		
		}
		else{
			
			System.out.printf("Winner is " + p2.getNAME() + ".");
			
			p2.setCP(p2.getCP() + 500);
		}
	}
}
