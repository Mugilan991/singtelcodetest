package sintelAthree.codetest;

import sintelAtwo.codetest.Bird;
import sintelAtwo.codetest.terrestrial;

public class rooster extends Bird implements terrestrial{

	
	public rooster() {
		super(terrestrial.singingSound(constants.Male),"rooster",terrestrial.canSwim(),terrestrial.canWalk(),true);
	
	}
	
	@Override
	public String toString() {
		return " \n"+ super.nameOfTheBird + " says as  " + super.sound  + "\n"+ nameOfTheBird  + super.canFly + "\n \n"  ;
	}
}
