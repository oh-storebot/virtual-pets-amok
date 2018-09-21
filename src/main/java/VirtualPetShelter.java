import java.util.Collection;
import java.util.HashMap;



public class VirtualPetShelter {

	private HashMap<String, OrganicCat> oCats = new HashMap<String, OrganicCat>();
	private HashMap<String, OrganicDog> oDogs = new HashMap<String, OrganicDog>();

	public void VirtualPetShelter() {

	}
	
	public Collection<OrganicCat> getOrganicCatValues() {
		return oCats.values();
	}
	
	public Collection<OrganicDog> getOrganicDogValues() {
		return oDogs.values();
	}
	
	
	
}