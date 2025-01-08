package com.sai.programs.prep;

/*

Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

Example 1:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
Example 2:

Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
Example 3:

Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

 */

public class CountDigits {

    public static void main(String[] args) {
        int num = 121;
        System.out.println(countDigits(num));
    }

    private static int countDigits(int num) {

        int count = 0;
        int n = num;
        while(n>0){
            int rem = n % 10;
            if(num % rem == 0)
                count++;
            n = n / 10;
        }
        return count;

    }

}
