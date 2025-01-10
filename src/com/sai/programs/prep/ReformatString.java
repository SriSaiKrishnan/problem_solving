package com.sai.programs.prep;

import java.util.LinkedList;
import java.util.List;

public class ReformatString {

    public static void main(String[] args) {
        String s = "covid2019";
        System.out.println(reformat(s));
    }

    private static String reformat(String s) {
        String reformat = "";
       char ch[] = s.toCharArray();
       List<String> digit = new LinkedList<>();
       List<String> charac = new LinkedList<>();

       for (char c  : ch){
           if((int)c > 96)
               charac.add(""+c);
           else
               digit.add(""+c);
       }

        if(digit.size() == charac.size() || digit.size() == charac.size()-1 || digit.size()-1 == charac.size()){
            int pivot = digit.size()>charac.size()?digit.size():charac.size();
            for(int i =0; i<pivot; i++){
                if(charac.size()>digit.size()){
                    if(i<charac.size())
                        reformat += charac.get(i);
                    if(i<digit.size())
                        reformat += digit.get(i);
                }else{
                    if(i<digit.size())
                        reformat += digit.get(i);
                    if(i<charac.size())
                        reformat += charac.get(i);
                }

            }
        }
        else {
            reformat = "";
        }

        return reformat;

    }

}
