
package singtelBTwo.codetest;
import singtelBOne.codetest.Fish;
import singtelBOne.codetest.Fish.color;
import singtelBOne.codetest.Fish.size;
import sintelAthree.codetest.constants;

public class Sollution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shark shark = new Shark(size.Large,color.Grey);

		shark.s1.trait();
		
		System.out.println(shark.toString()); 
		
		ClownFish clofish = new ClownFish(size.small,color.Orange);

		clofish.s1.trait();
		System.out.println(clofish.toString()); 
		
		
		
		
		
		
	}

}
