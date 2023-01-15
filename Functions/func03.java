//Program to Check The Greater Number using function

import java.util.*;
public class func03 {


    static float greater(float a, float b){
        if(a>b)
        return a;
        else
        return b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number :");
        float a=sc.nextFloat();
        System.out.println("Enter Second Number :");
        float b=sc.nextFloat();

        System.out.println("Greater Number is :"+ greater(a,b));
    }
    
}
