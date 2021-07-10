package sintelAone.codetest;



/* Description 
 * 
 * for Optimal code used interface with default so value cannot be changed
 */


public interface behaviour {
	
	default public void walk() {
		 System.out.println("i am walking");
	 }
	
	default public void fly() {
		System.out.println("i am flying");
	}

}
