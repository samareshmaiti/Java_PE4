package com.stackroute.pe4;

public class CharacterCount {
    public int countCharacter(String inputString, char inputChar) {
        if (inputString.length() == 0) {
            return 0;
        }
        int numberOfOccurance = 0;
        numberOfOccurance = inputString.length() - inputString.replaceAll(String.valueOf(inputChar), "").length();
        return numberOfOccurance;
    }
}
