/* Pattern no.01:(Solid Rectangle.)

*****
*****
*****
*****

*/

import java.util.*;
public class Pattern01{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int m= sc.nextInt();
        System.out.println("Enter Number of Columns:");
        int n= sc.nextInt();

        //Columns-->total lines
        for(int i=1; i<=n; i++){

            //Rows---> No. of Stars
            for(int j=1; j<=m; j++){
               System.out.print("*"); 
            
        }
        System.out.println(); // line Change

        }

    }
}