/* Pattern No.09 (Binary Number Triangle)

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

import java.util.*;
public class Pattern09{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Columns :");
        int n=sc.nextInt();
        int num=1; // declaring variable to be printed

        //Columns--> No. of lines
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(num); // to print number
                System.out.print(" "); // to print Space
                if(num==0)
                num=num+1; // to change to 1
                else
                num=num-1; // to change to 0
            }
            System.out.println(); // to change line
        }
    }
}