package com.joy;


import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("John");
        names.add("Joseph");
        names.add("Mary");
        names.add("Mary");
        names.add("Mary");

        System.out.println(names.get(1));
        names.remove(2);
        System.out.println( names.size() );
        names.clear();
        System.out.println( names.size() );

        Functions.areaCircle(98);
    }
}
