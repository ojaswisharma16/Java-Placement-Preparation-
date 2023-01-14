/* Pattern No.06 (Number Triangle)

1
12
123
1234
12345

*/

import java.util.*;
public class Pattern06{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Columns(Lines Required): ");
        int n=sc.nextInt();

         //Columns--> Lines Required
         for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j); // to print Numbers 
            }
             System.out.println(); // to change line
         }
    
    }
}