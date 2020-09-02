package integration;

import static org.junit.Assert.*;

import org.junit.Test;

import integrationclass.IntegrationClass;

public class IntegrationClassIT {

	@Test
	public void test() {
		IntegrationClass integrationClass = new IntegrationClass();
		assertEquals("HOLA INTEGRADORES", integrationClass.printMessage());
	}

}
