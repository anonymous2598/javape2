package com.stackroute;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class testCheckPowerof4 {

    private static CheckPowerof4 obj;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj = new CheckPowerof4();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj = null;

    }
    @Test
    public void testQ2()
    {
        assertEquals("Power 0f 4 check failed",true,obj.isPowerof4(256));
        assertNotEquals("Power of 4 check failed",false,obj.isPowerof4(64));
        assertNotNull("Null returned",obj.isPowerof4(2));
    }
}
