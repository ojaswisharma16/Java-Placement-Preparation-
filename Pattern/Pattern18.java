/* Pattern No.18 (Inverted Half Number Pyramid)

1111
222
33
4

*/

import java.util.*;
public class Pattern18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Columns:");
        int n= sc.nextInt();

        //Column--> no.of lines
        for(int i=1; i<=n; i++){

            for(int j=n; j>=(i); j--){
                System.out.print(i); //to print Number
            }
            System.out.println();  //to change line
        }
    }
    
}
