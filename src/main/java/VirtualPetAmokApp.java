

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
		
		for (OrganicCat cat : shelter.getPetsValues()) {

			System.out.println(cat.getPetName() + "\t|" + cat.getHungerLevel() + "\t|" + cat.getThirstLevel());
		}
		System.out.println("PRint test");
	}
}
