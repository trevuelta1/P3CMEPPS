package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import session3.*;

class CuentaTest {

	static Cuenta cuentaI;
	static Cuenta cuentaR;
	static Cuenta cuenta12345;
	static Cuenta cuenta67890;
	static List<Movimiento> movimientosI = new ArrayList<Movimiento>();
	static List<Movimiento> movimientosR = new ArrayList<Movimiento>();
	static List<Movimiento> movimientos12345 = new ArrayList<Movimiento>();
	static List<Movimiento> movimientos67890 = new ArrayList<Movimiento>();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuentaI = new Cuenta(0, movimientosI);
		cuentaR = new Cuenta(4000, movimientosR);
		cuenta12345 = new Cuenta(50, movimientos12345);
		cuenta67890 = new Cuenta(0, movimientos67890);
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
		cuentaI.Ingresar(3000);
		assertEquals(3000, cuentaI.getSaldo());
		//fail("Not yet implemented");
	}
	
	@Test
	void testRetirar() {
		cuentaR.Retirar(3000);
		assertEquals(1000, cuentaR.getSaldo());
		//fail("Not yet implemented");
	}
	
	@Test
	void testCuenta12345() {
		cuenta12345.Retirar(200);
		cuenta12345.Ingresar(100);
		cuenta12345.Retirar(200);
		List<Movimiento> mov = cuenta12345.getMovimientos();
		for(int i = 0; i < mov.size(); i++) {
			System.out.println(mov.get(i).toString());
		}
		assertEquals(150, cuenta12345.getSaldo());
		//fail("Not yet implemented");
	}
	
	@Test
	void testCuenta67890() {
		cuenta67890.Retirar(350);
		cuenta67890.Retirar(150);
		cuenta67890.Ingresar(50);
		List<Movimiento> mov = cuenta67890.getMovimientos();
		for(int i = 0; i < mov.size(); i++) {
			System.out.println(mov.get(i).toString());
		}
		assertEquals(50, cuenta67890.getSaldo());
		//fail("Not yet implemented");
	}

}
