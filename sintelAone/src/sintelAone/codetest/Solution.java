package sintelAone.codetest;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		bird.fly();
		bird.walk();
		
		/* Description:: compilation error 
		 * bird.sing();
		 * 
		 * Method sing() is not declared or initiated in either of the class bird or Animal 
		 * 
		 * Hence Object of Bird cannot call sing() method, it will have a compilation error
		 */
		
		
	}

}
