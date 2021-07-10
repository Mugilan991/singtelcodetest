package singtelAfour.codetest;

import sintelAthree.codetest.constants;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parrot parrot = new parrot(constants.Parrot_Dog);
	System.out.println(parrot.toString())	;
		
	parrot parrot1 = new parrot(constants.Parrot_cat);
	System.out.println(parrot1.toString())	;
	
	parrot parrot2 = new parrot(constants.Parrot_rooster);
	System.out.println(parrot2.toString())	;
	
	parrot parrot3 = new parrot(constants.Parrot_ring);
	System.out.println(parrot3.toString())	;
	
		
	}

}
