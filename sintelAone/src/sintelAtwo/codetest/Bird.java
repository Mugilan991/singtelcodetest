package sintelAtwo.codetest;

import sintelAone.codetest.animal;

public abstract class Bird extends animal{
	
	protected String sound;
	protected String nameOfTheBird;
	protected String canSwim;
	protected String canWalk;
	protected String canFly;

	
	public Bird(String sound,String nameOfTheBird,Boolean canSwim ,Boolean canWalk,Boolean canFly ) {
		this.sound = sound;
		this.nameOfTheBird=nameOfTheBird;
		this.canSwim = (canSwim)?" can swim":" cannot swim";
		this.canWalk = (canWalk)?" can walk":" cannot walk";
		this.canFly = (canFly)?" can Fly":" cannot Fly";
		
	}
	
	public String sing() {
		
		return nameOfTheBird + "Says as "+ sound + "nameOfTheBird : "+ canSwim + "nameOfTheBird: "+ canWalk ;
	}

	@Override
	public String toString() {
		return "\n \n"+ nameOfTheBird + " says as  " + sound   + "\n"+ nameOfTheBird  + (canSwim)  + "\n"+ nameOfTheBird + 
				canWalk + "\n \n"  ;
	}

}
