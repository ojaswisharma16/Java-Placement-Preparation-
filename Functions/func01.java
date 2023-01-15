//Program to  Calculate Average of Three Numbers using function.

import java.util.*;
public class func01 {

    static float average(float a, float b, float c){
        return ( (a+b+c)/3);   // Average=(sum of values)/no.of Values.
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        float a= sc.nextFloat();
        System.out.println("Enter Second Number: ");
        float b= sc.nextFloat();
        System.out.println("Enter Third Number: ");
        float c= sc.nextFloat();
       System.out.println("Average: " + average(a,b,c)); 
    }
    
}
