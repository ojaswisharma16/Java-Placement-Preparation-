/*Program to calculate sum of digits of a Number using function. ex.674= 0+4+7+6=17
First iteration
674 % 10 = 4
Sum = 0 + 4 = 4
674 / 10 = 67

Second iteration
67 % 10 = 7
Sum = 4 + 7 = 11
67 / 10 = 6


Third iteration
6 % 10 = 6
Sum = 11 + 6 = 17
6 / 10 = 0

*/

import java.util.*;
public class Prob17 {

    static int sumDigit(int n ){
        int rem=0, sum=0;
       while(n>0)
       { rem=(n % 10);
        sum=sum+rem;
        n= n/10;}
        System.out.println(sum);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        System.out.println("Sum of All Digits Of this Number is: ");
        sumDigit( n );
    }
    
}
