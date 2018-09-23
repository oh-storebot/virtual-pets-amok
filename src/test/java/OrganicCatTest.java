import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicCatTest {

	@Test
	public void shouldCreateNewDog() {
		OrganicCat cat = new OrganicCat("bob", 100, 100, 100, 100);
	}

	@Test
	public void shouldHave100Hunger() {
		OrganicCat cat = new OrganicCat("bob", 100, 100, 100, 100);
		int number = cat.getHungerLevel();
		assertEquals(100, number);
	}

	@Test
	public void shouldHave100Thirst() {
		OrganicCat cat = new OrganicCat("bob", 100, 100, 100, 100);
		int number = cat.getThirstLevel();
		assertEquals(100, number);
	}
	
	@Test
	public void shouldHave100Litterbox() {
		OrganicCat cat = new OrganicCat("bob", 100, 100, 100, 100);
		int number = cat.getLitterboxLevel();
		assertEquals(100, number);
	}
	
	@Test
	public void shouldHave100Health() {
		OrganicDog pet = new OrganicDog("bob", 100, 100, 100, 100, 100);
		int number = pet.getPetHealth();
		assertEquals(100, number);
	}
}
