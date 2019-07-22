package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter replaceCharacter;

    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        this.replaceCharacter = new ReplaceCharacter();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        this.replaceCharacter = null;
    }

    @Test
    public void givenStringShouldReturnSameInputString() {

        String actualResult = this.replaceCharacter.characterReplace("java is java", 'd', 'l');
        String expectedResult = "java is java";
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void givenStringShouldReturnPositiveResult() {

        String actualResult = this.replaceCharacter.characterReplace("daily dry", 'd', 'l');
        String expectedResult = "faity fry";
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void givenEmptyStringShouldReturnErrorMessage() {

        String actualResult = this.replaceCharacter.characterReplace("", 'd', 'l');
        String expectedResult = "";
        assertNotEquals(expectedResult, actualResult);

    }

}