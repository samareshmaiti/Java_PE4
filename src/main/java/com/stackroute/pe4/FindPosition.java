package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPosition {
    //This method is to find the position of the occurance of a small string in a large string
    public String findPosition(String inputString, String subString) {
        String result = "";
        //Using Pattern and Matcher to find a particular matching
        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(inputString);
        boolean matches = matcher.matches();
        int count = 0;
        if (!matcher.find()) {
            return "Not Found";
        }
        while (matcher.find()) {
            count++;
            //find the position of occurence of the small string
            result += "Founded at:"
                    + matcher.start() + "-" + matcher.end();
        }
        return result;
    }
}
