// Program to make a menu that uses do-while loop
import java.util.*;
public class MenuDriven{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int n;

        do{
            System.out.println("Enter the Marks:");
            int marks= sc.nextInt();
            
            if (marks>=90)
             System.out.println("This is Good");
            else if (marks<=89 && marks>=60)
             System.out.println("This is also Good");
            else if (marks<=59 && marks>=0)
             System.out.println("This is Good as Well");
            else
            System.out.println("Marks don't matter but our efforts does.");

             System.out.println("You Can Enter either 1 or 0. Enter your choice:");
             n= sc.nextInt();

        }while(n==1);

       

    }
}