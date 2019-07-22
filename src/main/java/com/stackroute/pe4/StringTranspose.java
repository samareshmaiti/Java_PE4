package com.stackroute.pe4;

import java.util.Arrays;

public class StringTranspose {
    public String transposeOfString(String inputString) {
        String result = "";
        inputString = inputString.toLowerCase();
        if (inputString != null) {
            String[] arrayWords = inputString.split(" ");
            String resultString = new String();
            for (int i = 0; i < arrayWords.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(arrayWords[i]);
                sb.reverse();
                arrayWords[i] = sb.toString();
            }
            for (int i = 0; i < arrayWords.length; i++) {
                resultString = resultString.concat((arrayWords[i]) + " ");
                result = resultString.trim();

            }
        } else
            result = null;


        return result;
    }
}
