// Program to Check Elements from an array are same from front and back or NOT.
import java.util.*;
public class Prob11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements: ");
        int n=sc.nextInt();

        int array[]= new int[n];
        boolean isSame=true;

        //Input
        System.out.println("Enter the Values :");
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }

        //Comparasion
        for(int i=0; i<n; i++){
            if(array[i]!=array[n-1-i])
            isSame= false;

        }


        if(isSame)
        System.out.println("This Array is Same from Front and Back.");
        else
        System.out.println("This Array is NOT Same from Front and Back.");
    }
    
}
