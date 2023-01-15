/*Program to Find Highest Common Factor(Greatest Common Divisior) of two numbers using Function.
ex.
145= 5x29
130= 2 x 5 x 13
therefore, hcf of 145 and 130 is 5;


if (a>b)----> a=a-b, 
if (b> a)----> b=b-a,
if(a==b)----> return a

145-130=15
130-15=115
115-15= 100
110-15= 85
85-15=70
70-15=55
55-15=40
40-15=25
25-15=10
15-10=5
10-5=5
5-5=0



*/

import java.util.*;
public class func09 {

    static int hcf(int a, int b){
        if(a==b)
        return a;
        if(a>b)
        return hcf(a-b, b);
        else if(b>a)
        return hcf(a, b-a);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b=sc.nextInt();
        System.out.println("The HCF of "+a+" and "+b+" is : "+ hcf(a,b));
    }
    
}
