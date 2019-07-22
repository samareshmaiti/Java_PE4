package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CharacterCountTest {

    CharacterCount characterCount;

    @Before
    public void setUp() {
        this.characterCount = new CharacterCount();

    }

    @After
    public void tearDown() {
        this.characterCount = null;
    }

    @Test
    public void givenStringShouldReturnPositiveResult() {

        int actualResult = this.characterCount.countCharacter("java ia java", 'a');
        int expectedResult = 5;
        assertEquals(actualResult, actualResult);

    }

    @Test
    public void givenStringShouldReturnNegativeResult() {
        int actualResult = this.characterCount.countCharacter("java ia java", 'b');
        int expectedResult = 3;
        assertNotEquals(expectedResult, actualResult);

    }

    @Test
    public void givenEmptyStringShouldReturnErrorMessage() {
        int actualResult = this.characterCount.countCharacter(" ", 'b');
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void givenStringShouldReturnNumberOfParticularCharacter() {
        int actualResult = this.characterCount.countCharacter("java ia java", 'j');
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);

    }
}
