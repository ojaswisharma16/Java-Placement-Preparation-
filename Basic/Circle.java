// Program to print calculate Perimeter and Area of Circle by Inserted Radius

import java.util.*;
class Circle{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius:");
        int r= sc.nextInt();
        // Constant
        final float PI= 3.14F;
        // Perimeter
       float  p = 2*PI*r;
        //Area
        float a= PI*PI*r;

       System.out.println("Perimeter: "+ p);
       System.out.println("Area :"+ a);
       
    }
}