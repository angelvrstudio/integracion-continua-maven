package unit;

import static org.junit.Assert.*;

import org.junit.Test;

import unitclass.UnitClass;

public class UnitClassTest {

	@Test
	public void test() {
		UnitClass unitClass = new UnitClass();
		assertEquals("HOLA UNITARIOS", unitClass.printMessage());
	}

}
