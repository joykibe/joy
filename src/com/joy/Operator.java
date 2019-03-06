package com.joy;

public class Operator {
    public static void main(String[] args) {
        //-+/*
        // comparison > < >= <= ==
        //and or
        System.out.println(10 + 20);
        String fname = "John";
        String lname ="Mark";
        int age = 19;
        String full_name = fname + " " +  lname + " " +age;
        System.out.println(full_name);
        System.out.println(10/(double)3);

        //casting
        int z = 10;
        System.out.println( (double)z );

        int k = (int)10.99;
        System.out.println(k);

        System.out.println(10 > 20);
        System.out.println(10 <= 20);
        System.out.println( 10 == 10.0);
        int j = 10;
        double h = 10.0;
        System.out.println(j == h);
        String name = "Mary";
        String jina ="mary";
        System.out.println(name == jina); //wrong way
        System.out.println( name.equals(jina) );
        System.out.println(name.equalsIgnoreCase(jina));

        System.out.println(1000 % 44); //modules(remainders)

        //and
        System.out.println( 100> 20 && "jina".equals("jina"));
        System.out.println( 100> 20 || "jina".equals("jina"));
        System.out.println(10 != 20);

        System.out.println( ! "Kenya".equals("kenya"));
    }
}
