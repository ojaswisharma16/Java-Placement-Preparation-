/* Pattern No.04 (Inverted Left Solid Triangle)

*****
****
***
**
*

*/

import java.util.*;
public class Pattern04{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number of Columns (No. of Lines):");
        int n=sc.nextInt();


       // Columns--> No. of Lines
        for(int i=n; i>=1; i--){
            // Rows --> no. of Stars 
            for(int j=1; j<=i; j++){
                
                System.out.print("*"); // to print Stars

            }
            System.out.println(); // to change line 
        }

    }
}