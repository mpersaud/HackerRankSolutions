package com.mike.ArrayandString;

import java.util.ArrayList;
import java.util.List;

public class Array {

    static String[] textJustification(String[] words, int l) {
        //This    is    an
        List<String> w = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int wordCount = 0;
        int charCount = 0;
        int idx = 0;

        while (idx <words.length){
            while (idx< words.length && charCount+ words[idx].length()+1 <= l ) {
                List<String> tokens = new ArrayList<>();
                tokens.add(words[idx]);
                sb.append(words[idx]+" ");
                idx++;
                charCount = sb.length();
                wordCount++;
            }
            if(wordCount!=1){

            }
            String s = sb.toString().replaceAll("\\s","");
            //System.out.println(s.length());
            int space = (l-s.length())/(wordCount-1);
            int rem = (l-s.length())%(wordCount-1);
            System.out.println(space);
            System.out.println("rem:"+rem);
            charCount=0;

            //System.out.println(sb.toString().trim());
            w.add(sb.toString());
            sb.setLength(0);
        }


        return words;
    }

    public static void main(String[] args) {

        String [] arr = {"This", "is", "an", "example", "of", "text", "justification."};
        textJustification(arr,16);
    }

}
