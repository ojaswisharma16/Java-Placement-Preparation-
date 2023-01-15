// Program to Enter Numbers and at end give total positive, negatives and zeros.

import java.util.*;
public class func07 {

   
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int pos=0, neg=0, zer=0;
        int choice;

        do{
            System.out.println("Enter the Numbers: ");
            float n=sc.nextFloat();

        if(n>0)
        pos++;
        else if(n<0)
        neg++;
        else 
        zer++;

        System.out.println("Do you want to Enter More Numbers?(y/n) as (1/0):");
         choice= sc.nextInt();


        }while(choice==1);

        System.out.println("Total Positive Numbers are :"+ pos);
        System.out.println("Total Negative Numbers are :"+ neg);
        System.out.println("Total Zeros are :"+ zer);


    }
    
}
