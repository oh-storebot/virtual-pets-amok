
public class OrganicPets {

	protected int thirstLevel;
	protected int hungerLevel;
	protected String petName;
	protected int healthLevel;

	public OrganicPets(String petName2, int hunger, int thirst, int health) {
		petName = petName2;
		hungerLevel = hunger;
		thirstLevel = thirst;
		healthLevel = health;
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

	public int getPetHealth() {
		return healthLevel;
	}

	public void feedPet() {
		hungerLevel += 30;
		healthLevel += 30;
	}

	public void waterPet() {
		thirstLevel += 30;
		healthLevel += 30;
	}

	public void organicTick() {
		hungerLevel -= 10;
		thirstLevel -= 10;
		healthLevel -= 10;
	}
}
