package com.sai.programs;

public class AddString {

    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "123";

        addString(str1, str2);
    }

    private static String addString(String num1, String num2) {

        if(num1==null || num1.isEmpty()){
            return num2;
        }
        if(num2==null || num2.isEmpty()){
            return num1;
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int carry = 0;
        int c1;
        int c2;
        StringBuilder answer = new StringBuilder();
        while(len1>0 || len2>0 || carry > 0){
            c1 = len1-- > 0 ? num1.charAt(len1) - '0': 0;
            c2 = len2-- > 0 ? num2.charAt(len2) - '0': 0;
            int sum = carry + c1 + c2;
            carry = sum/10;
            answer.insert(0, sum % 10);
        }

        return answer.toString();



    }
}
