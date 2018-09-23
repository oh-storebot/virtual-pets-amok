
public class OrganicDog extends OrganicPets {

	private int cageLevel;
	private int happinessLevel;

	public OrganicDog(String petName2, int hunger, int thirst, int health, int cage, int happiness) {
		super(petName2, thirst, hunger, cage);
		cageLevel = cage;
		happinessLevel = happiness;
	}

	public int getCageLevel() {
		return cageLevel;
	}

	public void cleanCageLevel() {
		cageLevel += 30;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	public void increaseHappinessLevel() {
		happinessLevel += 30;
	}

	public void increaseHealthLevel() {
		healthLevel += 30;
	}

	public void dogTick() {
		cageLevel -= 10;
		happinessLevel -= 10;
		healthLevel -= 10;
	}
}