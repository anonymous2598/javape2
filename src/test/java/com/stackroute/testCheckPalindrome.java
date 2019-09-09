package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCheckPalindrome {
    private static CheckPalindrome obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new CheckPalindrome();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }


    @Test
    public void testQ1() {

        assertEquals("Palindrome check failed.",
                true, obj.isAPalindrome(123454321));
        assertNotEquals("Palindrome check failed",false,obj.isAPalindrome(67899876));
        assertNotNull("Null returned",obj.isAPalindrome(1234));
    }
}
