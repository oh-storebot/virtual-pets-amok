
public class RobotPets {

	private int oilLevel;
	String petName;

	public RobotPets(String petName2, int oil) {
		petName = petName2;
		oilLevel = oil;

	}

	public int getOilLevel() {
		return oilLevel;
	}

	public String getPetName() {
		return petName;
	}

	public void oilPet() {
		oilLevel += 30;
	}
	
	public void robotTick() {
		oilLevel -= 10;
	}

}
