package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CharacterCountTest {

    CharacterCount characterCount;
    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */

    @Before
    public void setUp() {
        this.characterCount = new CharacterCount();

    }
    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        this.characterCount = null;
    }

    //this test method checks for the number of occurance of the given character and checks for correct result
    @Test
    public void givenStringShouldReturnNumberOfOccurance() {

        int actualResult = this.characterCount.countCharacter("java ia java", 'a');
        int expectedResult = 5;
        assertEquals(actualResult, actualResult);

    }

    //this test method checks for the number of occurance of the given character and checks for whether
    //actual result and expected result are equals or not
    @Test
    public void givenStringShouldReturnOccuranceOfCharacter() {
        int actualResult = this.characterCount.countCharacter("java ia java", 'b');
        int expectedResult = 3;
        assertNotEquals(expectedResult, actualResult);

    }

    //this test method for checking for empty input string
    @Test
    public void givenEmptyStringShouldReturnZero() {
        int actualResult = this.characterCount.countCharacter(" ", 'b');
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);

    }


}
