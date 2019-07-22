package com.stackroute.pe4;

import java.util.Arrays;

public class StringTranspose {
    //This method returns a string by making the transpose of the given string
    public String transposeOfString(String inputString) {
        String result = "";
        //making the input string to lowercase
        inputString = inputString.toLowerCase();
        if (inputString != null) {
            //splitting the input string by space and store them in a array
            String[] arrayWords = inputString.split(" ");
            String resultString = new String();
            for (int i = 0; i < arrayWords.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(arrayWords[i]);
                sb.reverse();
                arrayWords[i] = sb.toString();
            }

            for (int i = 0; i < arrayWords.length; i++) {
                //making the array elements to a string
                resultString = resultString.concat((arrayWords[i]) + " ");
                result = resultString.trim();

            }
        } else
            result = null;


        return result;
    }
}
