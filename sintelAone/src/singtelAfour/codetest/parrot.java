package singtelAfour.codetest;

import sintelAthree.codetest.constants;
import sintelAtwo.codetest.Bird;
import sintelAtwo.codetest.terrestrial;

public class parrot extends Bird implements terrestrial{

	public parrot(constants consta) {
		super(terrestrial.singingSound(consta), "parrot", terrestrial.canSwim(), terrestrial.canWalk(), false);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return " \n"+ super.nameOfTheBird + " says as  " + super.sound   ;
	}
	
	

}
