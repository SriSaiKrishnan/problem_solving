package com.sai.programs.prep;

/*

Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.

Example 1:

Input: s = "lEeTcOdE"
Output: "E"
Explanation:
The letter 'E' is the only letter to appear in both lower and upper case.
Example 2:

Input: s = "arRAzFif"
Output: "R"
Explanation:
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.

 */

import java.util.Arrays;

public class GreatestLetter {

    public static void main(String[] args) {
        String s = "AbCdEfGhIjK";
        greatestLetter(s);
    }

    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    private static void greatestLetter(String s) {
        String lowerChar = "";
        String upperChar = "";
        String great = "";
        char []c = s.toCharArray();
       for(char ch : c){
           int val = (int)ch;
           if(val>64 && val<91)
               upperChar += ch;
           else if(val>96 && val<123)
               lowerChar += ch;
       }

        upperChar = sortString(upperChar);

        for(int i=0; i<upperChar.length(); i++){
            lowerChar = lowerChar.toUpperCase();
            if(lowerChar.contains(upperChar.substring(i,i+1)))
                great = upperChar.substring(i,i+1);
        }

        System.out.println(great);

    }

}
