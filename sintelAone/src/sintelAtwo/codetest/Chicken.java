package sintelAtwo.codetest;

import sintelAthree.codetest.constants;

public class Chicken extends Bird implements terrestrial {
	
	private String sound;

	
	public Chicken(Boolean withWing) {
		super(terrestrial.singingSound(constants.Female),"Chicken",terrestrial.canSwim(),terrestrial.canWalk(),withWing?terrestrial.haveWings():terrestrial.doNothaveWings());
	
	}
	
	@Override
	public String toString() {
		return " \n"+ super.nameOfTheBird + " says as  " + super.sound   ;
	}
	
	

}
