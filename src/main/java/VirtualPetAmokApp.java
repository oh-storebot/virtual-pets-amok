
public class VirtualPetAmokApp {

	public static void main(String[] args) {
		
		OrganicPets pet = new OrganicPets("Bob", 100, 100);
		OrganicCat cat = new OrganicCat("Beth", 100,100,100);
		OrganicDog dog = new OrganicDog("Rick", 100,100, 100);
		
		System.out.println(pet.getHungerLevel());
		System.out.println(cat.getHungerLevel());
		cat.feedPet();
		System.out.println(cat.getHungerLevel());
		
		System.out.println(dog.getHungerLevel());
	}
}
