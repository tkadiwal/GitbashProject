package Suits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test() {
		Addition myObj2 = new Addition() ;
		int output_a = addition.adition(10,10);
		assertEquals(20, output_a);
		
	}

}
