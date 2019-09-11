package uvu.cs.cs3250.inclass.generic;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

import uvu.cs.cs3250.inclass.SumUtil;

public class SumUtilTest {
	@Test
	public void testInteger() throws Exception {
		Integer a1 = 13;
		Integer a2 = 5; 
		Integer a3 = 10;
		
		assertEquals(28, SumUtil.sum(a1, a2, a3).intValue());
	}
	
	@Test
	public void testBigInteger() throws Exception {
		BigInteger a1 = BigInteger.TWO;
		BigInteger a2 = BigInteger.TEN;
		BigInteger a3 = BigInteger.valueOf(100L);
		
		assertEquals(112, SumUtil.sum(a1, a2, a3).intValue());
	}
	
	@Test(expected=Exception.class )
	public void testString() throws Exception {
		String a1 = "Hello";
		String a2 = "World";
		
		SumUtil.sum(a1, a2);
	}
}
