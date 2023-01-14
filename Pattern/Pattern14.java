/* Pattern No. 14 (Solid Diamond)

    *
   ***
  *****
 *******
 *******
  *****
   ***
    *

*/

import java.util.*;
public class Pattern14{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Diamond :");
        int n=sc.nextInt();

        //Upper part
        for(int i=1; i<=n; i++){

            //starting space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // to print stars as (2*i)-1 ---> ex. in line 2 stars=2*2-1=3
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }

            System.out.println(); // to change line
        }

        //Lower part
        for(int i=n; i>=1; i--){

            //to print starting space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // to print stars as (2*i)-1 ---> ex. in line 2 stars=2*2-1=3
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }

            System.out.println(); // to change line
        }

    }
}
