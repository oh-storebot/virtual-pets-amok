import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;


public class VirtualPetShelter {

	private String petName;
	private HashMap<String, OrganicCat> oCats = new HashMap<String, OrganicCat>();
	private HashMap<String, OrganicDog> oDogs = new HashMap<String, OrganicDog>();
	private HashMap<String, RobotPets> rPets = new HashMap<String, RobotPets>();

	public void VirtualPetShelter() {

	}

	Scanner input = new Scanner(System.in);

	public Collection<OrganicCat> getOrganicCatValues() {
		return oCats.values();
	}

	public Collection<OrganicDog> getOrganicDogValues() {
		return oDogs.values();
	}

	public void addNewCat() {

		System.out.println("What is the cat's name? ");
		petName = input.nextLine();
		oCats.put(petName, new OrganicCat(petName, 100, 100, 100));

	}

	public void addNewDog() {

		System.out.println("What is the dog's name? ");
		petName = input.nextLine();
		oDogs.put(petName, new OrganicDog(petName, 100, 100, 100, 100));

	}

	public void addNewRobot() {

		System.out.println("What is the robot's name? ");
		petName = input.nextLine();
		rPets.put(petName, new RobotPets(petName, 100));

	}

	public Collection<OrganicCat> getCatsValues() {
		return oCats.values();
	}

	public OrganicCat getCat(String petName) { // this is the thing to understand the most
		return oCats.get(petName);
	}
	

	public Collection<OrganicDog> getDogsValues() {
		return oDogs.values();
	}
	
	public OrganicDog getDog(String petName) { // this is the thing to understand the most
		return oDogs.get(petName);
	}
	
	public Collection<RobotPets> getRobotsValues() {
		return rPets.values();
	}
	
	public RobotPets getRobot(String petName) { // this is the thing to understand the most
		return rPets.get(petName);
	}
}