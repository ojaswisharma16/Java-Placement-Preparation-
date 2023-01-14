/* Pattern No.08 (Increasing Number Triangle)

1
2 3
4 5 6
7 8 9 10 
11 12 13 14 15

*/

import java.util.*;
public class Pattern08{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Columns :");
        int n= sc.nextInt();

        int num=1; // Declaring Varable to be printed

        //olumns--> No. of lines 
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(num); // to print number
                System.out.print(" "); // to print Space

                num++; // to update number as num=num+1
            }
            System.out.println(); // to change line
        }
    }
}