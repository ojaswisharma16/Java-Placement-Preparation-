//Program to Split and Store an array into Two Different Array.

import java.util.*;
public class Prob12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);


        int OriginalArray[]= new int[10];
        int FirstArray[]= new int[5];
        int SecondArray[]= new int[5];

        //INput
        System.out.println("Enter All 10 Values: ");
        for(int i=0; i<10; i++){
            OriginalArray[i]=sc.nextInt();
        }
        for(int i=0; i<10; i++){
            if(i<5)
            FirstArray[i]=OriginalArray[i];
            else
            SecondArray[i-5]=OriginalArray[i];
        }
        //Output
        System.out.println("First Array: ");
        for(int i=0; i<5; i++){
            System.out.print(FirstArray[i]+" ");
        }
        System.out.println();
        System.out.println("Second Array: ");
        for(int i=0; i<5; i++){
            System.out.print(SecondArray[i]+" ");
        }
        
    }
    
}
