package com.stackroute.pe4;

public class ReplaceCharacter {
    public String characterReplace(String inputString, char firstChar, char secondChar) {
        if (inputString.length() == 0) {
            return null;
        }
        inputString = inputString.replace('d', 'f');
        inputString = inputString.replace('l', 't');
        return inputString;
    }
}
