//Program to Calculate Factorial of a Number Using Function

import java.util.*;
public class Factorial {

    static int fact(int n){  // Use static to avoid making class
        if(n==0||n==1)
        return 1;
        else{
            int f=1;
            for(int i=1; i<=n; i++){
                f=f*i;
            }
            return f;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();

        System.out.println("Factorial :"+ fact(n));

    }
    
}
