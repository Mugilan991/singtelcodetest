package sintelAthree.codetest;

public enum constants {
	
	Male("Male","Cock-a-doodle-doo"),
	Female ("Female","cluk cluk"),
	Parrot_Dog ("Parrot_Dog","woof woof"),
	Parrot_cat ("Parrot_Dog","Me ow"),
	Parrot_rooster("Parrot_rooster","Cock-a-doodle-doo"),
	Parrot_ring("Parrot_ring","ring ring");
	
	
	
	private final String value;
	private final String Sound;
	
	constants(String value, String sound) {
		this.value = value;
		this.Sound = sound;
	}

	public String getValue() {
		return value;
	}

	public String getSound() {
		return Sound;
	}
	
	
	

}
