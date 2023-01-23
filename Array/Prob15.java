/*Program to Rotate an Array into given turns. 

Clokwise Rotation:
ex. a[]=1 2 3 4 5 6, turn =2, arr[]=3 4 5 6 1 2 -----> 

1. a[x]to a[n] 
2. a[0]to a[x]

AntiClokwise Rotation:
ex. a[]=1 2 3 4 5 6, turn =2, arr[]= 5 6 1 2 3 4 ----->

1. a[n-x] to a[n]
2. a[0] to a[x]

*/

import java.util.*;
public class Prob15 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Size of an array:");
        int n=sc.nextInt();

        int Array[]=new int[n];

        //Input
        System.out.println("Enter Values:");
        for(int i=0; i<n; i++){
            Array[i]=sc.nextInt();

        }

        System.out.println("Enter Number of Turns:");
        int x=sc.nextInt();

       //Clokwise Rotation:
       System.out.println("ClockWise Rotation: ");   //1. a[x]to a[n]  2. a[0]to a[x]

        for(int i=x; i<n; i++){
             System.out.print(Array[i]+" ");
         }
         for(int i=0; i<x; i++){
            System.out.print(Array[i]+" ");
        }
         System.out.println();

         //AntiClock Wise Rotation:
         System.out.println("AntiClockWise Rotation: ");  //1. a[n-x] to a[n]    2. a[0] to a[n-x]
         for(int i=(n-x); i<n; i++){
            System.out.print(Array[i]+" ");
        }
        for(int i=0; i<(n-x); i++){
           System.out.print(Array[i]+" ");
       }



    }
    
}
