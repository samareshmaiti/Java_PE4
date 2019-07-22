package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortingTest {
    StringSorting stringSorting;


    /* @Before annotation is used on a method containing Java
  code to run before each test case. i.e it runs before each test execution.
  In the setup method ,object of class is declared
  */
    @Before
    void setUp()
    {
        this.stringSorting=new StringSorting();
    }

    /*  @After annotation is used on a method containing java code to run after each test case.
    These methods will run even if any exceptions are thrown in the test case or in the case
    of assertion failures.
    In the tear down method ,object is initialized with null so that obj is destroyed
    */

    @After
    void tearDown()
    {
        this.stringSorting=null;
    }



    @Test
    public void givenStringShouldReturnSortedString() {
        String actualResult=this.stringSorting.sortedString("java is good");
        String expectedResult="aajv is dgoo";
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void givenEmptyStringShouldReturnErrorMessage() {
        String actualResult=this.stringSorting.sortedString("");
        String expectedResult="";
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void givenStringShouldReturnNegativeResult() {
        String actualResult=this.stringSorting.sortedString("java is programing language");
        String expectedResult="aajv is programing aaegglnu";
        assertNotEquals(actualResult,expectedResult);
    }
}