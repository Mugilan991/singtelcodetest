package singtelBTwo.codetest;

import singtelBOne.codetest.Fish;
import singtelBOne.codetest.seaAnimals;

public class ClownFish extends Fish implements seaAnimals {
	
	public ClownFish(size size,color color){
		super(size,color);
	}
	
	
	seaAnimals s1 =()-> { System.out.println("shark can cark jokes"); };
	

	@Override
	public String toString() {
		return "CLownfish [size=" + size + ", color=" + color + "]";
	}
	
	

}
