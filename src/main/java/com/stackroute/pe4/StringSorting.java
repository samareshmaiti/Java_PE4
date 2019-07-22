package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting {
    public String sortedString(String inputString) {
        //String result="";
        List<String> list = new ArrayList<String>();
        String[] input = inputString.split(" ");
        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
            sb.append(" ");

        }

        System.out.println(list);
        return sb.toString().trim();
    }
}
