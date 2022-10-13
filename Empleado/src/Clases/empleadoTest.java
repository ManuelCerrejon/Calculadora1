package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class empleadoTest {

	enum TipoEmpleado{vendedor, encargado};
	Clases.empleado.TipoEmpleado tipo;
	float ventaMes;
	float horaExtra;
	float nominaBruta;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
	void testCalculoNominaBrutaVendedor_1100_10() {
		//fail("Not yet implemented");
		tipo = tipo.vendedor;
		ventaMes=1100;
		horaExtra=10;
		
		float expected = 2400;
		float actual = empleado.calculoNominaBruta (tipo, ventaMes, horaExtra);
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	void testCalculoNominaBrutaVendedor_1100_0() {
		//fail("Not yet implemented");
		tipo = tipo.vendedor;
		ventaMes=1100;
		horaExtra=0;
		
		float expected = 2100;
		float actual = empleado.calculoNominaBruta (tipo, ventaMes, horaExtra);
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	void testCalculoNominaBrutaVendedor_1600_10() {
		//fail("Not yet implemented");
		tipo = tipo.vendedor;
		ventaMes=1100;
		horaExtra=10;
		
		float expected = 2500;
		float actual = empleado.calculoNominaBruta (tipo, ventaMes, horaExtra);
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	void testCalculoNominaBrutaVendedor_1600_0() {
		//fail("Not yet implemented");
		tipo = tipo.vendedor;
		ventaMes=1100;
		horaExtra=0;
		
		float expected = 2200;
		float actual = empleado.calculoNominaBruta (tipo, ventaMes, horaExtra);
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	void testCalculoNominaBrutaEncargado_1100_10() {
		//fail("Not yet implemented");
		tipo = tipo.encargado;
		ventaMes=1100;
		horaExtra=10;
		
		float expected = 2900;
		float actual = empleado.calculoNominaBruta (tipo, ventaMes, horaExtra);
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	void testCalculoNominaBrutaEncargado_1100_0() {
		//fail("Not yet implemented");
		tipo = tipo.encargado;
		ventaMes=1100;
		horaExtra=0;
		
		float expected = 2600;
		float actual = empleado.calculoNominaBruta (tipo, ventaMes, horaExtra);
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	void testCalculoNominaBrutaEncargado_1600_10() {
		//fail("Not yet implemented");
		tipo = tipo.encargado;
		ventaMes=1100;
		horaExtra=10;
		
		float expected = 2900;
		float actual = empleado.calculoNominaBruta (tipo, ventaMes, horaExtra);
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	void testCalculoNominaBrutaEncargado_1600_0() {
		//fail("Not yet implemented");
		tipo = tipo.encargado;
		ventaMes=1100;
		horaExtra=0;
		
		float expected = 2800;
		float actual = empleado.calculoNominaBruta (tipo, ventaMes, horaExtra);
		assertEquals(actual, expected);
		
		
	}

	@Test
	void testCalculoNominaNetaTramo_0() {
		//fail("Not yet implemented");
		nominaBruta=2000;
		
		float expected = 2000;
		float actual = empleado.calculoNominaNeta(nominaBruta);
		assertEquals(actual, expected);
		
	}
	
	@Test
	void testCalculoNominaNetaTramo_15() {
		//fail("Not yet implemented");
		nominaBruta=2200;
		
		float expected = 1870;
		float actual = empleado.calculoNominaNeta(nominaBruta);
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	void testCalculoNominaNetaTramo_18() {
		//fail("Not yet implemented");
		nominaBruta=2600;
		
		float expected = 2132;
		float actual = empleado.calculoNominaNeta(nominaBruta);
		assertEquals(actual, expected);
		
		
	}

}
