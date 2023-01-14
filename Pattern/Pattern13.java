/* Pattern No.13 (Solid Butterfly)

*      *
**    **    
***  ***
********
********
***  ***
**    **
*      *

*/

import java.util.*;
public class Pattern13{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Butterfly :");
        int n=sc.nextInt();

        //Upper part
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print("*"); // to print left upper triangle
            }
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" ");   // to print Space between
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");  // to print right  upper triangle
            }


            System.out.println(); // to change line 
            
        }

        //Lower part
         for(int i=n; i>=1; i--){

            for(int j=1; j<=i; j++){
                System.out.print("*"); // to print left inverted triangle
            }
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" "); // to print Space between
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"); // to print Right Inverted Triangle
            }


            System.out.println(); // to change line 
            
        }
    }
}