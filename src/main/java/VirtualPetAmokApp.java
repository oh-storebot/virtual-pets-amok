

public class VirtualPetAmokApp {

	public static void main(String[] args) {
		
		VirtualPetShelter shelter = new VirtualPetShelter();
		shelter.addNewCat();
		shelter.addNewCat();
		shelter.addNewDog();
		shelter.addNewDog();
		shelter.addNewRobot();
		shelter.addNewRobot();
		
//		OrganicPets pet = new OrganicPets("Bob", 100, 100);
//		OrganicCat cat = new OrganicCat("Beth", 100,100,100);
//		OrganicDog dog = new OrganicDog("Rick", 100,100, 100);
		
//		System.out.println(pet.getHungerLevel());
//		System.out.println(cat.getHungerLevel());
//		cat.feedPet();
//		System.out.println(cat.getHungerLevel());
//		
//		System.out.println(dog.getHungerLevel());
		System.out.println("Name" + "\t|" + "Hunger" + "\t|" + "Thirst" + "\t|" + "Cage");
		for (OrganicDog dog : shelter.getDogsValues()) {
			
			System.out.println(dog.getPetName() + "\t|" + dog.getHungerLevel() + "\t|" + dog.getThirstLevel() + "\t|" + dog.getCageLevel());
		}
		System.out.println("Name" + "\t|" + "Hunger" + "\t|" + "Thirst" + "\t|" + "Litter");
		for (OrganicCat cat : shelter.getCatsValues()) {
			
			System.out.println(cat.getPetName() + "\t|" + cat.getHungerLevel() + "\t|" + cat.getThirstLevel() + "\t|" + cat.getLitterboxLevel());
		}
		System.out.println("Name" + "\t|" + "Oil Level");
		for (RobotPets robot : shelter.getRobotsValues()) {
			
			System.out.println(robot.getPetName() + "\t|" + robot.getOilLevel());
		}
		System.out.println("PRint test");
	}
}
