package singtelBThree.codetest;

import singtelBOne.codetest.seaAnimals;
import sintelAone.codetest.animal;

public class dolphin extends animal implements seaAnimals  {
	
	
	
	protected String canSwim;
	protected String canWalk;
	protected String canSing;
	
	public dolphin() {
		
		this.canSwim = String.valueOf(seaAnimals.canSwim());
		this.canWalk = String.valueOf(seaAnimals.canWalk());
		this.canSing = String.valueOf(seaAnimals.canSing());
		
	}
	@Override
	public String toString() {
		return "dolphin [canSwim=" + canSwim + ", canWalk=" + canWalk + ", canSing=" + canSing + "]";
	}
	seaAnimals s11 =()-> { System.out.println("dolphins are not fish but they can swim"); };

	@Override
	public void trait() {
		// TODO Auto-generated method stub
		
	}

}
