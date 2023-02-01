/* Program to Count Number of 1's in  Binary Representation of the Number.
 1101
 &  1
    1
    count=1;
1101
 1100
 1100
 n&(n-1)
 */
import java.util.*;
public class Code06 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n=sc.nextInt();

        System.out.println("The Number in Binary is: "+Integer.toBinaryString(n));

        //Count 1's:
        int count=0;
        while(n>0){
            n=n&(n-1);  // this operation will run only == number of 1's;
            count++;

        }

        System.out.println("Total Number of 1's are:"+count);
    }
    
}
