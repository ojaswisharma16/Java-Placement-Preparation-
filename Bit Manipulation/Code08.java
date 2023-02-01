//Finding Trailing Zeros(Zeros before first 1) in Binary representation of a Number.
import java.util.*;
public class Code08 {
   static int solve(int A) {
    int count=0;
    while(A%2==0){ // to check last digit 
        A=A>>1;
        count++;
    }
   return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int A=sc.nextInt();

        System.out.println("The NUmber in Binary is: "+ Integer.toBinaryString(A));

       System.out.println("No. of Zeros: "+ solve(A));
    }
    
}
