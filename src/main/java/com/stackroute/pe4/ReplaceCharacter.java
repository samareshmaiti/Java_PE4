package com.stackroute.pe4;

public class ReplaceCharacter {
    //THis method replace the two character d as f and l as t
    public String characterReplace(String inputString, char firstChar, char secondChar) {
        if (inputString.length() == 0) {
            return null;
        }
        //replacin the characters
        inputString = inputString.replace('d', 'f');
        inputString = inputString.replace('l', 't');
        return inputString;
    }
}
