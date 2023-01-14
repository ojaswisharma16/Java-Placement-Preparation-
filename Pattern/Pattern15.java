/* Pattern No.15 (Hollow Butterfly)

*      *
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
*      *


*/

import java.util.*;
public class Pattern15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Butterfly:");
        int n=sc.nextInt();

        //Upper Part
        for(int i=1; i<=n; i++){

            //Left upper part
            for(int j=1; j<=n; j++){
                if(j==1||j==i)
              System.out.print("*");  // to print star at j==1 or/ and j==i
              else
               System.out.print(" ");  // to print space Between (inner butterfly)
            }

             //Space between right and left upper part
            for(int j=1; j<=(2*(n-i)); j++){
              System.out.print(" ");  
            }

            //Right upper part
            for(int j=1; j<=i; j++){
              if(j==1||j==i)
              System.out.print("*"); // to print star at j==1 or/ and j==i
              else
               System.out.print(" ");  // to print space Between (inner butterfly)
            }

            System.out.println(); // to change line
        }

        //Lower Part
        for(int i=n; i>=1; i--){

            //Left lower part
            for(int j=1; j<=n; j++){
                if(j==1||j==i)
              System.out.print("*");  // to print star at j==1 or/ and j==i
              else
               System.out.print(" ");  // to print space Between (inner butterfly)
            }

             //Space between right and left lower part
            for(int j=1; j<=(2*(n-i)); j++){
              System.out.print(" ");  
            }

            //Right lower part
            for(int j=1; j<=i; j++){
              if(j==1||j==i)
              System.out.print("*"); // to print star at j==1 or/ and j==i
              else
               System.out.print(" ");  // to print space Between (inner butterfly)
            }
            System.out.println(); // to change line
        }
    }
}