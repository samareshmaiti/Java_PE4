package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class PresenceOfNameTest {
    PresenceOfName presenceOfName;


    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        this.presenceOfName = new PresenceOfName();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        this.presenceOfName = null;
    }
    //this test method checks for whether the name is present and return true as output


    @Test
    public void giverProperInputShouldReturnTrueMessage() {

        String actualResult = this.presenceOfName.findName(" This is Harry", "Harry");
        String expectedResult = "Is Harry here ? true";
        assertEquals(expectedResult, actualResult);
    }
    //this test method checks for whether the name is present and if not return false as output

    @Test
    public void giverInputShouldReturnFalseMessage() {

        String actualResult = this.presenceOfName.findName(" This is Henry", "Harry");
        String expectedResult = "Is Harry here ? false";
        assertEquals(expectedResult, actualResult);
    }
    //this test method checks for whether the checked string is empty or not

    @Test
    public void giverEmptyInputShouldReturnToEnterNonemptyInput() {

        String actualResult = this.presenceOfName.findName(" ", "Harry");
        String expectedResult = "enter non empty input";
        assertNotEquals(expectedResult, actualResult);
    }


}