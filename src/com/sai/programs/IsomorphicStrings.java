package com.sai.programs;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String str1 = "badc";
        String str2 = "baba";
        System.out.println(isomorphicStrings(str1,str2));
    }

    private static boolean isomorphicStrings(String s, String t) {

        boolean flag = true;

        Map<Character, Character> mp = new HashMap<>();

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();

        for(int i=0; i<ch1.length; i++){
            if(!mp.containsKey(ch1[i]) && (!mp.containsValue(ch2[i]))){
                mp.put(ch1[i],ch2[i]);
            }
            else if(mp.containsKey(ch1[i]) && (mp.get(ch1[i])==ch2[i])){
                continue;
            }
            else
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
