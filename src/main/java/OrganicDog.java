
public class OrganicDog extends OrganicPets {

	private int cageLevel;
	public OrganicDog(String petName2, int hunger, int thirst, int cage) {
		super(petName2, thirst, hunger);
	}
	
	public int getCageLevel() {
		return cageLevel;
	}
	
	public void cleanCageLevel() {
		cageLevel += 30;
	}
}