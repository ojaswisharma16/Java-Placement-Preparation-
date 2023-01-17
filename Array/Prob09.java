//Program to find Sum and Product of all elements of an array

import java.util.*;
public class Prob09 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n=sc.nextInt();

        int sum=0, prod=1;

        int Array[]= new int[n]; //Declaring array

        //Input
        System.out.println("Enter All the Values: ");
        for(int i=0; i<n; i++){
            Array[i]=sc.nextInt();
        }

        //Calculation
        for(int i=0; i<n; i++){
            sum=sum+Array[i];
            prod= prod*Array[i];
        }

        System.out.println("Sum of all Elements of this array is: "+ sum);
        System.out.println("Product of all Elements of this array is: "+ prod);
    }
    
}
