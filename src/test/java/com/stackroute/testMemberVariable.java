package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class testMemberVariable {
    private static MemberVariable obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new MemberVariable();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }
    @Test
    public void testQ3MemberVariable()
    {
        assertEquals("Output mismatch", new String[]{"Harry Potter","30","2500.3"},obj.checkmMethod());
        assertNotNull("Null returned",obj.checkmMethod());
        assertNotEquals("Output Mismatch",
                new String[]{""}, obj.checkmMethod());
    }
}
