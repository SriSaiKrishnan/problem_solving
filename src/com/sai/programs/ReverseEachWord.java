package com.sai.programs;

public class ReverseEachWord {

    public static void main(String[] args) {
        String word = "This is test";
        //Output = sihT si tset
        reverseEachWord(word);
    }

    private static void reverseEachWord(String word) {

        String str[] = word.split(" ");
        String s = "";

        for(int i=0; i<str.length; i++){
            for(int j=str[i].length()-1; j>=0; j--){
                s = s + str[i].charAt(j);
            }
            s = s + " ";
        }

        System.out.println(s);

    }
}