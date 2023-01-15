//Program to do Arithmatic Operations using Function.
import java.util.*;
public class Operation{

    static float sum(float a, float b){    //use static to call function without help of class
        return a+b;
    }
    static float sub(float a, float b){
        return a-b;
    }
    static float mul(float a, float b){
        return a*b;
    }
    static float div(float a, float b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number:");
        float a=sc.nextFloat();
        System.out.println("Enter First Number:");
        float b=sc.nextFloat();
        System.out.println("Sum :"+ sum(a,b));
        System.out.println("Substraction :"+ sub(a,b));
        System.out.println("Multiplication :"+ mul(a,b));
        System.out.println("Division :"+ div(a,b));
    }
    
}
