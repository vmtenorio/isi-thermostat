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
		assertTrue("Falla la asignacion inicial", t.getPartOfDay() == Wake && t.getTemp() == Low);
		t.up();
		assertTrue("Falla e0", t.getPartOfDay() == Wake && t.getTemp() == High);
		t.advance();
		assertTrue("Falla e1", t.getPartOfDay() == Sleep && t.getTemp() == High);
		t.down();
		assertTrue("Falla e2", t.getPartOfDay() == Sleep && t.getTemp() == Low);
		t.advance();
		assertTrue("Falla e3", t.getPartOfDay() == Wake && t.getTemp() == Low);
	}
	
	//Test para e4 -> e7
	@Test
	public void test2() {
		t.advance();
		assertTrue("Falla e4", t.getPartOfDay() == Sleep && t.getTemp() == Low);
		t.up();
		assertTrue("Falla e5", t.getPartOfDay() == Sleep && t.getTemp() == High);
		t.advance();
		assertTrue("Falla e6", t.getPartOfDay() == Wake && t.getTemp() == High);
		t.down();
		assertTrue("Falla e7", t.getPartOfDay() == Wake && t.getTemp() == Low);
	}
	
	//Test para e8 -> e11
	@Test
	public void test3() {
		t.down();
		assertTrue("Falla e8", t.getPartOfDay() == Wake && t.getTemp() == Low);
		t.up();
		t.up();
		assertTrue("Falla e9", t.getPartOfDay() == Wake && t.getTemp() == High);
		t.advance();
		t.up();
		assertTrue("Falla e10", t.getPartOfDay() == Sleep && t.getTemp() == High);
		t.down();
		t.down();
		assertTrue("Falla e11", t.getPartOfDay() == Sleep && t.getTemp() == Low);
	}

}
