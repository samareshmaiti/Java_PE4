package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UsingMatcher {
    public String findPosition(String inputString, String subString) {
        String result = "";
        Pattern pattern = Pattern.compile(subString);
        Matcher matcher = pattern.matcher(inputString);
        boolean matches = matcher.matches();
        int count = 0;
        if (!matcher.find()) {
            return "Not Found";
        }
        while (matcher.find()) {
            count++;
            result += "Founded at:"
                    + matcher.start() + "-" + matcher.end();
        }
        return result;
    }
}
