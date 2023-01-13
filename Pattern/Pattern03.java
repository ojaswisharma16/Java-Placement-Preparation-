/* Pattern No.03 (Left solid Triangle)

*
**
***
****

*/

import java.util.*;
public class Pattern03{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Number of Columns (Lines in a Triangle):");
        int n= sc.nextInt();

        // Columns--> No. of Lines
        for(int i=1; i<=n; i++){
           // Rows--> No. of Stars (Here No. of Stars==Column No.)
            for(int j=1; j<=i; j++){
                System.out.print("*"); // to print Star
            }
             System.out.println(); // to Change line
        }
    }
}