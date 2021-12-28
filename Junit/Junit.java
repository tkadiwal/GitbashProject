package Junit;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.after;
import org.junit.before;
import org.junit.test;

public class Junit {
	@Test
	public void test_Junit() {
		System.out.println("Let's check this string ");
		String str1 = "Let's check this string ";
		assertEquals("Let's check this string ", str1);
		
	}
	
}
