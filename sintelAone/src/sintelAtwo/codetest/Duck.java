package sintelAtwo.codetest;

import singteleone.counter;
import sintelAone.codetest.animal;

public class Duck extends Bird implements amphibian,counter{
	
	private String sound;

	private String canSwim;
	private String canWalk;
	
	
	
	
	
	public Duck() {
		super("Quack quack ","Duck",amphibian.canSwim(),amphibian.canWalk(),false);
		animal.fly_count += (amphibian.canSwim()) ? animal.fly_count:animal.fly_count+animal.zero;
		animal.walk_count += (amphibian.canWalk()) ? animal.walk_count: animal.walk_count+animal.zero;

		
		
	}
	

	@Override
	public String toString() {
		return "\n \n"+ super.nameOfTheBird + " says as  " + super.sound  + "\n"+ nameOfTheBird  + super.canSwim + "\n \n"  ;
	}
    


}
