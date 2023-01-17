// Program to Find the Maximum and Minimun Number in an array.

import java.util.*;

public class Prob02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Total Number of Values:");
        int n=sc.nextInt();
        int Number[]= new int[n];  

        int max= Number[0];
        int min= Number[0];
        

      

        //Input
        System.out.println("Enter the Numbers :");
        for(int i=0; i<n; i++){
            Number[i]=sc.nextInt();
        }
        
        //Comparision
        for(int i=1; i<n; i++){
            if(Number[i]> max)     
            max=Number[i];
            
            else if(Number[i]< min)      
            min=Number[i];
            
           
            

        }
        System.out.println("Maximum: "+ max);
        System.out.println("Minimum: "+ min);

    }
    
}
