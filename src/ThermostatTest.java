import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ThermostatTest {

	Thermostat t;
	
	@Before
	public void setUp() throws Exception {
		t = new Thermostat();
	}

	// Test para e0 -> e3
	@Test
	public void test1() {
		t.up();
		assertTrue("Falla e0", t.getPartOfDay() == Wake && t.getTemp() == High);
		t.advance();
		assertTrue("Falla e1", t.getPartOfDay() == Sleep && t.getTemp() == High);
		t.down();
		assertTrue("Falla e2", t.getPartOfDay() == Sleep && t.getTemp() == Low);
		t.advance();
		assertTrue("Falla e3", t.getPartOfDay() == Wake && t.getTemp() == High);
	}

}
