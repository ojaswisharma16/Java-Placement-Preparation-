//Program to Create a 2D Array by taking Input From the User.
import java.util.*;
public class Prog01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Columns : ");
        int col=sc.nextInt();
        System.out.println("Enter Number of Rows : ");
        int row=sc.nextInt();

        int Array[][]= new int[row][col];


        //Input
        System.out.println("Total "+row*col+" Elements ! ");
        for(int i=0; i<row; i++){
            System.out.println("Enter " +col+" Elements in "+i+1+" th Row : ");
            for(int j=0; j<col; j++){
                Array[i][j]=sc.nextInt();
            }
        }


        //output
         System.out.println("Entered Matrix is : ");
         for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
