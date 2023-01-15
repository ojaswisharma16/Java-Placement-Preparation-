//Program to check if a Person is Eligiable to Vote or Not.

import java.util.*;
public class func05 {

    static int checkforvote(int age){
        if(age>=18)
        System.out.println("You are Eligible to Vote.");
        else
        System.out.println("You are NOT Eligible to Vote.");
        return 0;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age= sc.nextInt();
        checkforvote(age);

    }
    
}
