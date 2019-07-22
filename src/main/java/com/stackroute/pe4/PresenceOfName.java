package com.stackroute.pe4;

import java.util.Arrays;

public class PresenceOfName {
    //This method takes two string  as inputs and checks whether the second string input is present in the first string
    //or not also check whether the input is empty or not
    public String findName(String inputString, String name) {
        String resultString = "";
        if (inputString.length() == 0) {
            resultString = "enter non empty input";
        }
        //checking for the occurence of the second string
        Boolean found = Arrays.asList(inputString.split(" ")).contains(name);
        if (found) {
            resultString = "Is Harry here ? true";
        } else
            resultString = "Is Harry here ? false";

        return resultString;
    }
}
