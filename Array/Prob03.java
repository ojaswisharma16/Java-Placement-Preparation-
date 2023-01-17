//Program to Find Maximum and Minimum from an array using inbuilt Functions 

import java.util.*;
public class Prob03 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Total number of Values:");
        int n=sc.nextInt();

        int Number[]= new int[n];  //Declaring array 

        //Input
        System.out.println("Enter the Values:");
        for(int i=0; i<n; i++){   //base index is always 0 in an array
         Number[i]=sc.nextInt();
        }

        int max=Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;


        //to compare
        for(int i=0; i<n; i++){
            if(Number[i]> max)
            max=Number[i];
            else if(Number[i]< min)
            min=Number[i];
        }

        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
    }

    
}
