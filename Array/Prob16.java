/*Program to Check if a Matrix is Symmentric or Not.
*/
import java.util.*;
public class Prob16{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Size of an array:");
        int n=sc.nextInt();

        int Array[][]=new int[3][3];
        boolean isSymmetric=true;

        //Input
        System.out.println("Enter Values:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                Array[i][j]=sc.nextInt();
           }
           System.out.println();

        }

        //Printing Matrix
        System.out.println("Entered Matrix is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(Array[i][j]+" ");
           }
           System.out.println();

        }

        //Comparing
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(Array[i][j]!=Array[j][i])
                isSymmetric=false;
           }

        }

        if(isSymmetric)
        System.out.println("Matrix is Symmetric.");
        else
        System.out.println("Matrix is NOT Symmetric.");
    }
    
}
