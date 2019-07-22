package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose;

    /* @Before annotation is used on a method containing Java
 code to run before each test case. i.e it runs before each test execution.
 In the setup method ,object of class is declared
 */
    @Before
    public void setUp() {
        this.stringTranspose = new StringTranspose();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        this.stringTranspose = null;
    }

    //this test method shows the tranpose of the given string
    @Test
    public void givenStringShouldReturnTransposeString() {
        String actualResult = this.stringTranspose.transposeOfString("a quick brown fox jumps over the lazy dog");
        String expectedResult = "a kciuq nworb xof spmuj revo eht yzal god";
        assertEquals(actualResult, expectedResult);
    }

    //this test method checks for the empty input string and return empty string
    @Test
    public void givenEmptyStringShouldReturnEmptyString() {
        String actualResult = this.stringTranspose.transposeOfString("");
        String expectedResult = "";
        assertEquals(actualResult, expectedResult);
    }

    //this test method checks whether actual result and expected result are equal or not
    @Test
    public void givenStringShouldReturnNotEqual() {
        String actualResult = this.stringTranspose.transposeOfString("samaresh maiti");
        String expectedResult = "";
        assertNotEquals(actualResult, expectedResult);
    }

}