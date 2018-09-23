import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotPetsTest {

	@Test
	public void shouldCreateNewDog() {
		RobotPets giskard = new RobotPets("bob", 100);
	}

	@Test
	public void shouldHave100Oil() {
		RobotPets giskard = new RobotPets("bob", 100);
		int number = giskard.getOilLevel();
		assertEquals(100, number);
	}
}
