/* Pattern No.12 (Palindromic Number Pyramid)

      1
    2 1 2
  3 2 1 2 3 
4 3 2 1 2 3 4

*/

import java.util.*;
public class Pattern12{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Columns :");
        int n=sc.nextInt();
       

        //Columns--> No. of Lines
        for(int i=1; i<=n; i++){

            // Starting Space
            for(int j=1; j<=(n+1-i); j++){
                System.out.print(" "); // Starting Space

            }

            //Decrease Number till 1
            for(int j=i; j>=1; j--){
                System.out.print(j + " "); // to print number

            }
             // Increasing part---> Starts from 2 as 1 has already printed by above loop
            for(int j=2; j<=i; j++){
                System.out.print(j + " "); // to print number

            }
             
            System.out.println(); // to change line
        }
    }
}
 