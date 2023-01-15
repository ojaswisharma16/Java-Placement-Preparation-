//Program to Check if a Number is Prime or Not Using Function.

import java.util.*;
public class Prime {

    static int checkprime(int n){

        int count=0;

      for(int i=2; i<n; i++){
        if(n%i==0){
            count=count+1;
        }
      }

      if(count==0)
       System.out.println("It is a Prime Number.");
       else
       System.out.println("It is NOT a Prime Number.");

       return 0;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
         checkprime(n);

    }
    
}
