
package com.mule.demo.ws;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareRootServiceImplTest {
	
	private int testNr = 9;

    @Test
    public void testGetSquareRoot() {
        SquareRootServiceImpl squareRootServiceImpl = new SquareRootServiceImpl();
        Double expected = java.lang.Math.sqrt(testNr);
        Double actual = squareRootServiceImpl.getSquareRoot(testNr);
        assertEquals("SquareRootServiceImpl not properly calculating square root of " +testNr, expected, actual);
    }
}
