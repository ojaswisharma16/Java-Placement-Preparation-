//Program to Initialise and Print all elements of a 2D Array.

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Prob10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int row= sc.nextInt();
        System.out.println("Enter the Number of Columns: ");
        int col= sc.nextInt();


        int Array[][]= new int[row][col];   // INtitialising 2D array.


        //Input
        System.out.println("You have to Enter total "+(row*col)+" Elements:");
        for(int i=0; i<row; i++){
          System.out.print("Enter "+col +" Elements in "+(i+1)+"th Row: ");
            for(int j=0; j<col; j++){
                Array[i][j]= sc.nextInt();
            }
        }


        //Output
        System.out.println("You have Entered: ");
        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
