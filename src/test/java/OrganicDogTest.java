import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicDogTest {

	@Test
	public void shouldCreateNewDog() {
		OrganicDog dog = new OrganicDog("bob", 100, 100, 100, 100, 100);
	}

	@Test
	public void shouldHave100Hunger() {
		OrganicDog pet = new OrganicDog("bob", 100, 100, 100, 100, 100);
		int number = pet.getHungerLevel();
		assertEquals(100, number);
	}

	@Test
	public void shouldHave100Thirst() {
		OrganicDog pet = new OrganicDog("bob", 100, 100, 100, 100, 100);
		int number = pet.getThirstLevel();
		assertEquals(100, number);
	}
	
	@Test
	public void shouldHave100Cage() {
		OrganicDog pet = new OrganicDog("bob", 100, 100, 100, 100, 100);
		int number = pet.getCageLevel();
		assertEquals(100, number);
	}
	
	@Test
	public void shouldHave100Health() {
		OrganicDog pet = new OrganicDog("bob", 100, 100, 100, 100, 100);
		int number = pet.getPetHealth();
		assertEquals(100, number);
	}
}