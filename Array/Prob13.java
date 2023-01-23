//Program to Creeate a SubArray lies between index 3 to 8.----> Subarray with 6 elements.


import java.util.*;
public class Prob13 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int Array[]= new int[11];
        int SubArray[]= new int[6];

        System.out.println("Enter the Values: ");
        for(int i=0; i<11; i++){
            Array[i]=sc.nextInt();
        }

        //To Create SubArray
        for(int i=0; i<6; i++){
            SubArray[i]=Array[i+3];
        }

        //Output
        System.out.println("The Sub Array is :");
        for(int i=0; i<6; i++){
            System.out.print(SubArray[i]+ " ");
        }

        

    }
    
}
