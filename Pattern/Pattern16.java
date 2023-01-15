/* Pattern No.16 (Hollow Rhombus)

    *****
   *   *
  *   *
 *   *
*****

*/

import java.util.*;
public class Pattern16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Rhombus:");
        int n =sc.nextInt();

        //Columns-->Size
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" "); //to print Starting Space
            }

            for(int j=1; j<=n; j++){
                if(j==1|| j==n|| i==1|| i==n)
                System.out.print("*"); // to print stars at boundary of Rhombus
                else
                System.out.print(" "); // to print inner Rhombus Space
            }

            System.out.println(); // to change line
        }

    }
}
