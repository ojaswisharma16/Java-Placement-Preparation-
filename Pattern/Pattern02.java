/* Pattern No.02:(Hollow Rectangle)

*****
*   *
*   *
*****

*/

import java.util.*;
public class Pattern02{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int m= sc.nextInt();
        System.out.println("Enter Number of Columns:");
        int n= sc.nextInt();

       // Columns--> No. of lines
       for(int i=1; i<=n; i++){

        // Rows --> No. of Stars in a line 
        for(int j=1; j<=m; j++){
            if(i==1 || i==n || j==1 || j==m)
            System.out.print("*"); // to print Star
            else
             System.out.print(" "); //to print Space 
        }
         System.out.println(); // to Change line
       }

    }
}