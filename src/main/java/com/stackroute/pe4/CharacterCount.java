package com.stackroute.pe4;

public class CharacterCount {
    //This method takes a string and a character as inputs and checks the numbers of occorence of the character in the
    //taken string.
    public int countCharacter(String inputString, char inputChar) {
        if (inputString.length() == 0) {
            return 0;
        }
        //finding the number of occurance of the given character in the string
        int numberOfOccurance = 0;
        numberOfOccurance = inputString.length() - inputString.replaceAll(String.valueOf(inputChar), "").length();
        return numberOfOccurance;
    }
}
