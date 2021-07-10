package singtelCone.codettest;

public class caterpiller extends Butterfly implements pecticides  {
	
	 protected String canFly;
		
	 protected String canWalk;
	
	public void transform (caterpiller cater) {
		
	
		canFly= String.valueOf(canFly(cater));
		canWalk= String.valueOf(canWalk(cater));
		
		
		
		
	}

	@Override
	public String toString() {
		return "caterpiller [canFly=" + canFly + ", canWalk=" + canWalk + "]";
	}

	
	
	

}
