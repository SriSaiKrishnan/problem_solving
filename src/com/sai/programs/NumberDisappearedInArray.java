package com.sai.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberDisappearedInArray {

    public static void main(String[] args) {
        int arr[] = {1,1,3,1};
        numberDisappearedInArray(arr);
    }

    private static void numberDisappearedInArray(int[] arr) {

        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++ ){
            if(!search(arr,i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static boolean search(int arr[], int target){
        int index = 0;
        boolean flag = false;
        int pivot = arr.length/2;
        Arrays.sort(arr);
        if(arr[pivot]==target){
            index = target;
            flag = true;
        }else{
            if(arr[pivot]<=target)
            {
                for (int i =pivot+1; i<arr.length; i++){
                    if(arr[i] == target) {
                        index =  i;
                        flag = true;
                        break;
                    }
                }
            } else {
                for (int i = 0; i <=pivot; i++) {
                    if (arr[i] == target) {
                        index =  i;
                        flag = true;
                        break;
                    }
                }
            }
        }
        return flag;
    }

}
