//Program to Find if a NUmber is Power of 2 or NOT. ---2^0=1, 2^1=10; 2^2=100;
// for 2 ki power 1 to infinity we get an even number means last bit==0;
// to check last bit 101 &1==1 / 100&1==0;
import java.util.*;
public class Code05 {
    public static boolean isPowerofTwo(long n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if((n%2)!=0)
            return false;
            n=n/2;
        }
       return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
 
        if(isPowerofTwo(n))
        System.out.println(" Yes! The Number is Power of 2.");
        else
        System.out.println(" No! The Number is NOT Power of 2.");
    }
        
    }
    
