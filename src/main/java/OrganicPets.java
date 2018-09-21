
public class OrganicPets {

	private int thirstLevel;
	private int hungerLevel;
	String petName;

	public OrganicPets(String petName2, int hunger, int thirst) {
		petName = petName2;
		hungerLevel = hunger;
		thirstLevel = thirst;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public String getPetName() {
		return petName;
	}
	
	public void feedPet() {
		hungerLevel += 30;
	}

	public void waterPet() {
		thirstLevel += 30;
	}
}
