package singtelBOne.codetest;

import sintelAone.codetest.animal;

public class Fish extends animal implements seaAnimals {
	
	public enum size {Large,small};
	public enum color { Grey, Orange};
	
	public size size;
	public color color;
	
	public Fish(singtelBOne.codetest.Fish.size size, singtelBOne.codetest.Fish.color color) {
		super();
		this.size = size;
		this.color = color;
	}
	
	

	@Override
	public String toString() {
		return "Fish [size=" + size + ", color=" + color + "]";
	}



	@Override
	public void trait() {
		// TODO Auto-generated method stub
	
	}

	
	
	

}
