import static org.junit.Assert.*;

import org.junit.Test;

public class SquareUnit {

	@Test
	public void test() {
		UnitTesting obj1 = new UnitTesting() ;
		int output_f = obj1.square(9);
		
		assertEquals(81, output_f);
	}

}
