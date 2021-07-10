package singtelBTwo.codetest;

import singtelBOne.codetest.Fish;
import singtelBOne.codetest.seaAnimals;

public class Shark extends Fish implements seaAnimals {
	
	public Shark(size size,color color){
		super(size,color);
	}
	

		
		seaAnimals s1 =()-> { System.out.println("shark can eat other fish"); };
	
	
		@Override
		public String toString() {
			return "Shark [size=" + size + ", color=" + color + "]";
		}
}
