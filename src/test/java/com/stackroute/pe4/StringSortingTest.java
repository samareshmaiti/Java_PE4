package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StringSortingTest {
    StringSorting stringSorting;


    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    public void setUp() {
        this.stringSorting = new StringSorting();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    public void tearDown() {
        this.stringSorting = null;
    }

    //this test method sotrd the words of the given string
    @Test
    public void givenStringShouldReturnSortedString() {
        String actualResult = this.stringSorting.sortedString("java is good");
        String expectedResult = "good is java";
        assertEquals(expectedResult, actualResult);
    }

    //this test method is checks for empty string
    @Test
    public void givenEmptyStringShouldReturnEmptyMessage() {
        String actualResult = this.stringSorting.sortedString("");
        String expectedResult = "";
        assertEquals(expectedResult, actualResult);
    }

    //this test method checks whether the expected result and actual result are equal
    @Test
    public void givenStringShouldReturnExpectedAndActualResultsAreNotEqual() {
        String actualResult = this.stringSorting.sortedString("java is programing language");
        String expectedResult = "aajv is programing aaegglnu";
        assertNotEquals(expectedResult, actualResult);
    }
}