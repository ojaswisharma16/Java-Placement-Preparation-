//Program to Check if a Number is even or Not.

import java.util.*;
public class Even {

    static int checkeven(int n){
        if(n%2==0)
        System.out.println("It is an Even Number.");
        else
        System.out.println("It is an Odd Number.");

        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int n=sc.nextInt();
        checkeven(n);
    }
    
}
