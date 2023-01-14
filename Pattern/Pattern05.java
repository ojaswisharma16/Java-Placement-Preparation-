/* Pattern No.05 (Right Solid Triangle )

    *
   **
  ***
 ****
*****

*/

import java.util.*;
public class Pattern05{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Columns(Lines Required) : ");
        int n= sc.nextInt();

        // Columns ---> No. of Lines
        for(int i=1; i<=n; i++){

            for(int j=1; j<=(n-i) ;j++){
                System.out.print(" "); // To print Space

            }
             for(int j=1; j<=i;j++){
                System.out.print("*"); // to print Stars

            }
             System.out.println(); // to change line

        }
    }
}