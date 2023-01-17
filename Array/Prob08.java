//Program to Copy Elements of an Array to another array in Reverse Order.

import java.util.*;
public class Prob08 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int Array[]=new int[10];         //Original Array
        int ReverseArray[]=new int[10];   //Array in in which original array stored in reverse order.

        //Input
        System.out.println("Enter the values:");
        for(int i=0; i<10; i++){
            Array[i]=sc.nextInt();
        }
        System.out.println("Loading......");
        System.out.println("Original Array is:");
        for(int i=0; i<10; i++){
            System.out.print(Array[i]+ " ");
        }
        System.out.println();


        System.out.println("Reversed Array is:");
        for(int i=0; i<10; i++){
           ReverseArray[i]=Array[9-i];
           System.out.print(ReverseArray[i]+ " ");
        }


       /*  System.out.println("Reversed Array is:");
        for(int i=9; i>=0; i--){
            System.out.print(Array[i]+ " ");
        }
        */

    }
    
}
