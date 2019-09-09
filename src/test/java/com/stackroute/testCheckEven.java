package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class testCheckEven {
    private static CheckEven obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new CheckEven();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }
    @Test
    public void testQ4()
    {
        assertEquals("Even check failed",true,obj.isEven(24));
        assertNotNull("Null returned",obj.isEven(77));
        assertNotEquals("Even check failed",true,obj.isEven(25));
    }
}
