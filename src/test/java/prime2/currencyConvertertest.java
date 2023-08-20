package prime2;

import org.junit.jupiter.api.Test;
//import prime2.currencyConverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class currencyConvertertest {
	private currencyConverter curr;

	@BeforeEach
	public void setup() {
		System.out.println("s etting up calculator instance for each test");
		curr = new currencyConverter();
	}

	@BeforeAll
	public static void setupall() {
		System.out.print("initialzing calculatortest class");
	}

	@AfterAll
	public static void teardownall() {
		System.out.print("cleaning up calculator test class");
	}

	@AfterEach
	public void teardown() {
		System.out.println("clening up calculator instance after each test ");
		curr = null;
	}

	@Test
	public void testconvertusd1() {
		System.out.println("test 1");
		double rse = curr.convert(10, "USD", "USD");
		Assertions.assertEquals(10, rse, "the convert must be 10.0");
	}

	@Test
	public void testconvertusd2() {
		System.out.println("test 2");
		double rse = curr.convert(10, "USD", "EUR");
		Assertions.assertEquals(9.185, rse, "the convert must be 9.185");
	}

	@Test
	public void testconvertusd3() {
		System.out.println("test 3");
		double rse = curr.convert(1, "USD", "ILS");
		Assertions.assertEquals(3.627, rse, "the convert must be 36.27");
	}

	@Test
	public void testconvertusd4() {
		System.out.println("test 4");
		double rse = curr.convert(-1, "USD", "USD");
		Assertions.assertEquals(-1, rse, "the convert must be -1");
	}

	@Test
	public void testconvertusd5() {
		System.out.println("test 5");
		double rse = curr.convert(0, "USD", "USD");
		Assertions.assertEquals(0, rse, "the convert must be 0");
	}

	@Test
	public void testconvertEUR1() {
		System.out.println("test 5");
		double rse = curr.convert(10, "EUR", "USD");
		Assertions.assertEquals(10.887, rse, "the convert must be 10.887");
	}

	@Test
	public void testconvertEUR2() {
		System.out.println("test 6");
		double rse = curr.convert(1, "EUR", "ILS");
		Assertions.assertEquals(3.9483, rse, "the convert must be 3.9483");
	}

	@Test
	public void testconvertEUR3() {
		System.out.println("test 7");
		double rse = curr.convert(10, "EUR", "EUR");
		Assertions.assertEquals(10, rse, "the convert must be 10.0");
	}

	@Test
	public void testconvertEUR4() {
		System.out.println("test 8");
		double rse = curr.convert(-1, "EUR", "USD");
		Assertions.assertEquals(-1, rse, "the convert must be -1");
	}

	@Test
	public void testconvertEUR5() {
		System.out.println("test 9");
		double rse = curr.convert(0, "EUR", "USD");
		Assertions.assertEquals(0, rse, "the convert must be 0");
	}

	@Test
	public void testconvertILS1() {
		System.out.println("test 10");
		double rse = curr.convert(10, "ILS", "ILS");
		Assertions.assertEquals(10, rse, "the convert must be 10");
	}

	@Test
	public void testconvertILS2() {
		System.out.println("test 10");
		double rse = curr.convert(10, "ILS", "USD");
		Assertions.assertEquals(2.757, rse, "the convert must be 2.757");
	}

	@Test
	public void testconvertILS3() {
		System.out.println("test 11");
		double rse = curr.convert(1, "ILS", "EUR");
		Assertions.assertEquals(0.2533, rse, "the convert must be 0.2533");
	}

	@Test
	public void testconvertILS4() {
		System.out.println("test 14");
		double rse = curr.convert(0, "ILS", "EUR");
		Assertions.assertEquals(0, rse, "the convert must be 0");
	}

	@Test
	public void testconvertILS5() {
		System.out.println("test 10");
		double rse = curr.convert(-1, "ILS", "ILS");
		Assertions.assertEquals(-1, rse, "the convert must be -1");
	}

}
