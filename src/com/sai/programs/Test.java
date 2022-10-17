package com.sai.programs;

public class Test {

    public static void main(String[] args) {
        test();
    }

    public static boolean test(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.println(i + " " +j);
                if(j==3){
                    return false;
                }
            }
        }
        return true;
    }

}
