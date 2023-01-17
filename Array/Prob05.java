//Program to check if an array is Sorted in ascending order using boolean Dataype.

import java.util.*;
public class Prob05 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n=sc.nextInt();

        boolean isSorted= true;   //Defining boolean datatype as true---> Consider as Array is already Sorted.

        int Array[]= new int[n];  //Declaring array

        //Input
        System.out.println("Enter the Values:");
        for(int i=0; i<n; i++){
            Array[i]=sc.nextInt();
        }
    
        //Check
        for(int i=1; i<n; i++){
            if(Array[i]<Array[i-1])
            isSorted=false;
        }

        if(isSorted)
        System.out.println("Sorted in Ascending order.");
        else
        System.out.println("NOT Sorted in Ascending Order.");



    }
    
}
