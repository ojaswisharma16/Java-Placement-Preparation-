// Program to Check if a Number is Present in the Inserted Array or Not.

import java.util.*;
public class Prob06 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        

        int Array[]= new int[10];  //Declaring an Array of Size 10
        int num=0;

        //Input Array Elements
        System.out.println("Enter the Values:");
        for(int i=0; i<10; i++){
            Array[i]=sc.nextInt();
        }
        //Input Value to be Searched
        System.out.println("Enter Value to be Searched:");
        int x=sc.nextInt();
        

        //Searching
        System.out.println("Searching Starts.....");
        for(int i=0; i<10; i++){
           if(Array[i]==x)
           num=num+1;
           
        }
        if(num==0)
        System.out.println("Oops! Element Not Found!:(");
         else
        System.out.println("Hurray! Element found!:)");

    }
    
}
