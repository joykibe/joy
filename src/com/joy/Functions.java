package com.joy;

public class Functions {

    protected   double VolumeSphere(double radius){
        double volume =22/7 * Math.pow(radius,3) *4/3.0;
        return volume;

    }

    public static double areaCircle(double radius){
      double area= 22/7.0 * radius * radius;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {
       //objects == variables
        Functions f =new Functions();
        System.out.println( f.VolumeSphere(9));
        double v = f.VolumeSphere(44);
        Functions.areaCircle(8);



        /*areaCircle(7);
        areaCircle(9.2);
        areaCircle(846.25);

        double result = areaCircle(63.669);
        System.out.println(Math.round(result));
        System.out.println(result * 45);
        */

    }
}
