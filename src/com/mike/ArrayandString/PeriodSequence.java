package com.mike.ArrayandString;

import java.util.HashMap;
import java.util.Map;

class PeriodSequence {

    static int periodicSequence(int s0, int a, int b, int m) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(s0,1);
        int prevS= s0;
        int newS =0;
        boolean found =false;
        while(!found){
            newS = (a*prevS+b)%m;
            if(map.containsKey(newS))
                return map.get(newS);
            for(int i: map.keySet()){
                map.replace(i,map.get(i)+1);
            }
            map.put(newS,1);
            prevS=newS;
        }
        return 0;
    }
    public static void main(String[] args) {
        //test case
        System.out.println(periodicSequence(1,2,6,12));
        //test case
        System.out.println(periodicSequence(1,2,3,5));

    }
}
