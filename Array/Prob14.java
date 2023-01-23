//Program to split highest Value of an array into second highest and remaining value.
// 4 8 6 3 2------> highest =8
// 4  6 3 2 ----> high=6
// 4 6 2 6 3 2

import java.util.*;
public class Prob14 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();

        int Array[]= new int[n];
        int SubArray[]= new int[n];

        int highest=Array[0];
     
        int remaining;

        // Input
        System.out.println("Enter All Values: ");
        for(int i=0; i<n; i++){
            Array[i]=sc.nextInt();
        }


        //Finding Highest
        for(int i=1; i<n; i++){
            if(Array[i]>highest)
            highest=Array[i];
        }

        //Creating Sub Array
        for(int i=0; i<n; i++){
            if(Array[i]==highest)
            SubArray[i]=0; 
            else
            SubArray[i]=Array[i]; 
            
            System.out.print(SubArray[i]);
        }

        int secondhighest=SubArray[0];


        //Finding Second Highest----> Highest in Sub Array
        for(int i=1; i<n; i++){

            if(SubArray[i]>secondhighest)
                secondhighest=SubArray[i];
            
           
        }

        remaining=highest-secondhighest;

        System.out.println();
        System.out.println(highest);
        System.out.println(secondhighest);
        System.out.println(remaining);

        

    
         // Output
         System.out.println("The Output is: ");
        for(int i=0; i<n; i++){
            if(Array[i]==highest)
            System.out.print( secondhighest +" "+ remaining+" ");
            else
            System.out.print(Array[i]+" ");

        }




    }
    
}
