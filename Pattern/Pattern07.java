/* Pattern No.07 (Inverted Number Triangle)

12345
1234
123
12
1

*/

import java.util.*;
public class Pattern07{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Columns: ");
        int n= sc.nextInt();

        //Columns--> No.of Lines
        for(int i=n; i>=1; i--){

            for(int j=1; j<=i; j++){
                System.out.print(j); // to print numbers
            }
            System.out.println(); // to change line
        }
    }
}