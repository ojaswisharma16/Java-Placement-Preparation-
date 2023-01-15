//Program to Calculate Area and Circumference of a Circle using Function.

import java.util.*;
public class func04 {

    static float circumference(float r){
        final float pi= 3.14F;
        return 2*pi*r;   //Circumference of Circle= 2*pi*Radius.

    }
    static float area(float r){
        final float pi= 3.14F;
        return pi*r*r;   //Area of Circle= pi*Radius*Radius;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle : ");
        float r=sc.nextFloat();

        System.out.println("Circumference :"+ circumference(r));
        System.out.println("Area :"+ area(r));
    }
    
}
