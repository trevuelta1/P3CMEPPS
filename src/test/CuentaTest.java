package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import session3.Cuenta;

class CuentaTest {

	static Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.Ingresar(3000);
		assertEquals(3000, cuenta.getSaldo());
		//fail("Not yet implemented");
	}
	
	@Test
	void testRetirar() {
		cuenta.Retirar(3000);
		assertEquals(-3000, cuenta.getSaldo());
		//fail("Not yet implemented");
	}

}
