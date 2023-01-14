/* Pattern No.10 (Solid Rhombus)---> Rhombus is a square(Whose all sides are equal) with no Right angle.

     *****
    *****
   *****
  *****
 *****

 */

 import java.util.*;
 public class Pattern10{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Stars :");
        int n= sc.nextInt();

        //Columns-->No. of lines/ Stars
        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" "); // to print Space
               
            }
             for(int j=1; j<=n; j++){
                
                System.out.print("*"); // to print star
            }
            System.out.println(); // to change line
        }
    }
 }