package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNotEquals;

public class testUser {
    private static User obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new User();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }
    @Test
    public void testQ7(){
        assertEquals("Output returned is different","a b",obj.getFullName());
        assertNotNull("Null returned",obj.getFullName());
        assertNotEquals("Output returned is different","b c",obj.getFullName());
    }
}

