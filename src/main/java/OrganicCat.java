
public class OrganicCat extends OrganicPets {

	
	private int litterboxLevel;

	public OrganicCat(String petName2, int hunger, int thirst, int litterbox) {
		super(petName2, hunger, thirst, litterbox);
		litterboxLevel = litterbox;
	}

	public int getLitterboxLevel() {
		return litterboxLevel;
	}
	
	public void cleanLiterbox() {
		litterboxLevel += 30;
	}
	
}
