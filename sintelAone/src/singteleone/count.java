package singteleone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import singtelAfour.codetest.parrot;
import singtelBOne.codetest.Fish;
import singtelBThree.codetest.dolphin;
import singtelBTwo.codetest.ClownFish;
import singtelBTwo.codetest.Shark;
import singtelCone.codettest.Butterfly;
import singtelCone.codettest.caterpiller;
import sintelAone.codetest.animal;
import sintelAthree.codetest.constants;
import sintelAthree.codetest.rooster;
import sintelAtwo.codetest.Bird;
import sintelAtwo.codetest.Chicken;
import sintelAtwo.codetest.Duck;

public class count extends animal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 animal[] animals = new animal[]{ new Duck(),new Chicken(false),new rooster(),new parrot(constants.Parrot_rooster),new Shark(null, null),new ClownFish(null, null),new dolphin(),new Butterfly(),new caterpiller() }; 
		 int count_swim=0,count_walk=0;
			for (int i = 0; i < animals.length; i++) {
				  Field[] employeeFields = animals[i].getClass().getDeclaredFields();
				  for (int j = 0; j < employeeFields.length; j++) {
			            
					  count_swim = (employeeFields[j].getName().equalsIgnoreCase("canSwim")) ? count_swim+1 : count_swim+0;
					  count_walk = (employeeFields[j].getName().equalsIgnoreCase("canWalk")) ? count_walk+1 : count_walk+0;
			            
				  }
				  
		        } 
			
			System.out.println(count_swim+","+ count_walk);
		
	}
	
	


}
