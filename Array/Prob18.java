/*Program to calculate sum of digits of a Number using recursive function. ex.674= 0+4+7+6=17
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

Recursive function

{
    base condition;
    operation
    call itself
}

*/

import java.util.*;
public class Prob18 {

    static int sumDigit(int n ){
        int rem=0, sum=0;
       if(n==0)
       return 0;
       else
       { rem=(n % 10);
        sum=sum+rem;}
        return sum+sumDigit(n/10);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        System.out.println("Sum of All Digits Of this Number is: ");
        System.out.println(sumDigit(n));
    }
    
}

