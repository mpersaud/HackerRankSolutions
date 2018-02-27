package com.mike.ArrayandString;

import java.util.ArrayList;
import java.util.List;

public class Array {

    static String[] textJustification(String[] words, int l) {
        List<String> lines = new ArrayList<>();
        List<String > tokens = new ArrayList<>();
        int idx =0;
        int wordSize=0;
        while (idx < words.length) {
            while (idx <words.length && wordSize + words[idx].length() < l) {
                wordSize += words[idx].length() + 1;
                tokens.add(words[idx]);
                idx++;
            }
            int spaceSize = l -(wordSize - tokens.size());
            int n = tokens.size() -1;
            StringBuilder sb = new StringBuilder();
            if(tokens.size()==1) {

                sb.append(tokens.remove(0));
                while(sb.length()!=l){
                    sb.append(" ");
                }
                lines.add(sb.toString());
                tokens.clear();
                wordSize = 0;
                sb.setLength(0);

            }else {
                int spaceInterval = spaceSize / n;
                int rem = spaceSize % n;

                for (String s : tokens) {
                    sb.append(s);
                    for (int i = 0; i < spaceInterval; i++) {
                        sb.append(" ");
                    }
                    if (rem != 0) {
                        sb.append(" ");
                        rem--;
                    }
                }
                lines.add(sb.toString().trim());
                tokens.clear();
                wordSize = 0;
                sb.setLength(0);
            }

        }
        for(String str : lines){
            System.out.println(str);
            System.out.println(str.length());
        }
        return lines.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String [] arr = {"This", "is", "an", "example", "of", "text", "justification."};
        String [] a=textJustification(arr,16);

    }

}
