package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class testAggregateMarks {
    private static AggregateMarks obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new AggregateMarks();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }
    @Test
    public void testQ5()
    {
        assertEquals("Average output mismatch",10,obj.min(new int[]{10, 40, 38}));
        assertNotEquals("Output mismatch",30,obj.max(new int[]{30,40,100}));
        assertNotNull("Null returned",obj.avg(new int[]{30,40,50}));
    }
}
