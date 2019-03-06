package com.joy;

public class Conditions {
    public static void main(String[] args) {
        int age = 16                                                                            ;
        if (age<13 )
        {
            System.out.println("Underage");
        }
        else if (age>= 13 && age<=19)
        {
            System.out.println("Your are a teenager");
        }
        else if (age>= 20 && age<=35)
        {
            System.out.println("Your are a youth");
        }
        else if (age>= 36 && age<=55)
        {
            System.out.println("Your are a middle age");
        }
        else
        {
            System.out.println("Your are a old");
        }
    }
}
