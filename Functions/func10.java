//Program to create Fibonacci Series.(0 1 1 2 3 5 8 13......)

import java.util.*;
public class func10 {

    static int fibonacci(int n){
        int a=0, b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i=1; i<=(n-2); i++){
           c=a+b;
          System.out.print(c+" ");
          a=b;
          b=c;
        }
        return 0;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of terms to be printed : ");
        int n=sc.nextInt();
        System.out.println("The Fibonacci Series is: ");
        fibonacci(n);
    }
    
}
