package com.sai.programs.prep;

import java.util.*;

public class IterateList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");

        Iterator setIte = set.iterator();

        while (setIte.hasNext()){
            System.out.println(setIte.next());
        }

    }

}
