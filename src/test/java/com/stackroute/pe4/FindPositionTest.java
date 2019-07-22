package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindPositionTest {
    FindPosition findPosition;


    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        this.findPosition = new FindPosition();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        this.findPosition = null;
    }
    //this test method checks for the  occurance of the small string and checks for whether
    //actual result and expected result are equals or not

    @Test
    public void givenInputShouldReturnOccurancePositions() {
        String actualResult = this.findPosition.findPosition("She sells seashells by the seashore", "se");
        String expectedResult = "Founded at:4-6Founded at:10-12Founded at:27-29";
        assertEquals(expectedResult, actualResult);
    }
    //this test method checks whether the smaller string is present or not

    @Test
    public void givenInputShouldReturnNotFound() {
        String actualResult = this.findPosition.findPosition("She sells seashells by the seashore", "ab");
        String expectedResult = "Not Found";
        assertEquals(expectedResult, actualResult);
    }

    //this test method checks for empty string
    @Test
    public void givenEmptyInputShouldReturnToPutNonemptyString() {
        String actualResult = this.findPosition.findPosition("", "se");
        String expectedResult = "Put non empty input";
        assertNotEquals(expectedResult, actualResult);
    }

}