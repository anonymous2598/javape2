package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class testFactorial {
    private static Factorial obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new Factorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }
    @Test
    public void testFact()
    {
        assertEquals("Out of range!",false,obj.FactIntMax(13));
        assertNotEquals("Out of range!",false,obj.FactIntMax(10));
        assertNotEquals("Out of long range",true,obj.FactLongMax(21));
    }
}
