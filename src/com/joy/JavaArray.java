package com.joy;

public class JavaArray {
    public static void main(String[] args) {
        int marks[] ={78,56,45,56,55,58,56,85};

        //immutable
        String names[] = {"Kim" ,"Kariuki","Karuri","Kuria"};
        System.out.println(marks[0]);

        try {
            System.out.println(names [10]);
        }
        catch (Exception e)
        {
            System.out.println("Error while fetching the name");
        }

        System.out.println(12345);


    }
}
