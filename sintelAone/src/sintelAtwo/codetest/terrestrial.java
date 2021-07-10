package sintelAtwo.codetest;

import sintelAthree.codetest.constants;

public interface terrestrial {

	public static Boolean canSwim() {
		return false;
		
	}
	
	public static  Boolean canWalk() {
		return true;
		
	}
	
		public static Boolean haveWings() {
			
			return true;
		}
		
public static Boolean doNothaveWings() {
			
			return false;
		}
		
public static String singingSound(constants Gender) {
	
	
	switch (Gender){
	
	case Female :
		return Gender.getSound();
	case Male :
		return Gender.getSound();	
	case Parrot_Dog:
		return Gender.getSound();
	case Parrot_cat:
		return Gender.getSound();
	case Parrot_rooster: 
	   return Gender.getSound();
	   
	case Parrot_ring: 
		   return Gender.getSound();
	default:
		
		return "";
	}
}
	
}
