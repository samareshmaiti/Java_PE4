package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsingMatcherTest {
    UsingMatcher usingMatcher;


    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        this.usingMatcher = new UsingMatcher();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        this.usingMatcher = null;
    }

    @Test
    public void givenInputShouldReturnPositiveOutput() {
        String actualResult = this.usingMatcher.findPosition("She sells seashells by the seashore", "se");
        String expectedResult = "Founded at:4-6Founded at:10-12Founded at:27-29";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenInputShouldReturnNegativeOutput() {
        String actualResult = this.usingMatcher.findPosition("She sells seashells by the seashore", "ab");
        String expectedResult = "Not Found";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenEmptyInputShouldReturnErrorMessage() {
        String actualResult = this.usingMatcher.findPosition("", "se");
        String expectedResult = "Put non empty input";
        assertNotEquals(expectedResult, actualResult);
    }

}