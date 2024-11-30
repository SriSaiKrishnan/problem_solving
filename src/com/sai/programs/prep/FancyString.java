package com.sai.programs.prep;

/*

A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".

Example 2:

Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".

 */

public class FancyString {

    public static void main(String[] args) {
        fancyString("leeetcode");
    }

    private static void fancyString(String s) {

        String fancy = "";
        int cntr = 0;
        char[] ch = s.toCharArray();
        for (int i=0; i<ch.length-1;i++){
            if(ch[i]==ch[i+1] && cntr<2) {
                fancy += ch[i];
                cntr++;
            }
            else if(cntr>=2) {
                if(i == ch.length-2)
                    continue;
                cntr = 0;
                continue;
            }
            else
                fancy += ch[i];
        }

        if(cntr<2)
            fancy += ch[ch.length-1];

        System.out.println(fancy);

    }
}
