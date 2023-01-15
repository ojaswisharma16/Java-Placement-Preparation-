//Program to Enter x and n and printing x raise to the power n.

import java.util.*;
public class func08 {

    static int power(int x, int n){
        int ans=1;
        for(int i=1; i<=n; i++){
            ans=ans*x;
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of X :");
        int x=sc.nextInt();
        System.out.println("Enter Value of n :");
        int n=sc.nextInt();

        System.out.println("Value of "+x+" raise to the power "+n+" is :"+ power(x,n));
        
    }
    
}
