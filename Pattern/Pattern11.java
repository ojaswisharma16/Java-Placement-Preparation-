/* Pattern No.11 (Number Pyramid)

    1
   2 2
  3 3 3
 4 4 4 4 
5 5 5 5 5 

*/

import java.util.*;
public class Pattern11{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Columns :");
        int n=sc.nextInt();
        
        //Columns---> No. of lines
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" "); // Starting Space
            }

            for(int j=1; j<=i; j++){
                System.out.print(i); // to print Numbers
                System.out.print(" "); // to print space between numbers

            }

            System.out.println(); // to change line
            }
        
    }
}