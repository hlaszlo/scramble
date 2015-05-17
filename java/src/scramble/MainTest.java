//Hornyak Laszlo
package scramble;

import static org.junit.Assert.*;

import org.junit.Test;

public class maintest {
	
	main tester = new main();
	
	@Test
	public void testScramble() 
	{
	    assertEquals("hawhgiy", tester.scramble("highway"));
	}
	
	@Test
	public void testCheck() 
	{
		 boolean ans = true;
	    assertEquals(ans, tester.check("!"));
	}

	@Test
	public void testIsNum() 
	{
		boolean ans = true;
	    assertEquals(ans, tester.isNum("2"));
	}
	
	@Test
	public void testReverse() 
	{
		String[] test = {"a","b","c"};
		String[] ans = {"c","b","a"};
		assertEquals(ans, tester.reverse(test));
	}
	
	@Test
	public void testConvert() 
	{
		String[] test = {"a","b","c"};
		String ans = "abc";
		assertEquals(ans, tester.convert(test));
	}
	
}