import java.util.Scanner;

public class VirtualPetAmokApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.addNewCat();
		shelter.addNewCat();
		shelter.addNewDog();
		shelter.addNewDog();
		shelter.addNewRobot();
		shelter.addNewRobot();

		while (!input.equals("7")) {
			System.out.println("Choose and option");
			System.out.println("1. Feed your pets");
			System.out.println("2. Water your pets");
			System.out.println("3. Walk your dogs");
			System.out.println("4. Clean dog cages");
			System.out.println("5. Clean litterbox");
			System.out.println("6. Oil Robots");
			System.out.println("7. Quit");

			String menuOption = input.nextLine();

			if (menuOption.equals("1")) {
				for (OrganicCat cat : shelter.getCatsValues()) {
					cat.feedPet();
				}
				for (OrganicDog dog : shelter.getDogsValues()) {
					dog.feedPet();
				}

			}

			if (menuOption.equals("2")) {
				for (OrganicCat cat : shelter.getCatsValues()) {
					cat.waterPet();
				}
				for (OrganicDog dog : shelter.getDogsValues()) {
					dog.waterPet();
				}

			}

			if (menuOption.equals("3")) {
				for (OrganicDog dog : shelter.getDogsValues()) {
					dog.cleanCageLevel();
					dog.increaseHappinessLevel();
					dog.increaseHealthLevel();
				}

			}

			if (menuOption.equals("4")) {
				for (OrganicDog dog : shelter.getDogsValues()) {
					dog.cleanCageLevel();
				}

			}

			if (menuOption.equals("5")) {
				for (OrganicCat cat : shelter.getCatsValues()) {
					cat.cleanLiterbox();
				}
			}

			if (menuOption.equals("6")) {
				for (RobotPets bot : shelter.getRobotsValues()) {
					bot.oilPet();
				}
			}

			if (menuOption.equals("7")) {
				System.exit(0);
			}

			for (RobotPets bot : shelter.getRobotsValues()) {
				bot.robotTick();
			}

			for (OrganicCat cat : shelter.getCatsValues()) {
				cat.organicTick();
				cat.catTick();
			}

			for (OrganicDog dog : shelter.getDogsValues()) {
				dog.organicTick();
				dog.dogTick();
			}

			System.out.println("Name" + "\t|" + "Hunger" + "\t|" + "Thirst" + "\t|" + "Health" + "\t|" + "Cage" + "\t|"
					+ "Happiness");
			for (OrganicDog dog : shelter.getDogsValues()) {

				System.out.println(dog.getPetName() + "\t|" + dog.getHungerLevel() + "\t|" + dog.getThirstLevel()
						+ "\t|" + dog.getPetHealth() + "\t|" + dog.getCageLevel() + "\t|" + dog.getHappinessLevel());
			}
			System.out.println("Name" + "\t|" + "Hunger" + "\t|" + "Thirst" + "\t|" + "Health" + "\t|" + "Litter");
			for (OrganicCat cat : shelter.getCatsValues()) {

				System.out.println(cat.getPetName() + "\t|" + cat.getHungerLevel() + "\t|" + cat.getThirstLevel()
						+ "\t|" + cat.getPetHealth() + "\t|" + cat.getLitterboxLevel());
			}
			System.out.println("Name" + "\t|" + "Oil Level");
			for (RobotPets robot : shelter.getRobotsValues()) {

				System.out.println(robot.getPetName() + "\t|" + robot.getOilLevel());
			}

		} // end while loop
	}
}
