package singtelCone.codettest;

public interface pecticides {
	
	public default  Boolean canFly() {
		return true;
		
	}
	
	public default Boolean canSing() {
		return true;
		
	}
	
	public default Boolean canWalk() {
		return true;
		
	}
	
	public default  Boolean canFly(caterpiller C) {
		return false;
		
	}
	

	public default  Boolean canWalk(caterpiller C) {
		return true;
		
	}
	
		

		
}
