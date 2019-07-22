package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting {
    //This method sorts the words of a sentence or paragraph alphabatically
    public String sortedString(String inputString) {
        //Declare the arraylist
        List<String> list = new ArrayList<String>();
        //split the paragraph or sentence and store in a array
        String[] input = inputString.split(" ");
        //adding the array elements to the list
        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }
        //sorting the list elements
        Collections.sort(list);
        //append list elements to StringBuilder
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
            sb.append(" ");

        }

        System.out.println(list);
        return sb.toString().trim();
    }
}
