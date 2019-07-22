package com.stackroute.pe4;

import java.util.Arrays;

public class PresenceOfName {
    public String findName(String inputString, String name) {
        String resultString = "";
        if (inputString.length() == 0) {
            resultString = "enter non empty input";
        }

        Boolean found = Arrays.asList(inputString.split(" ")).contains(name);
        if (found) {
            resultString = "Is Harry here ? true";
        } else
            resultString = "Is Harry here ? false";

        return resultString;
    }
}
