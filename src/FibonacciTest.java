import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public final void test() {

		assertEquals(1, Problema_Fibonacci.funcionr(1));

		assertEquals(1, Problema_Fibonacci.funcionr(2));

		assertEquals(2, Problema_Fibonacci.funcionr(3));

		assertEquals(3, Problema_Fibonacci.funcionr(4));

		assertEquals(5, Problema_Fibonacci.funcionr(5));

		assertEquals(8, Problema_Fibonacci.funcionr(6));

		assertEquals(13, Problema_Fibonacci.funcionr(7));

		assertEquals(21, Problema_Fibonacci.funcionr(8));

		assertEquals(34, Problema_Fibonacci.funcionr(9));

		assertEquals(55, Problema_Fibonacci.funcionr(10));

		assertEquals(89, Problema_Fibonacci.funcionr(11));

		assertEquals(144, Problema_Fibonacci.funcionr(12));

		assertEquals(233, Problema_Fibonacci.funcionr(13));

		assertEquals(377, Problema_Fibonacci.funcionr(14));

		assertEquals(610, Problema_Fibonacci.funcionr(15));

		assertEquals(987, Problema_Fibonacci.funcionr(16));

		assertEquals(1597, Problema_Fibonacci.funcionr(17));

		assertEquals(2584, Problema_Fibonacci.funcionr(18));

		assertEquals(4181, Problema_Fibonacci.funcionr(19));

	}

}
