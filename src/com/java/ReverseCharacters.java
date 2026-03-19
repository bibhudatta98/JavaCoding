package com.java;

import java.util.*;

 class ReverseCharacters {

    public static void main(String[] args){
        String a;
        a="ICE";
        List<Character> op= new ArrayList<>();
        for (int i = a.length()-1;i>=0;i--){
            op.add(a.charAt(i));
        }
        System.out.println(op);
    }
}
